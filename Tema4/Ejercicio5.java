/*
 * Ejercicio5.java
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


public class Ejercicio5 {
	
	public static void main (String args[]) {
		System.out.println ( "Calculo de ecuacion de tipo ax + b = 0 " );
		System.out.print ("introduce valor de la variable 'a' : " ) ;
		String linea1 = System.console().readLine();
		int a = Integer.parseInt(linea1);
		System.out.print ("introduce valor de la variable 'b' : " ) ;
		String linea2 = System.console().readLine();
		int b = Integer.parseInt(linea2);
		
		if ( a != 0){
			System.out.print ( "El valor de 'x' sera : " + (b * (-1)) / a );
		}
		else 	System.out.print ( "No se puede realizar la operacion");
}
}

