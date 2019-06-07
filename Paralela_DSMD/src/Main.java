
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//variaveis alternativas
		String let;
		int num;
		double nump;
		String x = "1";
		Moto e = new Moto();
		Passeio p = new Passeio();
		Suv s = new Suv();
		
		//Listas criadas
		List<Moto> listaMoto = new ArrayList<Moto>();
		List<Passeio> listaPasseio = new ArrayList<Passeio>();
		List<Suv> listaSuv = new ArrayList<Suv>();
		List<Double> desordem = new ArrayList<Double>();
		
		//Scanner para a entrada de dados
		Scanner entrada = new Scanner (System.in);
		
		while(x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4")) {
			//Solicitação de dados
			System.out.println("Escolha uma opcao: ");
			System.out.println("1- Cadastrar um veiculo.");
			System.out.println("2- Remover um veiculo.");
			System.out.println("3- Valor Anual dos impostos. ");
			System.out.println("4- Lista do valor dos veiculos.");
			System.out.println("Digite qualquer outro valor para sair.");

			x = entrada.next();
			
			//Decide o que fazer
			if (x.equals("1")) {
				// Entra para cadastrar veiculo
				System.out.println("Escolha um tipo: ");
				System.out.println("1- Moto.");
				System.out.println("2- Passeio ");
				System.out.println("3- SUV");
				x = entrada.next();
				
				//Decide qual veiculo vai ser cadastrado
				//Cadastra motos
				if (x.equals("1")) {
					
					Moto moto = new Moto();
					
					//Pede e Recebe os dados
					System.out.println("Digite a Placa:");
					let = entrada.next();
					moto.setPlaca(let);
					System.out.println("Digite o Ano:");
					num = entrada.nextInt();
					moto.setAno(num);
					System.out.println("Digite o Marca:");
					let = entrada.next();
					moto.setMarca(let);
					System.out.println("Digite o Modelo:");
					let = entrada.next();
					moto.setModelo(let);
					System.out.println("Digite o Valor");
					nump = entrada.nextDouble();
					moto.setValor(nump);
					System.out.println("Digite a Quilometragem:");
					nump = entrada.nextDouble();
					moto.setQuilometragem(nump);
					
					listaMoto.add(moto);
								
				}else if (x.equals("2")) {
					
					//Pede e recebe os dados
					Passeio passeio = new Passeio();
					
					System.out.println("Digite a placa:");
					let = entrada.next();
					passeio.setPlaca(let);
					System.out.println("Digite o ano:");
					num = entrada.nextInt();
					passeio.setAno(num);
					System.out.println("Digite a marca:");
					let = entrada.next();
					passeio.setMarca(let);
					System.out.println("Digite o modelo:");
					let = entrada.next();
					passeio.setModelo(let);
					System.out.println("Digite o valor:");
					nump = entrada.nextDouble();
					passeio.setValor(nump);
					System.out.println("Digite a quilometragem:");
					nump = entrada.nextDouble();
					passeio.setQuilometragem(nump);
					System.out.println("Digite a quantidade de assentos:");
					num = entrada.nextInt();
					passeio.setAssentos(num);
					
					listaPasseio.add(passeio);
	
				}else if (x.equals("3")) {
					//Pede e recebe os dados
					Suv suv = new Suv();
					
					System.out.println("Digite a placa:");
					let = entrada.next();
					suv.setPlaca(let);
					System.out.println("Digite o ano:");
					num = entrada.nextInt();
					suv.setAno(num);
					System.out.println("Digite a marca:");
					let = entrada.next();
					suv.setMarca(let);
					System.out.println("Digite o modelo:");
					let = entrada.next();
					suv.setModelo(let);
					System.out.println("Digite o valor:");
					nump = entrada.nextDouble();
					suv.setValor(nump);
					System.out.println("Digite a quilometragem:");
					nump = entrada.nextDouble();
					suv.setQuilometragem(nump);
					System.out.println("Digite a quantidade de assentos:");
					num = entrada.nextInt();
					suv.setAssentos(num);
					
					listaSuv.add(suv);
					
				}else {
					System.out.println("Erro.");
				}		
			}
			
			//Caso escolhido a segunda opção, de exclusão, entra nesse if
			else if(x.equals("2")) {
				
				//Solicita uma maior especificação
				System.out.println("1- Moto.");
				System.out.println("2- Passeio ");
				System.out.println("3- SUV");
				x = entrada.next();
				
				if (x.equals("1")) {
					
					//Visualizar os objetos da lista
					for(int i = 0;i<listaMoto.size();i++) {
						e = listaMoto.get(i);
						System.out.println(e);
						
						System.out.println("Informações: ");
						
						let = e.getPlaca();
						System.out.println("Placa: " + let);
						num = e.getAno();
						System.out.println("Ano: " + num);
						let = e.getMarca();
						System.out.println("Marca: " + let);
						let = e.getModelo();
						System.out.println("Modelo: " + let);
						nump = e.getValor();
						System.out.println("Valor: " + nump);
						nump = e.getQuilometragem();
						System.out.println("Quilometragem: " + nump);
						
						//Espaço
						System.out.println();

					}
					
					System.out.println("Digite o numero da moto a ser excluida: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaMoto.size()) {
						listaMoto.remove(num);
					}
				}else if(x.equals("2")) {
					//Visualizar os objetos da lista
					for(int i = 0;i<listaPasseio.size();i++) {
						
						p = listaPasseio.get(i);
						System.out.println(p);
						
						System.out.println("Informações: ");
						
						let = p.getPlaca();
						System.out.println("Placa: " + let);
						num = p.getAno();
						System.out.println("Ano: " + num);
						let = p.getMarca();
						System.out.println("Marca: " + let);
						let = p.getModelo();
						System.out.println("Modelo: " + let);
						nump = p.getValor();
						System.out.println("Valor: " + nump);
						nump = p.getQuilometragem();
						System.out.println("Quilometragem: " + nump);
						num = p.getAssentos();
						System.out.println("Assentos: " + num);

						//Espaço
						System.out.println();

					}
					
					System.out.println("Digite o numero do carro a ser excluida: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaPasseio.size()) {
						listaPasseio.remove(num);
					}
				}else if(x.equals("3")) {
					//Visualizar os objetos da lista
					for(int i = 0;i<listaSuv.size();i++) {
						
						s = listaSuv.get(i);
						System.out.println(s);
						
						System.out.println("Informações: ");
						
						let = s.getPlaca();
						System.out.println("Placa: " + let);
						num = s.getAno();
						System.out.println("Ano: " + num);
						let = s.getMarca();
						System.out.println("Marca: " + let);
						let = s.getModelo();
						System.out.println("Modelo: " + let);
						nump = s.getValor();
						System.out.println("Valor: " + nump);
						nump = s.getQuilometragem();
						System.out.println("Quilometragem: " + nump);
						num = s.getAssentos();
						System.out.println("Assentos: " + num);

						//Espaço
						System.out.println();

					}
					
					System.out.println("Digite o numero do carro a ser excluida: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaSuv.size()) {
						listaSuv.remove(num);
					}
				}else {
					System.out.println("Erro!");
				}
				
				
			}
			
			else if (x.equals("3")) {
				
				System.out.println("Escolha um tipo: ");
				System.out.println("1- Moto.");
				System.out.println("2- Passeio ");
				System.out.println("3- SUV");
				x = entrada.next();
				
				if (x.equals("1")) {
					//Visualizar os objetos da lista
					for(int i = 0;i<listaMoto.size();i++) {
						e = listaMoto.get(i);
						System.out.println(e);
						
						System.out.println("Informação: ");
						
						nump = e.getValor();
						System.out.println("Valor: " + nump);
	
						//Espaço
						System.out.println();
					}
					
					System.out.println("Digite o numero da moto a ser calaculado o imposto: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaMoto.size()) {
						nump = e.getValor();
						nump = e.calImposto(nump);
						System.out.println(nump);
					}
				}else if (x.equals("2")) {
					//Visualizar os objetos da lista
					for(int i = 0;i<listaPasseio.size();i++) {
						p = listaPasseio.get(i);
						System.out.println(p);
						
						System.out.println("Informação: ");
						
						nump = p.getValor();
						System.out.println("Valor: " + nump);
	
						//Espaço
						System.out.println();
					}
					
					System.out.println("Digite o numero do carro a ser calaculado o imposto: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaPasseio.size()) {
						nump = p.getValor();
						nump = p.calImposto(nump);
						System.out.println(nump);
					}
				}else if (x.equals("3")) {
					//Visualizar os objetos da lista
					for(int i = 0;i<listaSuv.size();i++) {
						s = listaSuv.get(i);
						System.out.println(s);
						
						System.out.println("Informação: ");
						
						nump = s.getValor();
						System.out.println("Valor: " + nump);
	
						//Espaço
						System.out.println();
					}
					
					System.out.println("Digite o numero do carro a ser calaculado o imposto: ");
					num = entrada.nextInt();
					num = num - 1;
					
					if (num >= 0 && num < listaSuv.size()) {
						nump = s.getValor();
						nump = s.calImposto(nump);
						System.out.println(nump);
					}
				}
			}else if(x.equals("4")) {
				
				System.out.println("Escolha um tipo: ");
				System.out.println("1- Moto.");
				System.out.println("2- Passeio ");
				System.out.println("3- SUV");
				x = entrada.next();
				
				if (x.equals("1")) {
					for(int i = 0;i<listaMoto.size();i++) {
						e = listaMoto.get(i);					
						nump = e.getValor();
						desordem.add(nump);
					}
					
					double m1;
					double m2;
					double m3;
					
					for(int i = desordem.size() - 1;i >= 0; i--) {
						for(int j = 1;j <= i; j++) {
							m1 = desordem.get(j-1);
							m2 = desordem.get(j);
							if(m1 < m2) {
								m3 = m1;
								desordem.set(j-1, m2);
								desordem.set(j, m3);
							}
						}
					}
					
					System.out.println("A ordem decrescente eh: ");
	
					for(int i = 0;i< desordem.size();i++) {
						System.out.println(desordem.get(i));
					}
					
				}else if (x.equals("2")) {
					for(int i = 0;i<listaPasseio.size();i++) {
						p = listaPasseio.get(i);					
						nump = p.getValor();
						desordem.add(nump);
					}
					
					double p1;
					double p2;
					double p3;
					
					for(int i = desordem.size() - 1;i >= 0; i--) {
						for(int j = 1;j <= i; j++) {
							p1 = desordem.get(j-1);
							p2 = desordem.get(j);
							if(p1 < p2) {
								p3 = p1;
								desordem.set(j-1, p2);
								desordem.set(j, p3);
							}
						}
					}
					
					System.out.println("A ordem decrescente eh: ");
	
					for(int i = 0;i< desordem.size();i++) {
						System.out.println(desordem.get(i));
					}
					
				}else if (x.equals("3")) {
					for(int i = 0;i<listaSuv.size();i++) {
						s = listaSuv.get(i);					
						nump = s.getValor();
						desordem.add(nump);
					}
					double s1;
					double s2;
					double s3;
					
					for(int i = desordem.size() - 1;i >= 0; i--) {
						for(int j = 1;j <= i; j++) {
							s1 = desordem.get(j-1);
							s2 = desordem.get(j);
							if(s1 < s2) {
								s3 = s1;
								desordem.set(j-1, s2);
								desordem.set(j, s3);
							}
						}
					}
					
					System.out.println("A ordem decrescente eh: ");
	
					for(int i = 0;i< desordem.size();i++) {
						System.out.println(desordem.get(i));
					}
					
				}else {
					System.out.println("Erro!");
				}
			}else {
				System.out.println("Erro. Essa opção não foi encontrada.");
			}
		}
	}
}