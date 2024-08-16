package PART2_2;
import java.util.Scanner;

public class averageofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true){
            System.out.println("Give a number:");
            int given = Integer.valueOf(scanner.nextLine());

            if(given == 0){
                break;
            }else{
                sum = sum + given;
                count = count + 1;
            }

        }
        double average = sum * 1.0 / count ;
        System.out.println("Average of numbers: " + average);
    }
    
}
