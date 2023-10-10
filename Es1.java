import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi.");
        int elementi = Integer.parseInt(input.nextLine());

        Set<String> parola = new HashSet<String>();
Set<String> duplicate =new HashSet<String>();
        for (int i = 0 ; i< elementi; i++) {
            System.out.println("Inserire la " + i + " parola.");
            String string = input.nextLine();
            if (parola.contains(string)) {
                duplicate.add(string);
            } else parola.add(string);

        }
System.out.println(duplicate);
        System.out.println(parola.size());

        System.out.println(parola);
    }
}
