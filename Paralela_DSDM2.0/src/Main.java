import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Casa casa = new Casa();
		CasaCon casacon = new CasaCon();
		Ap ap = new Ap();
		Comercial comercial = new Comercial();
		Funalt chama = new Funalt();
		String x = "1";
		int y = 0;
		
		List<Imovel> listaImoveis = new ArrayList<Imovel>();
		List<Imovel> ordem = new ArrayList<Imovel>();
		
		while(x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5")) {
			// Solicitação de dados
			x = chama.Solicitacao(x);
			
			if (x.equals("1")) {
				x = chama.TipoImovel(x);
				if (x.equals("1")) {
					casa = chama.CadastroCasa(casa);
					listaImoveis.add(casa);
					System.out.println("Cadastrado com sucesso!");
				}else if (x.equals("2")) {
					casacon = chama.CadastroCasaCon(casacon);
					listaImoveis.add(casacon);
					System.out.println("Cadastrado com sucesso!");
				}else if (x.equals("3")) {
					ap = chama.CadastroAp(ap);
					listaImoveis.add(ap);
					System.out.println("Cadastrado com sucesso!");
				}else if (x.equals("4")) {
					comercial = chama.CadastroComercial(comercial);
					listaImoveis.add(comercial);
					System.out.println("Cadastrado com sucesso!");
				}else {
					System.out.println("A opcao selecionada nao existe: ");
				}
			}else if (x.equals("2")) {
				y = chama.Escolhe(y);
				y--;
				listaImoveis.remove(y);
				System.out.println("Removido com sucesso!");
			}else if (x.equals("3")) {
					chama.MostraTamanho(listaImoveis);
					y = chama.Escolhe(y);
					y--;
					chama.Calcular(y, listaImoveis);
			}else if (x.equals("4")) {
				chama.Mostrar(listaImoveis);
			}else if (x.equals("5")) {
				chama.Ordenar(listaImoveis, ordem);
			}else {
				
			}
		}
	}
}
