import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      int[] n = new int[10];
      int[] primo = new int[10];
      int[] noPrimo = new int[10];
      int i;
      int j;
      int primos = 0;
      int noPrimos = 0;
      boolean esPrimo = false;
      
      System.out.println("Introduzca 10 números separados por INTRO:");
  
      for (i = 0; i < 10; i++) {
        n[i] = s.nextInt();
        
        esPrimo = true;
        for (j = 2; j < n[i] - 1; j++) {
          if (n[i] % j == 0) {
            esPrimo = false;
          }
        }
        

        if (esPrimo) {
          primo[primos++] = n[i];
        } else {
          noPrimo[noPrimos++] = n[i];
        }
      }
      
      System.out.println("\n\nArray original:");
      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
      System.out.print("│ Valor  ");
      for (i = 0; i < 10; i++) {
        System.out.printf("│%4d ", n[i]);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      
      
      for (i = 0; i < primos; i++) {
        n[i] = primo[i];
      }
      

      for (i = primos; i < primos + noPrimos; i++) {
        n[i] = noPrimo[i - primos];
      }
  

      System.out.println("\n\nArray con los primos al principio:");
      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
      System.out.print("│ Valor  ");
      for (i = 0; i < 10; i++) {
        System.out.printf("│%4d ", n[i]);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
  }
  
