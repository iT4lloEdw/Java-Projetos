import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		//Exercicio Mostrar o Número Digitado na Tela
		
		String texto;
		texto = JOptionPane.showInputDialog("Digite um número");

		JOptionPane.showMessageDialog(null, "O Número digitado foi: " + texto);

	}

}
