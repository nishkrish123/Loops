package PART2_3;
import java.util.Scanner;

public class whereto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");
        
        for (int i = Integer.valueOf(scanner.nextLine()); i <= num; i++){
            System.out.println(i);
        }
    }
}
