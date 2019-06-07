
public class Comercial extends Imovel {
	//implements Comparable<Comercial> {
		public double CalcularImposto () {
			double tamanho = getTamanho();
			double imposto = 10.7 * tamanho;
			return imposto;
		}
		
		//public int compareTo(Comercial imovel) {
			//if (getTamanho() < imovel.getTamanho()) {
			//	return 1;
			//}else if (getTamanho() > imovel.getTamanho()) {
			//	return -1;
		//	}
			
			//return 0;
		//}
	}
