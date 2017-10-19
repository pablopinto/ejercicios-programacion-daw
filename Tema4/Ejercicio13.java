/*
 * Ejercicio13.java
 * 
 * Copyright 2017 alumno <alumno@alumno-TOSHIBA>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
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


public class Ejercicio13 {
	
	public static void main (String args[]) {
		System.out.print ("introduce el 'n1' : " ) ;
		String linea1 = System.console().readLine();
		double n1 = Double.parseDouble(linea1);
		System.out.print ("introduce el 'n1' : " ) ;
		String linea2 = System.console().readLine();
		double n2 = Double.parseDouble(linea2);
		System.out.print ("introduce el 'n3' : " ) ;
		String linea3 = System.console().readLine();
		double n3 = Double.parseDouble(linea3);
		
		if ((n1 > n2) && (n2 > n3)){
System.out.println (+n1) ;
System.out.println (+n2) ;
System.out.println (+n3) ;

		}
		if ( (n1 > n3) && (n3 > n2)){
System.out.println (+n1) ;
System.out.println (+n3) ;
System.out.println (+n2) ;
			
		}
		if ( (n2 > n1) && (n1 > n3)){
System.out.println (+n2) ;
System.out.println (+n1) ;
System.out.println (+n3) ;	
		}
		if ( (n2 > n3) && (n3 > n1)){
System.out.println (+n2) ;
System.out.println (+n3) ;
System.out.println (+n1) ;
		}
		if ( (n3 > n2) && (n2 > n1)){
System.out.println (+n3) ;
System.out.println (+n2) ;
System.out.println (+n1) ;
			
		}
		if ( (n3 > n1) && (n1 > n2)){
System.out.println (+n3) ;
System.out.println (+n1) ;
System.out.println (+n2) ;
}
	}
}


