/*
 * Ejercicio2.java
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
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int hora = Integer.parseInt(s.nextLine());

		if ((hora >= 6) && (hora <= 12)) {
			System.out.println(" Buenos dias ");
		} else if ((hora >= 13) && (hora <= 20)) {
			System.out.println(" Buenas Tardes ");
		} else {
			System.out.println(" Buenas Noches ");
		}

	}
}
