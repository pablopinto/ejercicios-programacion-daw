/*
 * Ejercicio1.java
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


public class Ejercicio1 {
	
	public static void main (String[] args) {
		String linea;
		String linea2;
		System.out.print ( " Introduzca el primer digito = ");
		int numero1;
		linea = System.console().readLine();
		numero1 = Integer.parseInt(linea);
		System.out.print ( "Introduzca el segundo digito = ");
		int numero2;
		linea2 = System.console().readLine();
		numero2 = Integer.parseInt(linea2);
		System.out.print ( "La multiplicacion de ambos tiene como resultado " );
		System.out.print ( + (numero1 * numero2));
		
		
	}
}

