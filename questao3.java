//3 - Faça um programa que leia o primeiro termo de uma Progressão Aritmética (PA),
//sua razão, um número N e, a seguir, calcule e mostre o N-ésimo

//termo da PA.


import java.util.Scanner;

public class questao3 {

	    public static void main(String[] args) {
	    	
	    
	        double primeiroTermo, razao, nEsimoTermo;
	        int n;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro termo da PA: ");
	        primeiroTermo = sc.nextDouble();

	        System.out.print("Digite a razão da PA: ");
	        razao = sc.nextDouble();

	        System.out.print("Digite o número N: ");
	        n = sc.nextInt();

	        nEsimoTermo = primeiroTermo + (n - 1) * razao;

	        System.out.println("O " + n + "-ésimo termo da PA é: " + nEsimoTermo);

	    }
}
