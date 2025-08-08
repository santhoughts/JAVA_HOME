package InterviewPrepration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\Interview\\ReadFile.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Sanjeev ");
        bf.write("Kumar ");
        bf.write("Yadav ");

        System.out.println("Finished!!!!");

        bf.close();

    }
}
