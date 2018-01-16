/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
package matematicas;
public class Varios {
      public static int voltea(int x) {
        int numero = x;
        int volteado = 0;

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

    public static int esCapicua(int num) {
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
        int numero = x;
        int pos = y;
        int cont = 1;
        int volteado = voltea(x);

        if (volteado == 1){
            volteado = volteado %10;
        }
        else
            while (cont <pos){
                volteado = volteado /10;
                cont ++;
            }
            System.out.print("El numero que esta en la poscion dada es " +volteado%10);
        return 0;
    }

    public static int posicionDeDigito(int x,int y) {
        int numero = x;
        int volteado = 0;
        int longitud = 0;
        int posicion = y;
        int cont =0;
        
        if (numero == 0) {
          longitud = 1;
        }
        
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
          longitud++;
        } // while
            
        // comprueba la posici�n
        while (cont  < posicion) {
          volteado /= 10;
          posicion++;
        } // while
        System.out.println();
        return posicion;
    }
    
    public static int quitaPorDetras(int x,int y){
        int cont=0;
        int pos = y;
        int num = x;

        while (cont  < pos) {
            num /= 10;
            cont++;
          } // while
        System.out.print(num);
        return num;
    }

    public static int quitaPorDelante(int x,int y){
        int cont=0;
        int pos = y;
        int volteado = voltea(x);

        while (cont  < pos) {
            volteado /= 10;;
            cont++;
          } // while
          voltea(volteado);
          System.out.print(voltea(volteado));
        return voltea(volteado);
    }
    
    public static int pegaPorDetras(int x,int y){
        int num = x;
        int cifra = y;
        int cont = 0;

        while(cifra > 0){
            cifra = cifra/10;
            cont++;
        }

        cifra = y;

        for (int i=0;i<cont;i++){
            num = num*10;
        }
        System.out.println("El nuevo numero sera" +(num+cifra));
        return 0;
    }
   
    public static int pegaPorDelante(int x,int y){
        int num = x;
        int cifra = y;
        int cont = 0;

        while (num > 0){
            num = num / 10;
            cont ++;
        }

        num = x;
        
        for(int i =0; i <cont; i++){
           cifra = cifra*10;
        }
        System.out.print(cifra+num);

        return 0;
    }

    public static int trozoDeNumero(int x,int y ,int z){
        posicionDeDigito(x, y);
        System.out.println(posicionDeDigito(x,y));
        
       
        System.out.println("El numero resultante sera"+x );

        return 0;
    }

    public static int juntaNumeros(int x){
        return 0;
    }
    
}
