//2 -  Escreva um programa que pergunte os seguintes dados referentes ao pneu de um automóvel:

//P = pressão
//V = volume
//T = temperatura

//e calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar):
//PV = 0.37M(T+460)

import java.util.Scanner;


public class questao2 {

	public static void main(String[] args) {
		
		        double pressao, volume, temperatura, massaDeAr;
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite a pressão do pneu em psi: ");
		        pressao = sc.nextDouble();

		        System.out.print("Digite o volume do pneu em litros: ");
		        volume = sc.nextDouble();

		        System.out.print("Digite a temperatura do pneu em graus Celsius: ");
		        temperatura = sc.nextDouble();

		        massaDeAr = (pressao * volume) / (0.37 * (temperatura + 460));

		        System.out.println("A massa de ar no pneu é: " + massaDeAr + " kg");

	}

}
