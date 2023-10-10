import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Es2 {
    public static void main(String[] args) {
        Random rndm = new Random();

        int N = 5;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < N ; i++) {
            numbers.add(rndm.nextInt(100)+1);
        }
System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
ArrayList<Integer> results = new ArrayList<Integer>();
        boolean pari = false;
        for (Integer number : numbers) {
            ;
            if (pari) {
                if (number % 2 == 0) {
                    results.add(number);
                }
            } else {
                if (number % 2 != 0) {
                    results.add(number);
                }
            }
        }
System.out.println(results);
    }
}
