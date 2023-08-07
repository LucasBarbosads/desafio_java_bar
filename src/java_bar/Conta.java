package java_bar;

public class Conta {
     
	private char sexo;
	private int quantidadeCerveja;
	private int quantidadeRefri;
	private int quantidadeEspetinho;
	
	public double verificarSexo() {
		
		double ingresso=0;
		if(sexo=='F') {
			ingresso=8.00;
		}else if(sexo=='M'){
			ingresso=10.00;
		}
		return ingresso;
		
	}
	public double consumo() {
		double totalConsumo=this.quantidadeCerveja*5.00+this.quantidadeRefri*3.00+this.quantidadeEspetinho*7.00;
		return totalConsumo;
	}
	
	public double taxaCouvert() {
		double taxa=0;
		if(consumo()<30) {
			taxa=4.00;
		}
		return taxa;
	}
	
	public double valorTotal() {
		double total=verificarSexo()+consumo()+taxaCouvert();
		return total;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = Character.toUpperCase(sexo);
	}
	public int getQuantidadeCerveja() {
		return quantidadeCerveja;
	}
	public void setQuantidadeCerveja(int quantidadeCerveja) {
		this.quantidadeCerveja = quantidadeCerveja;
	}
	public int getQuantidadeRefri() {
		return quantidadeRefri;
	}
	public void setQuantidadeRefri(int quantidadeRefri) {
		this.quantidadeRefri = quantidadeRefri;
	}
	public int getQuantidadeEspetinho() {
		return quantidadeEspetinho;
	}
	public void setQuantidadeEspetinho(int quantidadeEspetinho) {
		this.quantidadeEspetinho = quantidadeEspetinho;
	}
	
}
