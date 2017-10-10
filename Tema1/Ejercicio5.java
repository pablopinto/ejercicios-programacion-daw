/*
 * ejercicio5.java
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


public class ejercicio5 {
	
	public static void main (String[] args) {
		String rojo = "\033 [31m";
		String verde = "\033 [32m";
		String naranja = "\033 [33m";
		String azul = "\033 [34m";
		String morado = "\033 [35m";
		String blanco = "\033 [37m";
		
		System.out.println ( "--------------------------------------");
		System.out.printf ("%-4 %-4 %-4 %-4", "L" , "M" ,"X", "J" , "V");
		System.out.println ( "--------------------------------------");
		System.out.printf ("%-4 %-4 %-4 %-4",  rojo + "Sinf", verde +"Pro" ,rojo + "Sinf", verde +"Pro" , verde +"Pro");
		System.out.printf ("%-4 %-4 %-4 %-4", rojo + "Sinf" , verde +"Pro" ,rojo + "Sinf", verde +"Pro" , verde +"Pro");
		System.out.printf ("%-4 %-4 %-4 %-4", rojo + "Sinf" ,verde +"Pro" ,rojo + "Sinf", verde +"Pro" , verde +"Pro");
		System.out.printf ("%-4 %-4 %-4 %-4", azul +"Fol" , naranja +"BBDD" , morado +"Ed", naranja + "BBDD" , blanco +"Lm");
		System.out.printf ("%-4 %-4 %-4 %-4", azul +"Fol" , naranja +"BBDD" ,morado +"Ed", naranja +"BBDD" , blanco + "Lm");
		System.out.printf ("%-4 %-4 %-4 %-4", azul +"Fol" , naranja +"BBDD" ,morado +"Ed", naranja + "BBDD" , blanco + "Lm");
	}
}

