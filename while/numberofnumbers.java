package PART2_2;
import java.util.Scanner;

public class numberofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numnum = 0;

        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0){
                break;
            } else{
                numnum = numnum + 1;
            }
        }
        System.out.println("Number of numbers:" + numnum);
    }
    
}
