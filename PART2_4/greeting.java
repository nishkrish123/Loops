package PART2_4;
import java.util.Scanner;

public class greeting {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numOfTimes = Integer.valueOf(scanner.nextLine());
        greet(numOfTimes);
    }
    public static void greet(int numOfTimes){
        int i = 0;
        while(i < numOfTimes){
            System.out.println("Greetings!");
            i++;
        }
    }
}
