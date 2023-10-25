
public class PessoaTesteFisica {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNumero_RG(534405034);
		System.out.println("RG Do Cliente é: " + pf.getNumero_RG());
		
		pf.setNumero_CPF(231425525);
		System.out.println("CPF Do Cliente é: " + pf.getNumero_CPF());
		
		pf.setAltura(173);
		System.out.println("Altura Do Cliente é: " + pf.getAltura());
		
		pf.setCor("Parda");
		System.out.println("Cor Do Cliente é: " + pf.getCor());
		
		pf.setOpção_Sexual("Vasco");
		System.out.println("Opção Sexual Do Cliente é: " + pf.getOpção_Sexual());
		
		pf.setCNH(1343245);
		System.out.println("CNH Do Cliente é: " + pf.getCNH());
		
		pf.setFilhos(3);
		System.out.println("Quantidade de Filhos do cliente: " + pf.getFilhos());
		
		pf.setNome_Mãe("Zefinha");
		System.out.println("Nome da Mãe do cliente é: " + pf.getNome_Mãe());
		
		pf.setNome_Pai("Zeca");
		System.out.println("Nome do Pai do cliente é: " + pf.getNome_Pai());
		
	
		
		
		

	}

}
