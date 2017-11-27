import java.util.Scanner;
public class Ej14 {
	
	public static void main (String args[]) {
    System.out.println ("Piensa un numero entre 0 y 100(Ambos incluidos)"); 
    Scanner s = new Scanner(System.in);
    String respuesta;

    

        int num = (int)(Math.random()*100);
        System.out.print("El numero que has pensado es el " +num +" ?(s/n)");
        respuesta = s.nextLine();
        if (respuesta.equals("s")){
            System.out.print("Genial! Lo he adivinado!");
        }
        else if ( respuesta.equals("n")){
            for (int i=0; i<5;i++){
            int nNum=0;
            System.out.print("El numero es mayor (ma) o menor (me)?");
            respuesta = s.nextLine();
            if(respuesta.equals("ma")){
                nNum = num;
                num = (int)(Math.random()*(100-nNum))+nNum;
                System.out.print("El numero que has pensado es el " +num +" ?(s/n)");
                if (respuesta.equals("s")){
                    System.out.print("Genial! Lo he adivinado!");
            }
        }
                else if(respuesta.equals("me")){
                nNum= num;                
                num =(int)(Math.random()*nNum);
                System.out.print("El numero que has pensado es el " +num +" ?(s/n)");
            }
        

        }
    }
}
}