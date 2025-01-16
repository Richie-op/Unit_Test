import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithms algo = new Algorithms();

        char[] input1 = {'c', 'h', 'e', 'v', 'y'};
        char[] result1 = algo.reverseArray(input1);
        System.out.println("Reversed array 1: " + new String(result1));

        char[] input2 = {'d', 'o', 'd', 'g', 'e'};
        char[] result2 = algo.reverseArray(input2);
        System.out.println("Reversed array 2: " + new String(result2));
    }
}