
public class Ej5 {
	
	public static void main (String args[]) {
    System.out.println ("Muestra 20 num aleatorios entre 0-10");
    int sum =0;
    int min = 9999;
    int max = -9999;
    int cont=0;
    for ( int i=0;i <50;i++){
        int num = (int)(Math.random()*100)+100;
        System.out.println (" "+num);
        sum = sum + num;
        cont++;
        if (num < min){
            min = num;
        }
        if (num > max){
            max = num;
        }
    }
        System.out.println ("El maximo es " +max);
        System.out.println ("El minimo es " +min);
        System.out.println ("La media es "+(sum/cont));
    
  }
	}