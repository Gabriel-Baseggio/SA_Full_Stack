import java.util.Scanner;

public class SA_Full_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeProfessor;
		String nomeTurma;
		String materia;
		int numAlunos;
		int numAvaliacoes;
		int i, j, k;

		System.out.print("Informe o nome do professor: ");
		nomeProfessor = sc.next();
		System.out.print("Informe o nome da turma: ");
		nomeTurma = sc.next();
		System.out.print("Informe a matéria que o professor leciona: ");
		materia = sc.next();
		System.out.print("Informe o número de alunos dessa turma: ");
		numAlunos = sc.nextInt();
		System.out.print("Informe o número de avaliações que essa turma teve: ");
		numAvaliacoes = sc.nextInt();

		String[] nomeAluno = new String[numAlunos];
		int[] media = new int[numAlunos];
		int somaNotas, nota;

		for (i = 0; i < numAlunos; i++) {
			System.out.print("\nInforme o nome do " + (i + 1) + "º aluno: ");
			nomeAluno[i] = sc.next();
			somaNotas = 0;

			for (j = 0; j < numAvaliacoes; j++) {
				System.out.print("Informe a " + (j + 1) + "ª nota: ");
				nota = sc.nextInt();
				somaNotas += nota;
			}

			media[i] = somaNotas / numAvaliacoes;
		}

		System.out.println("\nProfessor: " + nomeProfessor);
		System.out.println("Turma: " + nomeTurma);
		System.out.println("Matéria: " + materia + "\n");
		for (k = 0; k < numAlunos; k++) {
			System.out.println("\nAluno: " + nomeAluno[k]);
			System.out.println("Média: " + media[k]);
			if (media[k] >= 7) {
				System.out.println("Situação: Aprovado");
			} else if (media[k] >= 5) {
				System.out.println("Situação: Em Exame");
			} else if (media[k] < 5) {
				System.out.println("Situação: Reprovado");
			}
		}

	}

}
