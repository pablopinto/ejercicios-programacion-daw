import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Selecciona con que se va a hacer la piramide");
        String ic = s.nextLine();
        System.out.print("Introduce altura de la piramide");
        int alt = s.nextInt();
        for (int i = 0; i < alt; i++) {
            System.out.print(ic);
            for (int j = 0; j < i; j++) {
                System.out.print(ic + ic);
            }
            System.out.println("");
        }
    }
}
