import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] Arr = new int[10];
    int[] Aux = new int[10];
      
      System.out.println("Introduzca 10 números separados por INTRO:");
  
      for (int i = 0; i < 10; i++) {
          int num = s.nextInt();
          Arr[i] = num;
      }

      for (int j =0;j<10;j++){
          System.out.print(j);
      }

      System.out.println();

      for (int k =0;k<10;k++){
          System.out.print(Arr[k]);
      }

      System.out.println();
      int inicio=0;
      int fin =0;

      System.out.println("Introduzca un numero inicial");
      inicio = s.nextInt();
      System.out.println("Introduzca un numero final");
      fin = s.nextInt();

      if (inicio < fin){
          int aux=0;
          aux = Arr[fin];
          Arr[fin] = Arr[inicio];
          Arr[inicio] =aux;
      }
      else if (inicio >= fin){
          System.out.println("Inicio/Fin No Validos");
      }

      for (int l=0;l<10;l++){
          System.out.print(" "+Arr[l]);
      }
      
    }
  }
  
