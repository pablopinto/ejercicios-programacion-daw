/*
 * Ejercicio11.java
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


public class Ejercicio11 {
	
	public static void main (String args[]) {
		System.out.print ( " Introduce hora actual : " );
		String linea1 = System.console().readLine();
		int hora = Integer.parseInt(linea1);
		System.out.print ( " Introduce minuto actual : ");
		String linea2 = System.console().readLine();
		int minuto = Integer.parseInt(linea2);
		
		if ( hora > 24 || hora < 0 ){
			System.out.print ( " Introduzca hora valida");
		}
		else if ( hora < 24 || hora > 0 ){
			 System.out.print (((24-hora)*60)*60 + (minuto *60 ));
	}
}
}

