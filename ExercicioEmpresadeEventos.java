import java.util.ArrayList;
import java.util.List;

class Evento{
		String nome;
		Responsavel responsavel;
		String data_inicio;
		String data_termino;
		int carga_horaria;
		List <Palestra> palestras;
		
		public Evento(String in_nome, Responsavel in_responsavel, String in_data_inicio,
				String in_data_termino, List <Palestra> in_palestras) {
			nome = in_nome;
			responsavel = in_responsavel;
			data_inicio = in_data_inicio;
			data_termino = in_data_termino;
			palestras = in_palestras;
			calcula_carga_horaria();
		}
		
		private void calcula_carga_horaria() {
			int carga_horaria = 0;
			for (Palestra i : this.palestras) {
				carga_horaria += i.carga_horaria;
			}
			this.carga_horaria = carga_horaria;
			
		}
		
		public void gasto_responsavel() {
			double gasto = this.carga_horaria * this.responsavel.valor_hora;
			String resultado = "O valor gasto pelo responsável para o evento " + 
					this.nome+" foi de R$"+gasto;
			System.out.println(resultado);
		}
		
		public void gasto_por_palestra() {
			for (Palestra i : this.palestras) {
				System.out.println("O custo da palestra "+i.titulo+" é de R$"
						+(i.palestrante.valor_hora * i.carga_horaria));
			}
		}
		
		public void gasto_total_palestras() {
			double valor_total = 0;
			for (Palestra i : this.palestras) {
				valor_total += i.carga_horaria * i.palestrante.valor_hora;
			}
			
			System.out.println("O valor total gasto com palestras no evento "+ this.nome +
					" foi de R$"+valor_total);
		}
		
		public void palestra_mais_cara() {
			
			Palestra palestra_cara = this.palestras.get(0);
			double valor_palestra_cara = palestra_cara.carga_horaria*palestra_cara.palestrante.valor_hora;
			for (Palestra i : this.palestras) {
				double valor_palestra = i.carga_horaria * i.palestrante.valor_hora;
				if (valor_palestra > valor_palestra_cara) {
					palestra_cara = i;
					valor_palestra_cara = valor_palestra;
				}
			}
			System.out.println("A palestra mais cara foi: "+palestra_cara.titulo+
					"\n" +"E os dados do seu palestrante são: "+
					"\n" +"Nome:"+ palestra_cara.palestrante.nome+
					"\n" +"Contato:"+ palestra_cara.palestrante.contato+
					"\n" +"Valor da hora:"+ palestra_cara.palestrante.valor_hora);
		}
		
		public void palestra_mais_barata() {
			
			Palestra palestra_barata = this.palestras.get(0);
			double valor_palestra_barata = palestra_barata.carga_horaria*palestra_barata.palestrante.valor_hora;
			for (Palestra i : this.palestras) {
				double valor_palestra = i.carga_horaria * i.palestrante.valor_hora;
				if (valor_palestra < valor_palestra_barata) {
					palestra_barata = i;
					valor_palestra_barata = valor_palestra;
				}
			}
			System.out.println("A palestra mais barata foi: "+palestra_barata.titulo+
					"\n" +"E os dados do seu palestrante são: "+
					"\n" +"Nome:"+ palestra_barata.palestrante.nome+
					"\n" +"Contato:"+ palestra_barata.palestrante.contato+
					"\n" +"Valor da hora:"+ palestra_barata.palestrante.valor_hora);
		}
				
	}
	
	class Responsavel{
		String nome_completo;
		String telefone;
		double valor_hora;
		String info_adicional;
		
		public Responsavel(String in_nome_completo, String in_telefone, double in_valor_hora) {
			nome_completo = in_nome_completo;
			telefone = in_telefone;
			valor_hora = in_valor_hora;
			
		}
	}
	
	class Palestrante{
		String nome;
		String contato;
		double valor_hora;
		
		public Palestrante(String in_nome, String in_contato, double in_valor_hora) {
			this.nome = in_nome;
			this.contato = in_contato;
			this.valor_hora = in_valor_hora;
			
		}
	}
	
	class Palestra{
		String titulo;
		String hora_inicio;
		Palestrante palestrante;
		String descricao;
		int carga_horaria;
		
		public Palestra (String in_titulo, String in_hora_inicio, Palestrante in_palestrante,
				String in_descricao, int in_carga_horaria) {
			titulo = in_titulo;
			hora_inicio = in_hora_inicio;
			palestrante = in_palestrante;
			descricao = in_descricao;
			carga_horaria = in_carga_horaria;
		}
	}

public class ExercicioEmpresadeEventos {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Responsavel resp1 = new Responsavel("Lamon Icaro Souza","(31)9999-9999",77);
		Palestrante palestrante1 = new Palestrante("Cida Procópio", "cida@procopio.com.br", 200);
		Palestrante palestrante2 = new Palestrante("Joelma Emilia", "joelma@emilia.com.br", 250);
		Palestra palestra1 = new Palestra("Gestão de TI", "19h", palestrante1, "Métricas ágeis", 
				5);
		Palestra palestra2 = new Palestra("Governança de TI", "20h", palestrante2, "LGPD", 
				3);
		List <Palestra> palestras = new ArrayList<Palestra>();
		
		palestras.add(palestra1);
		palestras.add(palestra2);
		
		Evento HSM = new Evento("", resp1, "28/06/2020",
				"30/06/2020", palestras);
		
		HSM.gasto_por_palestra();
		HSM.gasto_total_palestras();
		HSM.gasto_responsavel();
		HSM.palestra_mais_cara();
		HSM.palestra_mais_barata();
		
	}

}
