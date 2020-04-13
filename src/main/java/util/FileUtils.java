package util;

import java.io.*;

public class FileUtils {
    public static void createFile(String nameFile)throws IOException {
        File file =new File(nameFile);
        file.createNewFile();
    }
    public static void clearFile(String nameFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(nameFile);
        PrintWriter pw = new PrintWriter(fos);
        pw.close();
        fos.close();
    }
}
