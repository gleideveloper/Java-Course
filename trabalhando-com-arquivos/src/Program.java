import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("trabalhando-com-arquivos/in.txt");
        Scanner sc = null;
        try {
            sc =  new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
