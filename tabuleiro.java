import package;

public class tabuleiro {

	int numeroColunas;
	int numeroLinhas;
	
	Matriz matrizTabuleiro[];
	
	public tabuleiro(int coluna, int linha){
		 numeroColunas = coluna;
		 numeroLinhas = linha;
		 
		 matrizTabuleiro = new Matriz[coluna][linha];
	}
	
	public boolean posicaoNula (int coluna, int linha){
		vazio = matrizTabuleiro[coluna][linha] == null;
		return vazio;
	}
	
	public int getColunas() {
		return numeroColunas;
	}
	
	public int getLinhas() {
		return numeroLinhas;
	}
	
	public Matriz getMatriz (int coluna, int linha){
		devolveMatriz = matrizTabuleiro[coluna][linha];
		return devolveMatriz;
	}
	
	public matrizCompleta (int coluna) {
		for (int linha=0; linha<numeroLinhas; colunas++){
			if (matrizTabuleiro[coluna][linha] == null){
				return false;
			}
		}
		return true;
	}
	
	public {
		random r = new Random 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
