import java.io.InputStream;
	import java.util.Scanner;

public class SalarioTotalFuncionario {

	public static void main(String[] args) {

	int salarioFixo = 0;
	int carrosVendidos = 0;
	int valorDasVendas = 0;
	int valorPorCarroVendido = 0;

	Scanner leia = new Scanner(System.in);

	System.out.println("Quantos carros foram vendidos pelo funcionario?");
	carrosVendidos = leia.nextInt();

	System.out.println("Qual o valor total das vendas efetuadas pelo funcion�rio?");
	valorDasVendas = leia.nextInt();

	System.out.println("Qual o sal�rio fixo do funcion�rio?");
	salarioFixo = leia.nextInt();

	System.out.println("Quanto o funcion�rio recebe por carro vendido?");
	valorPorCarroVendido = leia.nextInt();

	System.out.println("O sal�rio total do funcion�rio �: " + (salarioFixo + (valorPorCarroVendido * carrosVendidos) + (valorDasVendas*0.05)) + " Reais");

	}

	}
