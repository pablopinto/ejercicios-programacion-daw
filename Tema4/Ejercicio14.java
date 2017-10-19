/*
 * Ejercicio14.java
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

		public class Ejercicio14 {
	
	public static void main (String args[]) {
		System.out.print ("introduce el numero : " ) ;
		String linea1 = System.console().readLine();
		int n1 = Integer.parseInt(linea1);
	    boolean primo;
	    if ( (n1%2)=0){
			System.out.print ("Patata");
			primo = false;
		}
		else for( int i = 2 ; i <n1 ; i++){
			if ( (n1%i) = 0 ) ) {
			System.out.print ("Primo" +(n1%i));
			primo = true;
			
		}
		
		
	}
}
	


