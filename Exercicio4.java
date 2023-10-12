import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		//Jogo de Adivinhação
		
		String y;
		y = JOptionPane.showInputDialog("Adivinhação, Escolha um Número de 1 á 4:");
		
		int x;
		x = Integer.parseInt(y);
		
		switch (x) {
		case 1:
			JOptionPane.showMessageDialog(null, "Errado");
		break;
		
		case 2:
			JOptionPane.showMessageDialog(null, "Errado");
		break;
		
		case 3:
			JOptionPane.showMessageDialog(null, "Acertou!!");
		break;
		
		case 4:
			JOptionPane.showMessageDialog(null, "Errado");
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "OPS, Permitido apenas números de 1 á 4");
		
		
		
		
		
		
		
		
		
		
		
		}
		
		

	}

}
