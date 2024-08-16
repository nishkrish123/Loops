package PART2_3;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");

        int num = scanner.nextInt();
        
        for(int i =1; i<=num; i++){
          int prod = i;
          prod*=i; 
          System.out.println(prod);
        }
        
    } 
}
