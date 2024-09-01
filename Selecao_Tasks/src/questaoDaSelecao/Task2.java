package questaoDaSelecao;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contadorDeA = 0;
		String palavra = sc.nextLine();
		
		for ( int i = 0; i < palavra.length(); i++) {
			char a = palavra.charAt(i);
			if (a == 'a'|| a == 'A') {
				contadorDeA += 1;
			}
		}
		
		System.out.println(contadorDeA);

	}	

}
