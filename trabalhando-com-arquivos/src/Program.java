import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        int x =-17;
//        int y = 17;
//        int z = 29;
//
//
//        for (int i = 3; i <= 7; i++) {
//            x = x + 3 * i;
//            y = x + z;
//            z = z - 2 * i;
//        }
//        System.out.println("Resposta: x = " + x);
//        System.out.println("Resposta: y = " + y);
//        System.out.println("Resposta: z = " + z);
//        handleFolderFiles();
//        usingBufferedWriterFileWriter();
//        usingBufferedReaderFileReader();
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

    private static void usingBufferedWriterFileWriter() {
        String[] lines = new String[]{"Good Norming", "Good Afternoon", "Good night"};
        String path = "trabalhando-com-arquivos/out.txt";
        //append = true -> indica que o arquivo nao vai ser recriado
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleFolderFiles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully");
        sc.close();
    }
}
