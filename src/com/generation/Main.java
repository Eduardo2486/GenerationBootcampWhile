package com.generation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numberOne = 0;
		int numberTwo = 0;
		
		while(numberOne != numberTwo) {
			System.out.print("Ingresa el primer numero: ");
			numberOne = input.nextInt();
			System.out.print("Ingresa el segundo numero:  ");
			numberTwo = input.nextInt();
		}
		input.close();
		System.out.println("Se termino.");
		System.out.println(numberOne);
	}

}
