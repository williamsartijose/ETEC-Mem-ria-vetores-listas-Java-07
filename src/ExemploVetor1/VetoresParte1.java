package ExemploVetor1;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {

//	Fazer um programa para ler um n�mero inteiro N e a altura de N
//	pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
//	altura m�dia dessas pessoas.
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vect = new double [N];
		
		for(int i = 0; i < N; i++) {
			vect[i] = sc.nextDouble();	
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < N; i++) {
			sum += vect[i];
		}
		double avg = sum / N ;
		
		System.out.printf("AVERAGE HEIGHT: %2f%n", avg);
		sc.close();

	}

}
