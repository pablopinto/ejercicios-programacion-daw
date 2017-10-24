public class Ejercicio19 {

    public static void main(String args[]) {
        System.out.println("Introduce un numero entre -99999 y 99999:  ");
        int num = Integer.parseInt(System.console().readLine());
        int cont = 0;

        if (((num / 10000) > 0) || ((num /10000) < 0)) {
            cont = cont + 1;
            if (((num / 1000) > 0) || ((num /1000) < 0)) {
                cont = cont + 1;
                if (((num / 100) > 0) || ((num /100) < 0)) {
                    cont = cont + 1;
                    if (((num / 10) > 0) || ((num /10) < 0)) {
                        cont = cont + 1;
                        if ((num < 10) && (num > -10) );
                        cont = cont + 1;
                    
                    }
                }
            }
        }
        else if (((num / 1000) > 0) || ((num /1000) < 0)) {
            cont = cont + 1;
            if (((num / 100) > 0) || ((num /100) < 0)) {
                cont = cont + 1;
                if (((num / 10) > 0) || ((num /10) < 0)) {
                    cont = cont + 1;
                    if ((num < 10) && (num > -10) );
                    cont = cont + 1;
                }
            }
        }
        else if (((num / 100) > 0) || ((num /100) < 0)) {
            cont = cont + 1;
            if (((num / 10) > 0) || ((num /10) < 0)) {
                cont = cont + 1;
                if ((num < 10) && (num > -10) );
                cont = cont + 1;
            }
        }
        else if (((num / 10) > 0) || ((num /10) < 0)) {
            cont = cont + 1;
            if ((num < 10) && (num > -10) );
            cont = cont + 1;
        }
        else if ((num < 10) && (num > -10)){
        cont = cont + 1;
        }

        System.out.print("Numero de cifras = " + cont);
    }

}
