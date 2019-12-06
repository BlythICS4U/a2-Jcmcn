package problem4;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem4 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter printwriter = null;
        try {
            br = new BufferedReader(new FileReader("myTextWindows.txt"));
            String contentLine = br.readLine();
            int linecount = 0;
            String content = " ";
            while (contentLine != null) {
                content += contentLine + " ";
                contentLine = br.readLine();
                linecount++;
            }
            StringTokenizer words = new StringTokenizer(content);
            File dataFile = new File("myTextData.txt");
            
            FileWriter filewriter = new FileWriter(dataFile);
            printwriter = new PrintWriter(filewriter);
            
            
            
            printwriter.println("The file \"myTextWindows.txt\" was successfully read.");
            printwriter.println("Number of words:     " + words.countTokens());
            printwriter.println("Number of lines:     " + linecount);
            int wordcount = words.countTokens();
            int bigwords = 0;
            double worda = 0;
            String bigword = "";
            while (words.hasMoreTokens()) {
                String s1 = words.nextToken();
                int wordsize = s1.length();
                if (wordsize > bigwords) {
                    bigwords = wordsize;
                    bigword = s1;
                }
                worda += wordsize;
            }
            printwriter.println("Longest word:        " + bigword);
            printwriter.println("Longest word length: " + bigwords);
            printwriter.printf("Average word length: %.1f\n", worda / wordcount);
        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                
                if (printwriter != null) {
                    printwriter.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
    }
}
