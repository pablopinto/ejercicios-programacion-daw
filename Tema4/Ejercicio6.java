/*
 * Ejercicio6.java
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


public class Ejercicio6 {
	
	public static void main (String args[]) {
		System.out.println ( "Calculo de tiempo de caida de un objeto");
		double g = 9.81;
		System.out.print ( "Introduce valor de la altura 'h' : " );
		String linea = System.console().readLine();
		int h = Integer.parseInt (linea);
		
		if ( h != 0 ){
			System.out.println ( " El tiempo sera : " + ((Math.sqrt((2*h)/g))));
	}
	else System.out.print (" Con h = 0 , el tiempo sera 0 ");
}
}
