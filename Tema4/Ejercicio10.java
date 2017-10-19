/*
 * Ejercicio10.java
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


public class Ejercicio10 {
	
	public static void main (String args[]) {
		System.out.print( "Introduzca mes del año de su nacimiento: ");
		String linea2 = System.console().readLine();
		int mes = Integer.parseInt(linea2);
		System.out.print( "Introduzca dia del año de su nacimiento: ");
		String linea1 = System.console().readLine();
		int dia = Integer.parseInt(linea1);
		
		switch (mes){
		
		case 1:
		if ( dia > 20 ){
			System.out.print( "Acuario");
		}
		else System.out.print( "Capricornio");
		case 2:
		if ( dia > 19 ){
			System.out.print( "Piscis");
		}
		else System.out.print( "Acuario");
		
		case 3:
		if ( dia > 21 ){
			System.out.print( "Aries");
		}
		else System.out.print( "Acuario");
		
		case 4:
		if ( dia > 20 ){
			System.out.print( "Tauro");
		}
		else System.out.print( "Aries    ");
		
		case 5:
		if ( dia > 21 ){
			System.out.print( "Geminis");
		}
		else System.out.print( "Tauro");
		
		case 6:
		if ( dia > 21 ){
			System.out.print( "Cancer");
		}
		else System.out.print( "Geminis");
		
		case 7:
		if ( dia > 23 ){
			System.out.print( "Leo");
		}
		else System.out.print( "Cancer");
		
		case 8:
		if ( dia > 23 ){
			System.out.print( "Virgo");
		}
		else System.out.print( "Leo");
		
		case 9:
		if ( dia > 23 ){
			System.out.print( "Libra");
		}
		else System.out.print( "Virgo");
		
		case 10:
		if ( dia > 23 ){
			System.out.print( "Escorpio");
		}
		else System.out.print( "Libra");
		
		case 11:
		if ( dia > 22 ){
			System.out.print( "Sagitario");
		}
		else System.out.print( "Escorpio");
		
		case 12:
		if ( dia > 22 ){
			System.out.print( "Capricornio");
		}
		else System.out.print( "Sagitario");
	}
}
}


