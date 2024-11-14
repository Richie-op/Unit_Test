import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] test1 = {'c', 'a', 'r'};
        char[] test2 = {'d', 'o', 'd', 'g', 'e'};
        System.out.println(Arrays.toString( Algorithms.reverseArr(test1) ));
        System.out.println(Arrays.toString( Algorithms.reverseArr(test2) ));
    }
}