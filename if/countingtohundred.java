package PART2_3;
import java.util.Scanner;

public class countingtohundred {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       
        for(int num = Integer.valueOf(scanner.nextLine()); num <= 100; num++){
            System.out.println(num);
        }
    }
}
