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
	
	public static void main (String[] args) {
		System.out.print ("Introduce la base imponible = " );
		String linea;
		linea = System.console().readLine();
		double baseImp = Double.parseDouble(linea);
		System.out.print ("Introduce el iva con el que se trabaja(en %) = " );
		String linea2;
		linea2= System.console().readLine();
		double iva = Double.parseDouble(linea2);
		System.out.println ("Iva a pagar = " + (baseImp*(iva/100)));
		System.out.print ("Total a pagar (Iva incluido) = " +(baseImp +(baseImp*(iva/100))));
	}
}

