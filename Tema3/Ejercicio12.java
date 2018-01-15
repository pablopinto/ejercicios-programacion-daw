/*
 * Ejercicio12.java
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


public class Ejercicio12 {
	
	public static void main (String[] args) {
		System.out.print ( "Introduce la nota del primer examen = " );
		String linea;
		linea = System.console().readLine();
		double nota1 = Double.parseDouble(linea);
		System.out.print ( " ¿Que nota quieres sacar al final del trimestre?  = ");
		String linea2;
		linea2 = System.console().readLine();
		double notafin = Double.parseDouble(linea2); 
		System.out.print (" Para tener un " + nota1 + " en el trimestre necesitas un " + (((nota1*0.4)-notafin)/0.6)*(-1) + " en el segundo examen ");
	}
}

