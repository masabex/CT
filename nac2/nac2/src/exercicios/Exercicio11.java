package exercicios;
import java.util.Scanner;
public class Exercicio11 {
	public String nome;
	public int idade;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		nome = leia.nextLine();
		System.out.print("Digite usa idade: ");
		idade = leia.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + ", voc� � maior de idade.");
		}else {
			System.out.println("Voc� � menor do que 18 anos.");
		}
	}
}