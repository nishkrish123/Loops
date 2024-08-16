package PART2_3;
import java.util.Scanner;

public class repeatingbreakingandremebering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(num != -1 && num % 2==0){
                sum +=num;
                count++;
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Sum:"+sum);
        System.out.println("Numbers:"+count);
        double avg = 1.0 * sum / count;
        System.out.println("Average:"+avg);
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
    }
}
