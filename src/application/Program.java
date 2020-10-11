package application;

import java.util.Scanner;

import model.entites.Metodos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Metodos met = new Metodos();
		
		System.out.println("=========================");
		System.out.println(" P A R   O U   I M P A R ");
		System.out.println("=========================");
		System.out.println("--- Escolha uma opção ---");
		System.out.println(" [  PAR  ] o u [ IMPAR ] ");
		System.out.println("-------------------------");
		System.out.print("Digite Aqui -> ");
		met.setEscolha(sc.next());
		System.out.println("-------------------------");
		System.out.println("---  Digite um número ---");
		System.out.println("-------------------------");
		System.out.print("Digite Aqui -> ");
		met.setValor(sc.nextInt());
		System.out.println("-------------------------");
		met.maquina();
	}

}
