
public class Ap extends Imovel{
	private String Condominio;
	private int Andar;
	
	public String getCondominio() {
		return Condominio;
	}

	public void setCondominio(String condominio) {
		Condominio = condominio;
	}

	public int getAndar() {
		return Andar;
	}

	public void setAndar(int andar) {
		Andar = andar;
	}
	
	public double CalcularImposto () {
		double tamanho = getTamanho();
		double imposto = 8.5 * tamanho;
		return imposto;
	}
 }
