package PART2_2;
import java.util.Scanner;

public class averageofpositivenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            if(num < 0){

                continue;
            }
            else{
                sum = sum + num;
                count = count + 1;
            }

        }

        if(count > 0){
            double average = 1.0 * sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
        


    }
}
