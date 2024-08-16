package PART2_4;

public class averaging {
    public static void main(String args[]){
        double ans = average(4,3,6,1);
        System.out.println("Average: " + ans);

    }
    public static int sum(int first, int second, int third, int fourth){
        return first + second + third + fourth;

    }
    public static double average(int first, int second, int third, int fourth){
        return sum(first, second, third, fourth) / 4.0;
    }
}
