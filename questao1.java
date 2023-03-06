//1 -  Escreva um programa que leia uma temperatura em graus Farenheit e a imprima em graus Centígrados.
//A conversão de graus Farenheit para Centígrados é obtida por C=(5/9)(F-32).


import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
	
		        double fahrenheit, celsius;
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite a temperatura em graus Fahrenheit: ");
		        fahrenheit = sc.nextDouble();

		        celsius = (5.0 / 9.0) * (fahrenheit - 32);

		        System.out.println("A temperatura em graus Celsius é: " + celsius);
		
	}
}
