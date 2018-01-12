package matematicas;

public class Varios {
   
   public static long esCapicua (long num){

   // Voltea el n�do.
   long numero = num;
   long volteado = 0;

   while (numero > 0) {
     volteado = (volteado * 10) + (numero % 10);
     numero /= 10;
   } 

   if (volteado == num) {
     System.out.println("El " + num + " es capicúa");
   } else {
     System.out.println("El " + num + " no es capicúa");
   }

   return num;
 }



  public static boolean esPrimo (int num ){
  
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}