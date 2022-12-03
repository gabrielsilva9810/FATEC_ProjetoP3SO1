package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		OperacoesController op = new OperacoesController();

		// MENUZINHO DE USO DO SOFTWARE
		int opcao = 0;

		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("" + " Escolha uma opção \n"
					+ " 1 - Exibir o JSON Completo \n" 
					+ " 2 - Pesquisar por NAME \n"
					+ " 3 - Pesquisar por UNIT \n"
					+ " 4 - Pesquisar por VALUE \n"
					+ " 5 - Pesquisar por TYPE \n"
					+ " 9 - Encerrar" + ""));

			//LER O ARQUIVO
			String caminho = "C:\\TEMP";
			String arquivo = "exchange.json";
			
			switch (opcao) {
			case 1: 
				try {
					op.lerDiretorio(caminho, arquivo);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			break;
				
			//-------------------------------------------------------------------------------------------------------------//
			/*
			case 2:
				String entrada = JOptionPane.showInputDialog(null, "Digite um valor UNIT");
				op.separarUnit(caminho); // VAI FINALIZAR O PROCESSO;
				break;

			case 3:
				String finalizarNome = JOptionPane.showInputDialog("Digite o NOME do Processo"); // USUARIO VAI DIGITAR
				controller.killPid(finalizarNome); // VAI FINALIZAR O PROCESSO;
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Programa Finalizado!");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
			
			*/
		}
	}

	// menuzinho
	// LENDO O ARQUIVO TODO
	//String caminho = "C:\\TEMP";
	//String arquivo = "exchange.json";
	
	/*try
	{
		op.lerDiretorio(caminho, arquivo);
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
	
	*/

}}
