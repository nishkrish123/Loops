package PART2_3;
import java.util.Scanner;

public class fctrial2 {
    public static void main(String args[]){
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int prod = 1;

        for(int i = 1; i <= num; i++){
            prod = prod * i;
        }
        System.out.println("Factorial:"+ prod);
        System.out.println("Continue (y/n):");
        String what = scanner.nextLine();
        if(what.equals("n")){
            System.out.println("Thank you!");
            break;
        }

    }
    }
    
}
