package problem5;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem5 {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Teacher data Windows.txt"));
            System.out.println("Reading the file using readLine() method:");
            String contentLine = br.readLine();
            String[][] teacherData = new String[50][3];
            int vertical = 0;
            while (contentLine != null) {
                int horizontal = 0;
                StringTokenizer contents = new StringTokenizer(contentLine);
                while (contents.hasMoreTokens()) {
                    teacherData[vertical][horizontal] = contents.nextToken();
                    horizontal++;
                }
                vertical++;
                contentLine = br.readLine();
            }
            double years = 0;
            double numberteachers = 0;
            for (String[] teacherData1 : teacherData) {
                String course = teacherData1[1];
                switch (course) {
                    case "math":
                    case "tech":
                    case "science":
                        years += Integer.parseInt(teacherData1[2]);
                        numberteachers++;
                        break;
                }
            }
            System.out.printf("The average number of years of teaching experience among teachers who have math, science or tech as their subject area is:  %.1f\n", years / numberteachers);
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
