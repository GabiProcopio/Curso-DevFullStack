import java.util.Scanner;

public class ExercicioBolsadeValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calcular as médias dos valores de ações na bolsa ao longo de um mês.
/*Nesse caso, considere que os meses têm 28 dias e quatro semanas.
/*O programa deve apresentar as médias semanais (a menor e maior) e mensal.
 */ 
		Scanner scan = new Scanner(System.in);
			int[][] vetor1 = new int[4][7];
			int cont = 0, retorno = 0;
			double div = 0, sem = 0;

			for(int l=0; l < vetor1.length; l++) {
				for (int c=0; c < vetor1[l].length; c ++) {
					cont += 1;	
					System.out.println("Digite o valor do "+ cont);
					vetor1[l][c] = scan.nextInt();
					retorno = (vetor1[l][c] + retorno);
				}
				System.out.print("\n");
			}

			for(int l=0; l < vetor1.length; l++) {
				for (int c=0; c < vetor1[l].length; c ++) {
					System.out.print(vetor1[l][c] + " ");


					}
				System.out.print("\n");
				}



			int maior = 0;
			for(int l=0; l < vetor1.length; l++) {
				for (int c=0; c < vetor1[l].length; c ++) {
					if (vetor1[l][c] > maior) {
						maior = vetor1[l][c];


					}

				}
			}


			int menor = maior;
			for(int l=0; l < vetor1.length; l++) {
				for (int c=0; c < vetor1[l].length; c ++) {
					if (vetor1[l][c] < menor) {
						menor = vetor1[l][c];


					}

				}
			}


			sem = retorno / 4;

			System.out.println("Maior valor da semana = "+ maior);
			System.out.println("Menor valor da semana = "+ menor);
			System.out.println("Media do Mês= "+ retorno);
			System.out.println("Media por semana: "+ sem);





		}

	}
		
