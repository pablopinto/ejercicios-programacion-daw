
public class Ej4 {
	
	public static void main (String args[]) {
    System.out.println ("Muestra 20 num aleatorios entre 0-10");
    for ( int i=0;i <20;i++){
        int num = (int)(Math.random()*11);
        System.out.print (" "+num);
    }
  }
	}