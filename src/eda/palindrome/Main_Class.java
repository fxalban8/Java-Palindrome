package eda.palindrome;

import java.util.Scanner;
import java.util.Arrays;
public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String cadena_caracteres= new String(sc.nextLine());
		boolean palindromo = true;
		//java already allows to know the number of characters in a string
		int longitud_cadena= cadena_caracteres.length();
		char [] cadena_caracters= cadena_caracteres.toCharArray();
		for (int verificacion=0;verificacion<longitud_cadena/2;verificacion++) {
			
			if (cadena_caracters[verificacion]!=cadena_caracters[longitud_cadena-verificacion-1]) {
				palindromo=false;
				break;
			}
		}
		if(palindromo==false) {
			System.out.println("No es un palíndromo");
		}else {
			System.out.println("Si es un palíndromo");
		}
	}

}
