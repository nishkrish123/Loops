package PART2_4;

public class smallest {
    public static void main(String args[]){
        int ans = smallest(11,7);
        System.out.println("Smallest: " + ans);
    }
    public static int smallest(int first, int second){
        if (first < second){
            return first;
        } else {
            return second;
        }
    }
}
