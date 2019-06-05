
public class CasaCon extends Imovel{
	
	private String Condominio;

	public String getCondominio() {
		return Condominio;
	}

	public void setCondominio(String condominio) {
		Condominio = condominio;
	}
	
	public double CalcularImposto () {
		double tamanho = getTamanho();
		double imposto = 9.0 * tamanho;
		return imposto;
	}
}
