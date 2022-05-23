package avaliação;

import java.util.Scanner;

public class SA_Full_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeprofessor;
		String nometurma;
		String materia;
		int numalunos;
		int numavaliacoes;
		
		System.out.println("Informe o nome do Professor:");
		nomeprofessor = sc.next();
		System.out.println("Nome da turma:");
		nometurma = sc.next();
		System.out.println("Informe a materia que o professor leciona:");
		materia = sc.next();
		System.out.println("informe o números de alunos dessa turma:");
		numalunos = sc.nextInt();
		System.out.println("Informe o número de avaliações que essa turma teve:");
		numavaliacoes = sc.nextInt();
		
	}

}
