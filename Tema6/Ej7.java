public class Ej7 {
	
	public static void main (String args[]) {

    System.out.println ("Muestra la quiniela"); 
 
    for ( int i=0;i <14;i++){  
        int num = (int)(Math.random()*3);
        System.out.print(+num);
        if (num == 0){
            System.out.print("X");
        }
        for (int j =1; j<3;j++){
            num = (int)(Math.random()*3);
            System.out.print(" " +num);
            if (num == 0){
                System.out.print("X");
            }
        }
        System.out.println();
    }
        System.out.println ("-------------");
         int num = (int)(Math.random()*3);
         System.out.print(num);
         if (num == 0){
            System.out.print("X");
        }
        switch(num);
        case 0:
        System.out.print("X");
        break;
  }
	}