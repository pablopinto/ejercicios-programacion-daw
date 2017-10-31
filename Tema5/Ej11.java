import java.util.Scanner;
public class Ej11 {
	
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        for (int i =j+5; i!=j;i-- ){
            System.out.println (+i +" "+(i*i) +" " +(i*i*i) );

        }
		
	}
}

