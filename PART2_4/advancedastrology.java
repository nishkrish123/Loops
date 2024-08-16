package PART2_4;

public class advancedastrology {
    public static void main(String[] args) {
        christmasTree(4);

    }
    public static void printSpaces(int num){
        int i = 0;
        while(i<num){
            System.out.print(" ");
            i++;
        }
    }
    public static void printStars(int numbers){
        int i = 0;
        while(i < numbers){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    public static void printTriangle(int size){
        int i = 1;
        while(i <= size){
            int num = size - i;
            printSpaces(num);
            int numbers = i;
            printStars(numbers);
            i++;

        }
    }
    public static void christmasTree(int height){
        int i = 1;
        int a = 1;
        while(i <= height){
            int num = height - i;
            printSpaces(num);
            int numbers = a;
            printStars(numbers);
            i++;
            a = a + 2;
        }
        printSpaces(2);
        printStars(3);
        printSpaces(2);
        printStars(3);

    }
}
