package Dados;

import java.util.Scanner;

public class TipoDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		double fa = (celsius * 9/5) + 32;
		double kel = celsius + 273.15;
		System.out.println("celsius convertido em fa é:" +fa+ "e em kelvin é: " +kel);
		
		
		System.out.println("Digite o Capital Inicial: ");
		double cap = sc.nextDouble();
		System.out.println("Digite a taxa de juros em %: ");
		double txj = sc.nextDouble();
		System.out.println("Digite o tempo em meses: ");
        double tempo = sc.nextDouble();
		double taxaDecimal = txj / 100;
        double montante = cap * Math.pow(1 + taxaDecimal, tempo);
		System.out.println("o montante é de: " + montante);
		
		
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
		System.out.println("a media é de: " +media );
		
		
		System.out.println("Digite o Capital Inicial: ");
		double capi = sc.nextDouble();
		System.out.println("Digite a taxa de juros em %: ");
		double txju = sc.nextDouble();
		System.out.println("Digite o tempo em meses: ");
        double temp = sc.nextDouble();
		double taxaDeci = txju / 100;
        double montant = capi * (1 + taxaDeci * temp);
		System.out.println("o montante é de: " + montant);
		
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		double area = 3.14 * Math.pow(raio,2);
		double peri = 2 * 3.14 * raio;
		System.out.println("a area é de: " +area+ "e perimetro de: " +peri);
		
		
		sc.close();
	}

}