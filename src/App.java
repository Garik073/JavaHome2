import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четное число:  " );
        int n = in.nextInt();
        System.out.println("Введите первый символ с1: " );
        char c1 = in.next().charAt(0);
        System.out.println("Введите второй символ с2: " );
        char c2 = in.next().charAt(0);
        StringBuilder  s = new StringBuilder(n);
        s.setLength(n);
        for (int i = 0; i < n / 2  ; i++)
        {
              s.setCharAt(2 * i, c1);
              s.setCharAt(2 * i + 1, c2);
        }
        System.out.println(s.toString());
        NewRecord();
    }

    private static void NewRecord() throws IOException{
        System.out.println(File.separator);
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        
        String text = "TEXT \n";
        text =text.repeat(100);
        
        byte [] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        
    }
}
