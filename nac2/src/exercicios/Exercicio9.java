package exercicios;

import java.util.Scanner;

public class Exercicio9 {
	private double ganho;
	private double despesa;
	private double meses;
	public double getGanho() {
		return ganho;
	}
	public void setGanho(double ganho) {
		this.ganho = ganho;
	}
	public double getDespesa() {
		return despesa;
	}
	public void setDespesa(double despesa) {
		this.despesa = despesa;
	}
	
	public double getMeses() {
		return meses;
	}
	public void setMeses(double meses) {
		this.meses = meses;
	}
	public void executar() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio mensal");
		setGanho(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite suas despesas");
		setDespesa(Double.parseDouble(leia.nextLine()));
		setMeses(1000000/(getGanho() - getDespesa()));
		if(getMeses()<12) {
			System.out.println("ir� demorar "+ getMeses() + " meses para voc� se tornar um milion�rio");
		}else {
			System.out.printf("ir� demorar %.0f anos para voc� se tornar um milion�rio" ,(getMeses()/12 ));
		}
		System.out.println();
	}
}