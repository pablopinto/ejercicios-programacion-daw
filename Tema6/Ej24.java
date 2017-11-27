import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un numero positivo");
        int num = s.nextInt();
        int cont = 0;
        int nNum = num;

        while (nNum > 0) {
            nNum = nNum / 10;
            cont++;
        }

        int cif = (int) (Math.random() * cont) + 1;

        for (int i = 1; i < cif; i++) {
            num = num / 10;
        }
        num = num % 10;
        System.out.print(num);
    }
}
