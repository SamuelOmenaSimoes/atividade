package Dados;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero a ser adivinhado:");
		int adivinhador = sc.nextInt();
		int numeroSecreto = adivinhador;
        int tentativa = 0;

        System.out.println("Bem-vindo ao jogo da adivinhação!");
        System.out.println("Tente adivinhar o número.");

        while (tentativa != numeroSecreto) {
            System.out.print("Digite sua tentativa: ");
            tentativa = sc.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("é um numero maior");
            } else if (tentativa > numeroSecreto) {
                System.out.println("é um numero menor");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
		
        System.out.println("Digite o valor em Reais:");
        double valorEmReais = sc.nextDouble();
        
        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1: Dólar");
        System.out.println("2: Euro");
        System.out.println("3: Libra");
        int escolha = sc.nextInt();
        
        double taxaConversao = 0;
        String moeda = "";
        
        switch (escolha) {
            case 1:
                taxaConversao = 0.19;
                moeda = "Dólares";
                break;
            case 2:
                taxaConversao = 0.18;
                moeda = "Euros";
                break;
            case 3:
                taxaConversao = 0.15;
                moeda = "Libras";
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }
        
        double valorConvertido = valorEmReais * taxaConversao;
        System.out.printf("O valor em %s é: %.2f%n", moeda, valorConvertido);
        
        
               

                
                System.out.println("Digite o valor do empréstimo: ");
                double valorEmprestimo = sc.nextDouble();

                System.out.println("Digite a quantidade de parcelas (1, 3, 6, 12): ");
                int parcelas = sc.nextInt();

                double valorTotal = 0;

                switch (parcelas) {
                    case 1:
                        valorTotal = valorEmprestimo;
                        break;
                    case 3:
                        valorTotal = valorEmprestimo * 1.02;
                        break;
                    case 6:
                        valorTotal = valorEmprestimo * 1.05;
                        break;
                    case 12:
                        valorTotal = valorEmprestimo * 1.10;
                        break;
                    default:
                        System.out.println("Número de parcelas inválido.");
                        sc.close();
                        return;
                }

                System.out.println("O valor total a ser pago é: R$ " + valorTotal);
                
                
                
                
                System.out.println("Digite o número de alunos:");
                int numeroDeAlunos = sc.nextInt();
                
                double somaDasNotas = 0;
                
                for (int i = 0; i < numeroDeAlunos; i++) {
                    System.out.printf("Digite a nota do aluno %d:%n", i + 1);
                    double nota = sc.nextDouble();
                    somaDasNotas += nota;
                }
                
                double media = somaDasNotas / numeroDeAlunos;
                System.out.printf("A média das notas dos alunos é: %.2f%n", media);
                
                
                
                
                 int soma = 0, contador = 0, numero;
                do {
                    System.out.println("Digite um número (ou 0 para terminar): ");
                    numero = sc.nextInt();
                    
                    if (numero != 0) {
                        soma += numero;
                        contador++;
                    }
                } while (numero != 0);

                if (contador > 0) {
                	double mediaa = (double) soma / contador;
                    System.out.println("A média dos números é: " + mediaa);
                } else {
                    System.out.println("Nenhum número foi inserido.");
                }
		
                
                while (true) {
                    System.out.println("Digite um número (ou digite 0 para sair):");
                    int num = sc.nextInt();
                    
                    if (num == 0) {
                        break;
                    }
                    
                    if (num % 2 == 0) {
                        System.out.println("O número " + num + " é par.");
                    } else {
                        System.out.println("O número " + num + " é ímpar.");
                    }
                }
                
                System.out.println("Programa encerrado.");
                
                
                System.out.println("Digite um numero para ver seu fatorial: ");
                int fatorial = sc.nextInt();
                
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
                
            
		sc.close();

	}

}
