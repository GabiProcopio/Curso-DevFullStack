import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
    Double prova,projeto,exercicios,contribuicoes, media = 0;
    
			
//Aluno deve ser aprovado se obtiver nota igual ou maior que 8.
/*Caso o aluno tenha média menor que 8
 *determine também a nota mínima necessária para a pontuação na prova final
 *de forma que o aluno garanta aprovação na disciplina. Para tal, basta subtrair do valor 10,00 o valor da média.		
*/
		System.out.println("Informe suas notas");
		prova = teclado.nextDouble();
		projeto = teclado.nextDouble();
		exercicios = teclado.nextDouble();
		contribuicoes = teclado.nextDouble();
		
		
		
		media = (prova*3+projeto*3+exercicios*2+contribuicoes*3)/11;
	
		System.out.println("Sua media é = "+media);
		
		 if (media>=8) { System.out.println("Aprovado");
		 } else {
			 System.out.println("Reprovado");
		 }
	}
}
