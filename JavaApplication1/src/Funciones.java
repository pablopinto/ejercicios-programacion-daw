import java.util.Scanner;

import static matematicas.Varios.voltea;
import static matematicas.Varios.potencia;
import static matematicas.Varios.digitos;
import static matematicas.Varios.esCapicua;
import static matematicas.Varios.esPrimo;
import static matematicas.Varios.siguientePrimo;
import static matematicas.Varios.digitoN;
import static matematicas.Varios.posicionDeDigito;
import static matematicas.Varios.quitaPorDetras;
import static matematicas.Varios.quitaPorDelante;
import static matematicas.Varios.pegaPorDetras;
import static matematicas.Varios.pegaPorDelante;
import static matematicas.Varios.trozoDeNumero;
import static matematicas.Varios.juntaNumeros;

public class Funciones {
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
        System.out.println("7-Digit que esta en la posicion dada");
        System.out.println("8-Posicion de un digito");
        System.out.println("9-Quita X numeros por detras");
        System.out.println("10-Quita X numeros por delante");
        System.out.println("11-Añade cifras por delante");
        System.out.println("12-Añade cifras por detras");
        int menu = s.nextInt();
        while (menu != 0) {

            switch (menu) {
            case 0:
                break;

            case 1://volteo
                //volteo
                System.out.println();
                System.out.println("Introduce un numero para que se realice el volteo de un numero");
                int num = s.nextInt();
                voltea(num);
                System.out.print(voltea(num));
                System.out.println();
                break;

            case 2://potencia
                //potencia
                System.out.println();
                System.out.println("Introduce base y exponente para calcular el numero");
                System.out.println("Introduce la Base = ");
                int bas = s.nextInt();
                System.out.println("Introduce la potencia = ");
                int pot = s.nextInt();
                potencia(bas, pot);
                break;

            case 3://digitos 
                //digitos 
                System.out.println();
                System.out.println("Introduce un numero para contar los digitos");
                int dig = s.nextInt();
                digitos(dig);
                System.out.print(digitos(dig));
                break;

            case 4: //Capicua
                //Capicua
                System.out.println();
                System.out.println();
                System.out.println("Introduce un numero para comprobar si es capicua");
                int cap = s.nextInt();
                esCapicua(cap);
                break;

            case 5://Primo
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
            case 6://Siguiente primo
                //Siguiente primo
                System.out.println();
                System.out.println("Introduce un numero para comprobar si es primo");
                int spri = s.nextInt();
                siguientePrimo(spri);
                break;

            case 7://Devuelve el digito que esta en X posicion
                System.out.println();
                System.out.println("Introduce un numero a calcular digito dentro de el");
                int digN = s.nextInt();
                System.out.println("Introduce una posicion a comprobar");
                int digNc = s.nextInt();
                digitoN(digN,digNc);
                break;
            
            case 8://Posicion de un digito de izquierda a derecha

                 System.out.println();
                 System.out.println("Introduce un numero a calcular digito dentro de el");
                 int digP = s.nextInt();
                 System.out.println("Introduce posicion");
                 int digPc = s.nextInt();
                 posicionDeDigito(digP,digPc);
                 break;

            case 9://Quita numeros por detras

                System.out.println();
                System.out.println("Introduce un numero a calcular digito dentro de el");
                int Ndet = s.nextInt();
                System.out.println("Cantidad de numeros a quitar");
                int NdetC= s.nextInt();
                quitaPorDetras(Ndet,NdetC);
                break;

            case 10://Quita numeros por delante
            
                System.out.println();
                System.out.println("Introduce un numero a calcular digito dentro de el");
                int Ndel = s.nextInt();
                System.out.println("Cantidad de numeros a quitar");
                int NdelC= s.nextInt();
                quitaPorDelante(Ndel,NdelC);
                break;

            case 11://Añade numeros por detras

                System.out.println();
                System.out.println("Introduce un numero base");
                int Adel = s.nextInt();
                System.out.println("Introduce numeros a añadir");
                int AdelC= s.nextInt();
                pegaPorDetras(Adel,AdelC);
                break;
            case 12://Añade numeros por detras

                System.out.println();
                System.out.println("Introduce un numero base");
                int Adet = s.nextInt();
                System.out.println("Introduce numeros a añadir");
                int AdetC= s.nextInt();
                pegaPorDelante(Adet,AdetC);
                break;
            case 13://Selecciona la zona central de un numero

                System.out.println();
                System.out.println("Introduce un numero base");
                int ZcN = s.nextInt();
                System.out.println("Selecciona posicion inicial");
                int ZcNI= s.nextInt();
                System.out.println("Selecciona posicion final");
                int ZcNF= s.nextInt();
                trozoDeNumero(ZcN,ZcNI,ZcNF);
                break;

            case 14://Añade numeros por detras
                break;      
            }
            System.out.println();
            System.out.println("Introduce otro numero del menu:");
            menu = s.nextInt();
        }
    }

}
