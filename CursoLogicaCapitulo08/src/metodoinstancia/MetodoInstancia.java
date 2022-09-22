package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Estrela";
		cliente.ultimoNome = "Marques";
		cliente.telefone = "11912345678";
		cliente.email = "emaildaestrela@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Bruno";
		cliente2.ultimoNome = "Marques";
		cliente2.telefone = "13912345678";
		
//		System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); //Esse é o método estático.
		
		
		System.out.println("Nomecliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nomecliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//		
//	}
	
														
}
