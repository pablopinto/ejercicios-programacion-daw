import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Acontinuacion presentaremos una serie de operaciones:");
        System.out.println("0-Acabar el programa");
        System.out.println("1-Volteo");
        System.out.println("2-Potencia");
        System.out.println("3-Digitos");
        System.out.println("4-Capicua");
        System.out.println("5-Primo");
        System.out.println("6-Siguiente Primo");
        System.out.println("7-Posicion de un digito");
        int menu = s.nextInt();
        while (menu != 0) {

            switch (menu) {
            case 0:
                break;

            case 1:
                //volteo
                System.out.println();
                System.out.println("Introduce un numero para que se realice el volteo de un numero");
                long num = s.nextLong();
                voltea(num);
                System.out.print(voltea(num));
                System.out.println();
                break;

            case 2:
                //potencia
                System.out.println();
                System.out.println("Introduce base y exponente para calcular el numero");
                System.out.println("Introduce la Base = ");
                int bas = s.nextInt();
                System.out.println("Introduce la potencia = ");
                int pot = s.nextInt();
                potencia(bas, pot);
                break;

            case 3:
                //digitos 
                System.out.println();
                System.out.println("Introduce un numero para contar los digitos");
                int dig = s.nextInt();
                digitos(dig);
                System.out.print(digitos(dig));
                break;

            case 4:
                //Capicua
                System.out.println();
                System.out.println();
                System.out.println("Introduce un numero para comprobar si es capicua");
                int cap = s.nextInt();
                esCapicua(cap);
                break;

            case 5:
                //Primo
                System.out.println();
                System.out.println("Introduce un numero para comprobar si es primo");
                int pri = s.nextInt();
                esPrimo(pri);
                if (esPrimo(pri)) {
                    System.out.println("El " + pri + " es primo.");
                } else {
                    System.out.println("El " + pri + " no es primo.");
                }
                break;
            case 6:
                //Siguiente primo
                System.out.println();
                System.out.println("Introduce un numero para comprobar si es primo");
                int spri = s.nextInt();
                siguientePrimo(spri);
                break;

            case 7:
                //Posicion de un digito de izquierda a derecha
                System.out.println();
                System.out.println("Introduce un numero a calcular digito dentro de el");
                int digN = s.nextInt();
                System.out.println("Introduce un digito a comprobar");
                int digNc = s.nextInt();
                digitoN(digN,digNc);
                break;
            
            case 8:
                //Devuelve el digito que esta en X posicion
                 System.out.println();
                 System.out.println("Introduce un numero a calcular digito dentro de el");
                 int digP = s.nextInt();
                 System.out.println("Introduce posicion");
                 int digPc = s.nextInt();
                 posicionDeDigito(digP,digPc);
                 break;
            }
            System.out.println();
            System.out.println("Introduce otro numero del menu:");
            menu = s.nextInt();
        }
    }

    public static long voltea(long x) {
        long numero = x;
        long volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        return volteado;
    }

    public static int potencia(int x, int y) {
        int bas = x;
        int pot = y;
        int cont = 0;
        int potencia = 1;

        while (cont != pot) {

            potencia = potencia * bas;
            cont++;
            System.out.println(+potencia);
        }
        return potencia;
    }

    public static int digitos(int num) {
        int cont = 0;
        while (num > 0) {
            num = num / 10;
            cont++;
        }
        return cont;
    }

    public static long esCapicua(long num) {
        voltea(num);
        if (voltea(num) == num) {
            System.out.println("El " + num + " es capicua");
        } else {
            System.out.println("El " + num + " no es capicua");
        }
        return num;
    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {

        for (int n = x; n < x + 5; n++) {

            // comprueba si n es primo
            esPrimo(x);

            // muestra por pantalla si n es primo o no
            if (esPrimo(n)) {
                System.out.println(n + " es el primo inmediatamente posterior");
            } else {
            }
        }
        return 0;
    }

    public static int digitoN(int x, int y) {
        return 0;
    }

    public static int posicionDeDigito(int x,int y) {
       int numero = x;
        int digito = y;
        int volteado = 0;
        int longitud = 0;
        int posicion = 1;
        
        if (numero == 0) {
          longitud = 1;
        }
        
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
          longitud++;
        } // while
            
        // comprueba la posici�n
        while (volteado > 0) {
          if ((volteado % 10) == digito) {
            System.out.print("El digito seleccionado esta en la posicion "+ posicion + " ");
          }
          volteado /= 10;
          posicion++;
        } // while
        System.out.println();
        return 0;
    }
}
