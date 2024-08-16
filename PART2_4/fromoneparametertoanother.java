package PART2_4;
import java.util.Scanner;

public class fromoneparametertoanother {
    public static void main(String args[]){
        printUntilNumber(5);
    }
    public static void printUntilNumber(int time){
        for (int i = 1; i <= time; i++){
            System.out.println(i);
        }

    }
}
