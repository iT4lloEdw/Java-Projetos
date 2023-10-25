
public class PessoaTeste {

	public static void main(String[] args) {

		PessoaJuridica pj = new PessoaJuridica();

		pj.setId(300);
		System.out.println("O ID Do cliente é: " + pj.getId());

		pj.setCNPJ(3500);
		System.out.println("O CNPJ do Cliente é: " + pj.getCNPJ());

		pj.setRazão_Social(200);
		System.out.println("Razão Social do Cliente é: " + pj.getRazão_Social());

		pj.setRenda(5000);
		System.out.println("Renda do Cliente é: " + pj.getRenda());

		pj.setIM(12);
		System.out.println("IM do cliente é: " + pj.getIM());

		pj.setIE(23);
		System.out.println("IE do cliente é: " + pj.getIE());

		pj.setCapital_Social(7000);
		System.out.println("Capital Social do cliente é: " + pj.getCapital_Social());

	}

}
