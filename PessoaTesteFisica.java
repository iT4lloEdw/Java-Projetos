
public class PessoaTesteFisica {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNumero_RG(534405034);
		System.out.println("RG Do Cliente �: " + pf.getNumero_RG());
		
		pf.setNumero_CPF(231425525);
		System.out.println("CPF Do Cliente �: " + pf.getNumero_CPF());
		
		pf.setAltura(173);
		System.out.println("Altura Do Cliente �: " + pf.getAltura());
		
		pf.setCor("Parda");
		System.out.println("Cor Do Cliente �: " + pf.getCor());
		
		pf.setOp��o_Sexual("Vasco");
		System.out.println("Op��o Sexual Do Cliente �: " + pf.getOp��o_Sexual());
		
		pf.setCNH(1343245);
		System.out.println("CNH Do Cliente �: " + pf.getCNH());
		
		pf.setFilhos(3);
		System.out.println("Quantidade de Filhos do cliente: " + pf.getFilhos());
		
		pf.setNome_M�e("Zefinha");
		System.out.println("Nome da M�e do cliente �: " + pf.getNome_M�e());
		
		pf.setNome_Pai("Zeca");
		System.out.println("Nome do Pai do cliente �: " + pf.getNome_Pai());
		
	
		
		
		

	}

}
