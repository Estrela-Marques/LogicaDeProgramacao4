package exercicio;

public class ExercicioEstoque {

	public static void main(String[] args) {

			Produto produto = new Produto();
			produto.nome = "Notebook XZ10";
			produto.quantidadeEstoque = 8;
			
			System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
		}
		
		static Boolean eNecessarioReporEstoque(Produto produto) {
			if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
				return true;
			}
			
			return false;
		}
}
