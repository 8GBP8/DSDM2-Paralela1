
public class Passeio {
	
	//Atributos
	private String Placa;
	private int Ano;
	private String Marca;
	private String Modelo;
	private double Valor;
	private double Quilometragem;
	private int Assentos;
	private double Seguro = 0.01;
	
	// Getters e Setters dos atributos
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public double getQuilometragem() {
		return Quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		Quilometragem = quilometragem;
	}
	public int getAssentos() {
		return Assentos;
	}
	public void setAssentos(int assentos) {
		Assentos = assentos;
	}
	public double getSeguro() {
		return Seguro;
	}
	public void setSeguro(double seguro) {
		Seguro = seguro;
	}
	
	public double calSeguro(double Valor) {
		this.Valor = this.Valor * this.Seguro;
		return this.Valor;
	}
	//Calculo do Imposto
		public double calImposto(double Valor) {
			this.Valor = calSeguro(this.Valor);
			double Imposto = this.Valor * 0.05;
			return Imposto;
		}
}
