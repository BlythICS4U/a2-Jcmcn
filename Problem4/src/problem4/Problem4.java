package problem4;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem4 {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("myTextWindows.txt"));
            System.out.println("Reading the file using readLine() method:");
            String contentLine = br.readLine();
            int linecount = 0;
            String content = " ";
            while (contentLine != null) {
                content += contentLine + " ";
                contentLine = br.readLine();
                linecount++;
            }
            StringTokenizer words = new StringTokenizer(content);
            System.out.println(content);
            System.out.println("The file \"myTextWindows.txt\" was successfully read.");
            System.out.println("Number of words:     " + words.countTokens());
            System.out.println("Number of lines:     " + linecount);
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
            System.out.println("Longest word:        " + bigword);
            System.out.println("Longest word length: " + bigwords);
            System.out.printf("Average word length: %.1f\n", worda / wordcount);
        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
    }
}
