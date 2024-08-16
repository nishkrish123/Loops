package PART2_4;

public class printingstars {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);
    }
    public static void printStars(int num){
        int i = 0;
        while(i<num){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    public static void printSquare(int size){
        int num = size;
        int i = 0;
        while(i < size){
            printStars(num);
            i++;
        }
    }
    public static void printRectangle(int width, int height){
        int num = width;
        int i = 0;
        while(i < height){
            printStars(num);
            i++;
        }
        
    }
    public static void printTriangle(int size){
        int i =1;
        while(i<=size){
            int num = i;
            printStars(num);
            i++;
        }
    }
}
