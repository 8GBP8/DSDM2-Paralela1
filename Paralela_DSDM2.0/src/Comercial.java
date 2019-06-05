
public class Comercial extends Imovel {
	
	public double CalcularImposto () {
		double tamanho = getTamanho();
		double imposto = 10.7 * tamanho;
		return imposto;
	}
}
