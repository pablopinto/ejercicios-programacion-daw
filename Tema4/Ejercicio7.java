/*
 * Ejercicio7.java
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


public class Ejercicio7 {
	
	public static void main (String args[]) {
		System.out.print ( "Introduzca 1a nota : " );
		String linea1 = System.console().readLine();
		double n1 = Double.parseDouble(linea1);
		System.out.print ( "Introduzca 2a nota : " );
		String linea2 = System.console().readLine();
		double n2 = Double.parseDouble(linea2);
		System.out.print ( "Introduzca 3a nota : " );
		String linea3 = System.console().readLine();
		double n3 = Double.parseDouble(linea3);
		
		System.out.print ( " La nota media de los 3 examenes sera : " + ((n1+n2+n3)/3));
	}
}

