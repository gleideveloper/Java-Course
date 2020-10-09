import java.io.*;

public class Program {
    public static void main(String[] args) {
//        usingBufferedReaderFileReader();
        usingBufferedWriterFileWriter();
    }

    private static void usingBufferedReaderFileReader() {
        String path = "trabalhando-com-arquivos/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingBufferedWriterFileWriter(){
        String[] lines = new String[]{"Good Norming","Good Afternoon","Good night"};
        String path = "trabalhando-com-arquivos/out.txt";
        //append = true -> indica que o arquivo nao vai ser recriado
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
