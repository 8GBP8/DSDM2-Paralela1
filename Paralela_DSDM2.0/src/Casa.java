
public class Casa extends Imovel{
	
	public double CalcularImposto () {
		double tamanho = getTamanho();
		double imposto = 7.0 * tamanho;
		return imposto;
	}
}
