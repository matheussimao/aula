package view;

import model.Pessoa;

public class execucao {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Pessoa pessoa= new Pessoa();
		pessoa.setNome("Matheus Simão");
		
		System.out.println(pessoa.getNome());
	
		pessoa.setEndereço("Rua Elza Soares de Arruda");
		System.out.println(pessoa.getEndereço());
		
		pessoa.setBairro("Limoeiro");
		System.out.println(pessoa.getBairro());
		
		
		pessoa.setCep("08051-360");
		System.out.println(cep.getCep());
	
	}
}
