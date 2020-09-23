import java.util.Scanner;

public class Exerciciomediasemestral {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
	    int prova,projeto,exercicios;
	    int media = 0;
	    
			System.out.println("Informe suas notas");
			prova =  ent.nextInt();
			projeto = ent.nextInt();
			exercicios = ent.nextInt();
			
		 media = (prova*5+projeto*3+exercicios*2)/10;
		
			System.out.println("Sua media é = "+media);
			
			 if (media >=8) {
				 System.out.println("Aprovado");
			 }
			 else if ((media < 7.9) && (media >5)){
					System.out.println("Realizar avaliação final");}
						if (media < 5) {
						System.out.println("Reprovado");
					}
}
}

			//As notas de cada bimestre são compostas por três atividades avaliativas, com pesos diferentes: prova (peso 5), projeto (3) e lista de exercícios (2).
				/*Os alunos são considerados aprovados, caso obtenham média semestral superior ou igual a 8.
				/*Caso obtenham notas entre 7.9 e 5, devem realizar a Avaliação Final (AF) e os alunos com médias abaixo de 5, são considerados reprovados.
				/*Desenvolva um código que ao fim da execução do programa, devem ser exibidas a média geral da turma, a menor e a maior nota.
				 *Assim como a quantidade de alunos que foram aprovados, reprovados e que necessitarão realizar AF.
				 */