import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int j = 0; j < 100; j++) {
        
            int num = (int) (Math.random() * 191) + 10;
            int cont = 0;
            int nNum = num;

            boolean esPrimo;
            esPrimo = true;
            for (int i = 2; i < num; i++) {
              if (num % i == 0) {
                esPrimo = false;
              }
            }

            if(esPrimo){
                System.out.println("#"+num+"#");
            }

            else if(num%5==0){
                System.out.println("["+num+"]");
            }
            else System.out.println(num);

           
        }
    }
}