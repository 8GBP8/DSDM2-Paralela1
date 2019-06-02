
public class Moto {
	
	//Atributos
	private String Placa;
	private int Ano;
	private String Marca;
	private String Modelo;
	private double Valor;
	private double Quilometragem;
	
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
	
	//Calculo do Imposto
	public double calImposto(double Valor) {
		double Imposto = Valor * 0.025;
		return Imposto;
	}
}
