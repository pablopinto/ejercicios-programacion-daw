/*
 * Ej2.java
 * 
 * Copyright 2017 josemanuel <josemanuel@josemanuel-TOSHIBA>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Gene
 * ral Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Ej2 {
	
	public static void main (String args[]) {
		System.out.println ( " Va a salir por pantalla una carta aleatoria");
    
    int num=0;
    
    num = (int)(Math.random()*13)+1;
    
    
    switch ( num ){
      
      case 1:
      System.out.println ("La carta aleatoria ha sido A");  
      break;  
      case 2:
      System.out.println ("La carta aleatoria ha sido " +num);  
      break; 
      
      case 3:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 4:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 5:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 6:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 7:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 8:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 9:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 10:
      System.out.println ("La carta aleatoria ha sido " +num);   
      break;
      case 11:
      System.out.println ("La carta aleatoria ha sido J" );
      break;
      case 12:
      System.out.println ("La carta aleatoria ha sido Q");
      break;
      case 13:
      System.out.println ("La carta aleatoria ha sido K");
      break;
	}
}
}

