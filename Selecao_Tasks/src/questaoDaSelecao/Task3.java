package questaoDaSelecao;
public class Task3 {
	public static void main(String[] args) {
		
		int INDICE = 12, SOMA = 0, K = 1;
		
		do {
			K = K + 1;
			SOMA = SOMA + K;
		}while (K < INDICE);
		
		System.out.println(SOMA);
	}

}



