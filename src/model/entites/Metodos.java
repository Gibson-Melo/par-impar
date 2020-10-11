package model.entites;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

	private String p_i, escolha;
	private int valor, maquina, result;

	public String getP_i() {
		return p_i;
	}

	public void setP_i(String p_i) {
		this.p_i = p_i;
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getMaquina() {
		return maquina;
	}

	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}

	public void maquina() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		this.setMaquina(ran.nextInt(10));
		System.out.println("--- R E S U L T A D O ---");
		System.out.println("-------------------------");
		System.out.println("Você escolheu: " + this.getValor());
		System.out.println("A maquina escolheu: " + this.getMaquina());
		this.calcula(this.getValor(), this.getMaquina());
	}

	private void calcula(int n1, int n2) {
		this.setResult(n1 + n2);
		if (this.getResult() % 2 == 0) {
			this.setP_i("par");
		} else {
			this.setP_i("impar");
		}
		
		this.ganhador(this.getEscolha());
	}

	private void ganhador(String jogador) {
		System.out.println(".........................");
		if (this.getEscolha().equals(this.getP_i())) {
			System.out.println(this.getResult() + " é " + this.getP_i() + " Então Você Ganhou");
		} else {
			System.out.println(this.getResult() + " é " + this.getP_i() + " Então a Máquina Ganhou");
		}
	}
}
