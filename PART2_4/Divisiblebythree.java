package PART2_4;
import java.util.Scanner;

public class Divisiblebythree {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int beginning = Integer.valueOf(scanner.nextLine());
        System.out.println("Give last number:");
        int end = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(beginning , end);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int i = beginning; i<= end; i++){
            if(i % 3 ==0){
                System.out.println(i);
            }
        }
    }
}
