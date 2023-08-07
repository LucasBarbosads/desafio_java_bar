package java_bar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
      
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input=new Scanner(System.in);
		
		Conta a1=new Conta();
		System.out.println("Digite o sexo do cliente");
		a1.setSexo(input.next().charAt(0));
		while(a1.getSexo()!='F' && a1.getSexo()!='M') {
			System.out.println("Digite f para feminino e m para masculino");
			a1.setSexo(input.next().charAt(0));
		}
		System.out.println("Digite a quantidade de Cerveja");
		a1.setQuantidadeCerveja(input.nextInt());
		System.out.println("Digite a quantidade de Refrigerante");
		a1.setQuantidadeRefri(input.nextInt());
		System.out.println("Digite a quantidade de Espetinho");
		a1.setQuantidadeEspetinho(input.nextInt());
		System.out.println();
		
		System.out.println("Relatório");
		System.out.printf("Consumo = R$ %.2f\n", a1.consumo());
		System.out.println((a1.taxaCouvert()>0)?"Couvert = R$ 4.00": "Isento de Couvert");
		System.out.printf("Ingresso = R$ %.2f\n", a1.verificarSexo());
		System.out.println("");
		System.out.printf("Valor a pagar = R$ %.2f\n",a1.valorTotal());
		
		
	}
}
