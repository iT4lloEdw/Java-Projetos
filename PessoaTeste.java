
public class PessoaTeste {

	public static void main(String[] args) {

		PessoaJuridica pj = new PessoaJuridica();

		pj.setId(300);
		System.out.println("O ID Do cliente �: " + pj.getId());

		pj.setCNPJ(3500);
		System.out.println("O CNPJ do Cliente �: " + pj.getCNPJ());

		pj.setRaz�o_Social(200);
		System.out.println("Raz�o Social do Cliente �: " + pj.getRaz�o_Social());

		pj.setRenda(5000);
		System.out.println("Renda do Cliente �: " + pj.getRenda());

		pj.setIM(12);
		System.out.println("IM do cliente �: " + pj.getIM());

		pj.setIE(23);
		System.out.println("IE do cliente �: " + pj.getIE());

		pj.setCapital_Social(7000);
		System.out.println("Capital Social do cliente �: " + pj.getCapital_Social());

	}

}
