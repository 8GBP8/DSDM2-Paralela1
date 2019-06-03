import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String x = "1";
		
		List<Imovel> listaImoveis = new ArrayList<Imovel>();
		
		Scanner entrada = new Scanner (System.in);
		
		while(x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4")) {
			//Solicitação de dados
			System.out.println("Escolha uma opcao: ");
			System.out.println("1- Cadastrar um imovel.");
			System.out.println("2- Remover um imovel.");
			System.out.println("3- Valor Anual dos impostos. ");
			System.out.println("4- Lista dos imoveis(localizacao e tamanho).");
			System.out.println("Digite qualquer outro valor para sair.");

			x = entrada.next();
		}
	}
}
