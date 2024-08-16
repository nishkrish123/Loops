package PART2_2;
import java.util.Scanner;

public class Shallwecarryon{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Shall we carry on?");
            String value = scanner.nextLine();
            if (value.equals("no")){
                break;
            }
        }
    }
}
