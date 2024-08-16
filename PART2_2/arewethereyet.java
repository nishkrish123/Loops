package PART2_2;
import java.util.Scanner;

public class arewethereyet {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 4){
                break;
            }
            if(num <= 0){
                System.out.println("Unfit number! Only postive energy gang.");
                continue;
            }


        }

    }
}
