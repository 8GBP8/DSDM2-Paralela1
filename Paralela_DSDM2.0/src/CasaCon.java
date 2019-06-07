
public class CasaCon extends Imovel {
//	implements Comparable<CasaCon> {

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
		
	//	public int compareTo(CasaCon imovel) {
		//	if (getTamanho() < imovel.getTamanho()) {
			//	return 1;
		//	}else if (getTamanho() > imovel.getTamanho()) {
		//		return -1;
		//	}
			
		//	return 0;
	//	}
	}
