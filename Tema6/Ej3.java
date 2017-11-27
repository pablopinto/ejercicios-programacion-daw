/*
 * Ej3.java
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


public class Ej3 {
	
	public static void main (String args[]) {
    System.out.println (" va a salir por pantalla una carta aleatoria de la baraja española");
    int num = (int)(Math.random()*10)+1;
    int palo = (int)(Math.random()*4);

    System.out.print ("La carta que ha salido es el "+num);
    
    switch (palo){
      case 1:
      System.out.print(" de Oros");
      break;
      case 2:
      System.out.print(" de Bastos");
      break;
      case 3:
      System.out.print(" de Copas");
      break;
      case 4:
      System.out.print(" de Espadas");
      break;
    }
  }
	}


