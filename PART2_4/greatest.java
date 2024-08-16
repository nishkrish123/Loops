package PART2_4;

public class greatest {
    public static void main(String args[]){
        int ans = greatest(1000,1000000,9);
        System.out.println("Greatest: " + ans);
    }
    public static int greatest(int first, int second, int third){
        if(first < second && second < third){
            return third;
        } else if(third < first && first < second){
            return second;
        } else {
            return first;
        }
    }
}
