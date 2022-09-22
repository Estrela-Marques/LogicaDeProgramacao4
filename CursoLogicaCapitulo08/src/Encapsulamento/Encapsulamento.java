package Encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Estrela Marques";
//		cliente.telefone = "11123456789";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Estrela Marques");
		cliente.setTelefone("11123456789");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());

	}

}
