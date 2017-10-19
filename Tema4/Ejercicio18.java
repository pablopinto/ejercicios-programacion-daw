/*
 * Ejercicio18.java
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


public class Ejercicio18{
	
	public static void main (String[] args) {
			System.out.print ( "Introduce una cifra : " );
		String linea = System.console().readLine();
		int num = Integer.parseInt(linea);
		if ( num >= 10 && num < 100 ){
		System.out.print ( num/10);
		}
		else if (num >=100 && num < 1000){
			System.out.print ( num/100);
		}
		else if (num >=1000 && num < 10000){
			System.out.print ( num/1000);
		}
		else if (num >=10000 && num < 100000){
			System.out.print ( num/10000);
		}
			else System.out.print ("Solo hasta 5 cifras"); 
			 
	}
}

