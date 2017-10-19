/*
 * Ejercicio9.java
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


public class Ejercicio9 {
	
	public static void main (String args[]) {
		System.out.println ( "Calculo de ecuacion de tipo ax² + bx + c = 0 " );
		
		System.out.print ("introduce valor de la variable 'a' : " ) ;
		String linea1 = System.console().readLine();
		double a = Double.parseDouble(linea1);
		System.out.print ("introduce valor de la variable 'b' : " ) ;
		String linea2 = System.console().readLine();
		double b = Double.parseDouble(linea2);
		System.out.print ("introduce valor de la variable 'c' : " ) ;
		String linea3 = System.console().readLine();
		double c = Double.parseDouble(linea3);
		
		double raiz = Math.sqrt ((b*2)-((4*a)*c));
		if (raiz < 0){
			System.out.print( "No se puede realizar la operacion");
		}
		else if (raiz >= 0 && a != 0 ){
			System.out.println ( " Primer resultado : "+(-b + raiz) / 2*a );
			System.out.println ( "Segundo resultado : "+(-b - raiz) / 2*a );
	}
		else 
		System.out.print( "No se puede realizar la operacion");
}
}

