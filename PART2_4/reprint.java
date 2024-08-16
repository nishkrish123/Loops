package PART2_4;
import java.util.Scanner;

public class reprint{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        int i = 1;

        while(i <= num){
            printText();
            i++;
        }

        //for(int i = 1; i <= num; i++){
        //printText();
        //}
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method.");
    }

}