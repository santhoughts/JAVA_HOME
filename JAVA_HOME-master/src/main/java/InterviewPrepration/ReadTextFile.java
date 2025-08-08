package InterviewPrepration;

import java.io.*;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws IOException {

//        FileReader fr = new FileReader("D:\\Interview\\ReadFile.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        String str;
//        while (str == br.readLine())! = null)
//        {
//            System.out.println(str);
//        }
//
//        br.close();

        // Second Approach
        File file =new File("D:\\Interview\\ReadFile.txt");
        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine())
//        {
//            System.out.println(sc.hasNextLine());
//        }

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
