package questaoDaSelecao;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int termo1 = 0, termo2 = 1, termo3 = 0;
		
		while (numero > termo3) {
			termo3 = termo1 + termo2;
			termo1 = termo2;
			termo2 = termo3;
		}
		if (numero == 0) {
			System.out.println("O número " + numero + "está na sequência" );
			
		}else if(numero == termo3) {
			System.out.println("O número " + " está na sequência");
		}else
			System.out.println("O número " + numero + " não faz parte da sequência");
	
	}
	
}
