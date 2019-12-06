package problem3;

import java.text.DecimalFormat;

public class Problem3 {

    public static void main(String[] args) {
        int gradesArray[][]
                = {
                    {56, 38, 38, 88, 52, 42},
                    {85, 35, 91, 94, 60, 47},
                    {78, 62, 70, 42, 93, 65},
                    {33, 75, 82, 45, 73, 83},
                    {60, 80, 71, 82, 73, 38},
                    {80, 55, 48, 59, 36, 80},
                    {30, 91, 79, 81, 61, 61},
                    {47, 54, 68, 64, 73, 65},
                    {32, 54, 84, 52, 64, 80},
                    {82, 82, 39, 65, 48, 41},
                    {65, 81, 81, 38, 93, 86},
                    {44, 74, 64, 61, 58, 77},
                    {31, 31, 44, 93, 52, 94}
                };
        int studentnumber = 0;
        int testnumber = 0;
        System.out.println("Name           Test 1  Test 2  Test 3  Test 4  Test 5  Test 6  Average");
        System.out.println("-------------  ------  ------  ------  ------  ------  ------  -------");
        while (studentnumber < 13) {
            if (studentnumber < 9) {
                System.out.println("Student " + (studentnumber + 1) + "          " + createline(gradesArray[studentnumber]) + studenta(gradesArray, studentnumber));
                studentnumber++;
            } else {
                System.out.println("Student " + (studentnumber + 1) + "         " + createline(gradesArray[studentnumber]) + studenta(gradesArray, studentnumber));
                studentnumber++;
            }

        }
        System.out.print("\nTest Average     ");
        while (testnumber < 6) {
            System.out.print(testa(gradesArray, testnumber));
            System.out.print("    ");
            testnumber++;
        }
        System.out.println("\n\nClass Average: " + classa(gradesArray));

    }

    public static String studenta(int marks[][], int student) {
        double calculator = 0;
        int test = 0;
        for (int i = 0; i < 6; i++) {
            calculator += marks[student][test];
            test++;
        }
        calculator = calculator / 6;
        DecimalFormat format = new DecimalFormat("##.00");
        String calculatorF = format.format(calculator);
        return calculatorF;
    }

    public static String testa(int marks[][], int test) {
        double calculator = 0;
        for (int student = 0; student < 13; student++) {
            calculator += marks[student][test];
        }

        calculator = calculator / 13;
        DecimalFormat format = new DecimalFormat("##.0");
        String calculatorF = format.format(calculator);
        return calculatorF;
    }


    public static String classa(int students[][]){
        double calculator = 0;
        for (int[] student : students) {
            for (int mark : student){
                calculator += mark;
            }
        }
        calculator = calculator/78;
        DecimalFormat format = new DecimalFormat("##.0");
        String calculatorF = format.format(calculator);
        return calculatorF;
    }
    
        
    public static String createline(int marks[]){
        StringBuilder s1 = new StringBuilder();
        for (int marknumber = 0; marknumber < marks.length; marknumber++){
            s1.append(marks[marknumber]);
            s1.append("      ");
            
        }
        StringBuilder f = new StringBuilder();
        String s2 = s1.toString();
        s2 = s2.trim();
        f.append(s2);
        f.append("    ");
        return f.toString();
    }
    
}

