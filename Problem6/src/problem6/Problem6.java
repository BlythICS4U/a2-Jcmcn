package problem6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Problem6 {

    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            System.out.println("Reading Binary File...");
            File file = new File("myMatrices.bin");
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            int[][] matrix1 = (int[][]) ois.readObject();
            int[][] matrix2 = (int[][]) ois.readObject();
            System.out.println("The product of the 2 arrays is:");
            System.out.println(Arrays.deepToString(multiplyMatrices(matrix1, matrix2)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        } catch (FileNotFoundException ex) {
            System.out.println("Exception occurred: ");
            ex.printStackTrace(System.out);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Exception occurred:");
            ex.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ioe) {
                System.out.println("Exception occurred:");
                ioe.printStackTrace(System.out);
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }
}
    



