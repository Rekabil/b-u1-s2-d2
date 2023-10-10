import java.util.HashMap;

public class Es3 {
    public static void main(String[] args) {
        HashMap<String,Integer> rubricaTelefono = new HashMap<String,Integer>();

        rubricaTelefono.put("Bilgen" , 545415796);
        rubricaTelefono.put("Remzi" , 545434346);
        rubricaTelefono.put("Kaan" , 545445796);
        rubricaTelefono.put("Marco" , 541215796);
        rubricaTelefono.put("Bub" , 545415742);
        rubricaTelefono.put("Ree" , 545495796);

        System.out.println(rubricaTelefono);
        rubricaTelefono.remove("Marco");
        System.out.println(rubricaTelefono);



        System.out.println(rubricaTelefono.get("Bub"));
    }
}
