import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		//Exercicio Valor de X
		String y;

		y = JOptionPane.showInputDialog("Digite um número:");

		int x;

		x = Integer.parseInt(y);

		switch (x) {
		case 0:
			JOptionPane.showMessageDialog(null, "X é 0");
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "X é 1");
			break;

		default:
			JOptionPane.showMessageDialog(null, "X Tem um valor diferente de 0 e 1");
			break;

		}

	}

}
