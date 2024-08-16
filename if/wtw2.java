package PART2_3;
import java.util.Scanner;

public class wtw2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Were to?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int from = Integer.valueOf(scanner.nextLine());

        for(int i = from; i <= num; i++ ){
            System.out.println(i);
        }
    }
    
}
