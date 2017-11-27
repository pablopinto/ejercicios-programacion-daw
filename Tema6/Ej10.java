
public class Ej10 {
	
	public static void main (String[] args) {
		
		for(int i=0; i<10;i++){
			int num = (int)(Math.random()*6);
			int fil = (int)(Math.random()*40)+1;
		for(int j=0;j<fil;j++){
			 num = (int)(Math.random()*6);
			 
			 switch(num){
			case 1:
			System.out.print ("*");
			break;
			case 2:
			System.out.print ("-");
			break;
			case 3:
			System.out.print ("=");
			break;
			case 4:
			System.out.print (".");
			break;
			case 5:
			System.out.print ("|");
			break;
			case 0:
			System.out.print ("@");
			break;
		}
		
		}
		System.out.println();
		
	}
}
}



