import java.util.Scanner;
public class Ej15 {
	
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
        int num = 1;
        int cont=0;
        while(num%4 !=0){
            num = (int)(Math.random()*28)+4;
        }
         System.out.println(num);

    for ( int i=0;i <num;i++){
        int jnum = (int)(Math.random()*7);
        cont++;
    
    switch(jnum){

        case 0:
        System.out.print(" Do");
        break;
        case 1:
        System.out.print(" Re");
        break;
        case 2:
        System.out.print(" Mi");
        break;
        case 3:
        System.out.print(" Fa");
        break;
        case 4:
        System.out.print(" Sol");
        break;
        case 5:
        System.out.print(" La");
        break;
        case 6:
        System.out.print(" Si");
        break;
    }
    if (cont%4 ==0){
        System.out.print(" |");
    }
    if (cont == num){
        System.out.print("|");
    }

    }
  }
}