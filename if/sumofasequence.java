package PART2_3;
import java.util.Scanner;

public class sumofasequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Last number? ");
        int value = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < value; i++){
           num++;
           sum = sum +num;
        }
        System.out.println("The sum is " + sum);
    }

}
