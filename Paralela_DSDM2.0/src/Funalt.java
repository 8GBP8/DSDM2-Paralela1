import java.util.List;
import java.util.Scanner;

public class Funalt {
	
	Scanner entrada = new Scanner (System.in);
	
	public String Solicitacao(String x) {
		System.out.println("Escolha uma opcao: ");
		System.out.println("1- Cadastrar um imovel.");
		System.out.println("2- Remover um imovel.");
		System.out.println("3- Valor Anual dos impostos. ");
		System.out.println("4- Lista dos imoveis na ordem cadastrada. ");
		System.out.println("5- Lista dos imoveis em ordem decrescente do seu tamanho. ");
		System.out.println("Digite qualquer outro valor para sair.");
		
		x = entrada.next();
		
		return x;
	}
	
	public String TipoImovel(String x) {
		System.out.println("Escolha um tipo: ");
		System.out.println("1- Casa.");
		System.out.println("2- Casa de Condominio. ");
		System.out.println("3- Apartamento.");
		System.out.println("4- Imovel Comercial.");
		
		x = entrada.next();
		
		return x;
	}
	
	public Imovel Cadastro(Imovel imovel) {
		System.out.println("Digite o nome do proprietario do imovel: ");
		imovel.setProprietario(entrada.next());
		System.out.println("Digite o endereco do imovel: ");
		imovel.setEndereco(entrada.next());
		System.out.println("Digite o tamanho do imovel: ");
		imovel.setTamanho(entrada.nextDouble());
		System.out.println("Digite o ano de construcao do imovel: ");
		imovel.setAno(entrada.nextInt());
		
		return imovel;
	}
	
	public Casa CadastroCasa(Casa casa) {
		casa = (Casa) Cadastro(casa);
		casa.setId(1);
		
		return casa;
	}
	
	public CasaCon CadastroCasaCon(CasaCon casacon) {
		casacon = (CasaCon) Cadastro(casacon);
		System.out.println("Digite o condominio do imovel: ");
		casacon.setCondominio(entrada.next());
		casacon.setId(2);
		
		return casacon;
	}
	
	public Ap CadastroAp(Ap ap) {
			ap = (Ap) Cadastro(ap);
			System.out.println("Digite o condominio do apartamento: ");
			ap.setCondominio(entrada.next());
			System.out.println("Digite o andar do apartamento: ");
			ap.setAndar(entrada.nextInt());
			ap.setId(3);
			
			return ap;
	}
	
	public Comercial CadastroComercial(Comercial comercial) {
		comercial = (Comercial) Cadastro(comercial);
		comercial.setId(4);
		
		return comercial;
	}
	
	public void Mostrar (List<Imovel> listaImoveis) {
		Imovel ver = new Imovel();
		System.out.println("Os imoveis adicionados sao: ");
		for (int i = 0;i < listaImoveis.size(); i++) {
			ver = listaImoveis.get(i);
			if(ver.getId() == 1) {
				System.out.println((i+1) + "- Casa");
			}else if(ver.getId() == 2) {
				System.out.println((i+1) + "- Casa de Condominio");
			}else if(ver.getId() == 3) {
				System.out.println((i+1) + "- Apartamento");
			}else {
				System.out.println((i+1) + "- Imovel Comercial");
			}
		}
		System.out.println("");
		return;
	}
	
	public int Escolhe (int y) {
		System.out.println("Escolha a posição do imovel: ");
		y = entrada.nextInt();
		return y;
	}
	
	public void MostraTamanho(List<Imovel> listaImoveis) {
		Imovel ver = new Imovel();
		System.out.println("Os imoveis adicionados sao: ");
		for (int i = 0;i < listaImoveis.size(); i++) {
			ver = listaImoveis.get(i);
			if(ver.getId() == 1) {
				System.out.println((i+1) + "- Casa ---->" + " Tamanho: " + ver.getTamanho());
			}else if(ver.getId() == 2) {
				System.out.println((i+1) + "- Casa de Condominio ---->" + " Tamanho: " + ver.getTamanho());
			}else if(ver.getId() == 3) {
				System.out.println((i+1) + "- Apartamento ---->" + " Tamanho: " + ver.getTamanho());
			}else {
				System.out.println((i+1) + "- Imovel Comercial ---->" + " Tamanho: " + ver.getTamanho());
			}
		}
		System.out.println("");
		return;
	}
	
	public void Calcular(int y, List<Imovel> listaImoveis) {
		Imovel esc = new Imovel();
		esc = listaImoveis.get(y);
		Casa opcasa = new Casa();
		CasaCon opcasacon = new CasaCon();
		Ap opap = new Ap();
		Comercial opcomercial = new Comercial();
		double imposto;
			if( esc.getId() == 1) {
				opcasa = (Casa) esc;
				imposto = opcasa.CalcularImposto();
			}else if(esc.getId() == 2) {
				opcasacon = (CasaCon) esc;
				imposto = opcasacon.CalcularImposto();
			}else if(esc.getId() == 3) {
				opap = (Ap) esc;
				imposto = opap.CalcularImposto();
			}else {
				opcomercial = (Comercial) esc;
				imposto = opcomercial.CalcularImposto();
			}
			
			System.out.println("O imposto anual e R$" + imposto);
		
		return;
	}
	
	public void Ordenar(List<Imovel> listaImoveis, List<Imovel> ordem) {
		Imovel imovel1 = new Imovel();
		Imovel imovel2 = new Imovel();
		ordem = listaImoveis;
		for(int i = 0;i < listaImoveis.size(); i++) {
			imovel1 = listaImoveis.get(i);
			double v1 = imovel1.getTamanho();
			for(int j = 0;j < listaImoveis.size();j++) {
				imovel2 = listaImoveis.get(j);
				double v2 = imovel2.getTamanho();
				if(v1 < v2) {
					ordem.set(i, imovel2);
				}
			}
			
		}
		for(int i = 0;i < ordem.size();i++) {
			imovel1 = ordem.get(i);
			System.out.println("Tamanho: " + imovel1.getTamanho() +
								"Endereco: " + imovel1.getEndereco());
		}
		return;
	}
}



