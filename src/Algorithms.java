public class Algorithms {

    public char[] reverseArray(char[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left < right){
            char temp = input[left];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }

    public static char reverseArr() {
        return 0;
    }
}
