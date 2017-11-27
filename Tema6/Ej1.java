/*
 * Ej1.java
 * 
 * Copyright 2017 josemanuel <josemanuel@josemanuel-TOSHIBA>
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


public class Ej1 {
	
	public static void main (String args[]) {
		System.out.println ("Se va a mostrar la tirada de tres dados");
    int suma =0;
    
    for ( int i = 0 ; i < 3 ; i++)
    {
      int num = (int)(Math.random()*6)+1;
      System.out.println("El valor del dado es de : " +num);
      suma = suma +num;

	}
  System.out.println (" La suma de los dados es = "+suma);
}
}

