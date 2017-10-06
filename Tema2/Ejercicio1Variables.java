/*
 * Ejercicio1Variables.java
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


public class Ejercicio1Variables {
	
	public static void main (String[] args) {
		int e = 144;
		int y = 999;
		System.out.println ( "\033[33mVariable E: " + e );
		System.out.println ( " Variable Y: " + y );
		System.out.println ( " Suma : " + (e+y) );
		System.out.println ( " Resta : " + (e-y) );
		System.out.println ( " Multiplicacion : " + (e*y) );
		System.out.println ( " Division : " + ((double)e/(double)y) );
	}
}

