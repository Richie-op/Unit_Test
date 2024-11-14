public class Algorithms {

    public static char[] reverseArr (char[] arr) {

        char[] reversed = new char[arr.length];
        int j = 0;
        for (int i = arr.length -1; i >= 0 ; i--) {
           reversed[j] = arr[i];
           j++;
        }
         return reversed;
    }

    public static char reverseArr() {
        return 0;
    }
}
