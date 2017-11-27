import java.util.Scanner;
public class Ej22 {
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    int pos =11;
    
    System.out.print("Introduce la longitud de la serpiente");
    int lon = s.nextInt();
    int inf=1;
    for (int i=0;i<lon;i++){
        System.out.print(" ");
        int num = (int)(Math.random()*3)+pos;
        for (int j=1; j<100;j++){
            if (i==0 && j==12){
            System.out.print("@");
            }
            else if (i!=0 && j==num){
                System.out.print("*");
                pos =j;
            }
            else System.out.print(" ");
        }
        System.out.println();
    }
  }
}