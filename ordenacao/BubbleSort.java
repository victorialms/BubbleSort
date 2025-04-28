package ordenacao;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];

	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        Arrays.sort(numeros);

	        System.out.println("\nNúmeros em ordem crescente:");
	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }

	        scanner.close();}
	}
