import java.util.Scanner;

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
