package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }


    public ChessPiece performChessMove(ChessPosition source, ChessPosition target){
        Position mSource =  source.toPosition();
        Position mTarget = target.toPosition();
        validateSourcePosition(mSource);
        Piece capturePiece = makeMove(mSource,mTarget);
        return (ChessPiece) capturePiece;
    }

    private Piece makeMove(Position mSource, Position mTarget) {
        Piece mPiece = board.removePiece(mSource);
        Piece capturePiece = board.removePiece(mTarget);
        board.placePiece(mPiece, mTarget);
        return capturePiece;
    }

    private void validateSourcePosition(Position mSource) {
        if(board.thereIsAPiece(mSource)){
            throw new ChessException("There is no piece on source position");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('B', 6, new Rook(board, Color.WHITE));
        placeNewPiece('H', 1, new Rook(board, Color.WHITE));
        placeNewPiece('A', 1, new King(board, Color.WHITE));

        placeNewPiece('A', 8, new Rook(board, Color.BLACK));
        placeNewPiece('H', 8, new Rook(board, Color.BLACK));
        placeNewPiece('E', 8, new King(board, Color.BLACK));

    }
}
