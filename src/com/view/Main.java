// @author Joan Coll
// @version M9 Java Lambdas 21/11/2020

package com.view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Fase1		
		/*1.- Retorna Strings que comencen amb la lletra 'A' i tenen exactament 3 lletres.*/		
		List<String> properNouns = Arrays.asList ("Beatriz","Carlos","Azu","Ona","Paco","Ada","Iu","Ana",
				"Marc","Antonio");
		List<String> result = properNouns.stream().filter(noun-> noun.length() == 3).filter(noun ->
		noun.startsWith("A")).collect(Collectors.toList());
        result.forEach(noun -> System.out.println(noun));
        
        /*2.- Retorna String separada per comes basada en una llista d'Integers. Cada element hauria d'anar 
         * precedit per la lletra "e" si el nombre és parell, i precedit de la lletra "o" si el nombre és imparell.*/        
        List<Integer> numbers = Arrays.asList(3,44,5,78,23,13,7,8,22);	
		String stringNumbers = numbers.stream().map(number -> number % 2 == 0 ? "e" + number : "o" + number)
				.collect(Collectors.joining(","));
		System.out.println(stringNumbers);
		
		/*3.- Tenint una llista <Strings>, mètode que retorni llista de String que continguin la lletra "o" i imprimir.*/
		// Utilitzo llista de noms del primer excercici.		
		List<String> resultO = properNouns.stream().filter(noun ->noun.contains("o")).collect(Collectors.toList());
		resultO.forEach(noun -> System.out.println(noun));
		
		/*4.- Retorna una llista que inclou els elements amb més de 5 lletres. Imprimeix el resultat.*/		
		List<String> result5 = properNouns.stream().filter(noun-> noun.length() >= 5).collect(Collectors.toList());
		result5.forEach(noun -> System.out.println(noun));
		
		/*5.- Donada llista amb els noms dels mesos. Imprimeix tots els elements de la llista amb una lambda.*/		
		List<String> months = Arrays.asList ("Gener","Febrer","Març","Abril","Maig","Juny","Julio","Agost",
				"Septmebre","Octubre","Novembre","Decembre");
		months.forEach(noun -> System.out.println(noun));
				
		/*6.-Fer la mateixa impressió del punt anterior però mitjançant method reference.*/		
		months.forEach(System.out::println);
		
		//Fase 2		
		PiValue ref = () -> (3.1415);
		System.out.println("Value of Pi = " + ref.getPiValue());
		
		//Fase 3		
		Reversing ref2 = (str) -> {
		
			String reversed = "";
	        for (int i = str.length()-1; i >= 0 ; i--)
	        	reversed += str.charAt(i);
	        return reversed;
		};
		
		System.out.println("The string reversed = " + ref2.reverse("Barcelona"));
	
	}
}