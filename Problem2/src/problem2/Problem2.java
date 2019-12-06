package problem2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder();
        System.out.println("Enter a number");
        int size = input.nextInt();
        boolean[] primes = new boolean[size + 1];
        Arrays.fill(primes, true);
        int divider = 2;
        int result;
        for (int i = 2; i < primes.length; i++) {
            int add = 0;
            if (primes[divider] == true) {
                for (int e = 2; e < primes.length; e++) {
                    result = (divider + add) % divider;
                    if (result == 0 && divider + add != divider && divider + add < primes.length) {
                        primes[divider + add] = false;
                    }
                    add++;
                }
            }
            divider++;
        }
        divider = 2;
        for (int i = 2; i < primes.length; i++) {
            if (primes[divider] == true && divider < primes.length) {
                s1.append(divider);
                s1.append(" ");
            }
            divider++;
        }
        String prime = s1.toString();
        StringTokenizer numbers = new StringTokenizer(prime);
        int counter = 0;
        StringBuilder output = new StringBuilder("All primes less than or equal to " + (size) + " are:\n");
        while (numbers.hasMoreTokens()) {
            output.append(numbers.nextToken());
            output.append("     ");
            counter++;
            if (counter == 10) {
                output.append("\n");
                counter = 0;
            }
        }
        System.out.println(output.toString());
    }
}
