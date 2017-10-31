import java.util.Scanner;

public class Ej10 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int cont =0;
        int num =0;
        int suma =0;
        while (num >=0){
            System.out.println ( "Introduce cifras a calcular.(num negativo para acabar)" );
            num = s.nextInt();
            suma += num;
            cont++;
        }
        System.out.print ( +( suma -num)/cont-1);
    }
}