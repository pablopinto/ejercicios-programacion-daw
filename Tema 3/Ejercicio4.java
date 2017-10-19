/*
 * Ejercicio4.java
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


public class Ejercicio4 {
	
	public static void main (String[] args) {
		System.out.print ( "Introduzca el primer numero = " );
		String linea;
		linea = System.console().readLine();
		int num1 = Integer.parseInt(linea);
		System.out.print ( "Introduzca el segundo numero = ");
		String linea2;
		linea2 = System.console().readLine();
		int num2 = Integer.parseInt(linea2);
		System.out.println (" Suma = " + (num1 + num2) );
		System.out.println (" Resta = " + (num1 - num2) );
		System.out.println(" Multiplicacion = " + (num1*num2) );
		System.out.println (" Divison = " + (num1 / num2) );
	}
}

