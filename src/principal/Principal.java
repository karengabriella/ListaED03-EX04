package principal;
import javax.swing.JOptionPane;
import controller.Livro;

public class Principal {
	public static void main(String[] args) {
		
  int opc = 0;	
  Livro exemplares = new Livro();
  while(opc != 4) {   
	opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir exemplares \n 2 - Remover exemplares \n 3 - Mostrar lista de livros \n 4 - Encerrar"));
	if(opc == 4) {
		break;
	}
	else if(opc == 1) {
      exemplares.inserirlivros();
	}
	else if(opc == 2) {
      exemplares.removerlivros();
	}
	else if(opc == 3) {
      exemplares.statuslista();
	}
  } 
	
 }
}
