package vetor28_07;

import java.util.Arrays;
import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número de linhas da matriz: ");
		Scanner scanner;
		int linhas = scanner.nextInt();
		System.out.println("digite o núnmero de colunas da matriz: ");
		int colunas = scanner.nextInt();
		// Cria a matriz com as dimençoes informadas
		int[][] matriz = new int[limhas][colunas];
		// solicita o usuario valores da matriz
		System.out.println("Digite os valores da matriz: ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Valor da pocição [" + i + "][" + j + "]");
				matriz[i][j] = scanner.nextInt();
			}

		}
		// Chama o metodo para somar o elementos da matriz
		int soma = somarElementosMatriz(matriz);
		//Exibe resultado
		System.out.println("A soam de todos os elementos da matiz é: "+ soma);
		scanner.close;
	


	

			}
	private void somarElementosMatriz() {
 
	for (int i = 0; i < matriz.length; i++) {
    	for (int j = 0; j < matriz.length[0]; j++) {
			soma += matriz [i][j];
			
		}
    	
	}
    return soma;
	}
}
