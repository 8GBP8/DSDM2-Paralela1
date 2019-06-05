
public class Imovel {
	private int Id;
	private String Proprietario;
	private String Endereco;
	private double Tamanho;
	private int Ano;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}	
	public String getProprietario() {
		return Proprietario;
	}
	public void setProprietario(String proprietario) {
		Proprietario = proprietario;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public double getTamanho() {
		return Tamanho;
	}
	public void setTamanho(double tamanho) {
		Tamanho = tamanho;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	
	public double CalcularImposto () {
		double tamanho = getTamanho();
		double imposto = 10.7 * tamanho;
		return imposto;
	}
}
