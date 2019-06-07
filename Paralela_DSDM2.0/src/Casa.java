
public class Casa extends Imovel {
	//implements Comparable<Casa> {
		public double CalcularImposto () {
			double tamanho = getTamanho();
			double imposto = 7.0 * tamanho;
			return imposto;
		}
	//	
	//	public int compareTo(Casa imovel) {
	//		if (getTamanho() < imovel.getTamanho()) {
	//			return 1;
	//		}else if (getTamanho() > imovel.getTamanho()) {
	//			return -1;
	//		}
	//		
	//		return 0;
	//	}
	}
