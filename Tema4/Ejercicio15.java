/*
 * Ejercicio15.java
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

public class Ejercicio15 {

	public static void main(String[] args) {
		System.out.print("Introduce simbolo para la piramide : ");
		String c = System.console().readLine();
		System.out.print("Indica en que direccion va a ir tumbada la piramide : ");
		System.out.print("1-.Punta hacia abajo ");
		System.out.print("2-.Punta hacia arriba");
		System.out.print("3-.Punta hacia derecha");
		System.out.print("4-.Punta hacia izquierda ");
		int menu = Integer.parseInt(System.console().readLine());
		switch (menu) {
		case 1:
			System.out.print("+c+c+c+c+c+c+c+c+c");
			System.out.print("  +c+c+c+c+c+c+c");
			System.out.print("    +c+c+c+c+c+");
			System.out.print("       +c+c+c");
			System.out.print("         +c");

		case 2:
			System.out.print("         +c");
			System.out.print("       +c+c+c");
			System.out.print("    +c+c+c+c+c+");
			System.out.print("  +c+c+c+c+c+c+c");
			System.out.print("+c+c+c+c+c+c+c+c+c");

		case 3:
			System.out.print("+c+");
			System.out.print("+c+c+");
			System.out.print("+c+c+c");
			System.out.print("+c+c+c+c");
			System.out.print("+c+c+c+c+c");
			System.out.print("+c+c+c+c+");
			System.out.print("+c+c+c");
			System.out.print("+c+c");
			System.out.print("+c");

		case 4:
			System.out.print("        +c");
			System.out.print("      +c+c");
			System.out.print("    +c+c+c");
			System.out.print("  +c+c+c+c");
			System.out.print("+c+c+c+c+c");
			System.out.print("  +c+c+c+c");
			System.out.print("    +c+c+c");
			System.out.print("      +c+c");
			System.out.print("        +c");

		}
	}
}
