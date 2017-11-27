public class Ej8 {
	
	public static void main (String args[]) {

    System.out.println ("Muestra la quiniela"); 
    
    
 
    for ( int i=0;i <14;i++){  
		
        int num = (int)(Math.random()*6); 
     
        switch(num){
		case 0:
		System.out.print("X");
		break;
		
		case 1:
		System.out.print("X");
		break;
		
		case 2:
		System.out.print("1");
		break;
		case 3:
		System.out.print("1");
		break;
		
		case 4:
		System.out.print("1");
		break;
		
		case 5:
		System.out.print("2");
		break;
  }
        for (int j =1; j<3;j++){
            num = (int)(Math.random()*3);
            System.out.print(" ");
           
           switch(num){
		case 0:
		System.out.print("X");
		break;
		
		case 1:
		System.out.print("X");
		break;
		
		case 2:
		System.out.print("1");
		break;
		case 3:
		System.out.print("1");
		break;
		
		case 4:
		System.out.print("1");
		break;
		
		case 5:
		System.out.print("2");
		break;
  }
        }
        System.out.println();
    }
        System.out.println ("-------------");
         int num = (int)(Math.random()*3);
  
	switch(num){
		case 0:
		System.out.print("X");
		break;
		
		case 1:
		System.out.print("X");
		break;
		
		case 2:
		System.out.print("1");
		break;
		case 3:
		System.out.print("1");
		break;
		
		case 4:
		System.out.print("1");
		break;
		
		case 5:
		System.out.print("2");
		break;
  }
  
}
}
