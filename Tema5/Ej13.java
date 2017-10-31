import java.util.Scanner;
public class Ej13 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una serie de 10 numeros"); 
        int contneg=0;  
        int contpos= 0;
		for(int i= 0 ; i<10; i++){
            int num = s.nextInt();
           
            if (num > 0){
              
                contpos++;
            }
            else 
            contneg++;
        }
        System.out.println ("Numeros positivos = "+contpos);
        System.out.println ("Numeros negativos = "+contneg);
	}
}
