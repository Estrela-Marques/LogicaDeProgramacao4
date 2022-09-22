import java.util.Scanner;

public class RecebendoParametros {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"};
		
		System.out.println("Escolha dentre os cursos abaxo: ");
		
		IterarEExibirPosicoesDoVetorString(cursos);
		
		System.out.println("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão.", "Boleto."};
		
		System.out.println("Escolha denter as formas de pagamento abaixo: ");
		
		IterarEExibirPosicoesDoVetorString(formasPagamento);
		
		System.out.println("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
	    System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
	    scanner.close();		
	}
	
	static void IterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);			
		}
	}
	
        static void imprimirTraco() {
        	System.out.println("-------------------------------------------");
}
        
        static void encerrarProgramaPorCausaDePosicaoInvalida() {
    		System.err.println("Posição inválida!");
    		System.exit(1);
    	}
	

}
