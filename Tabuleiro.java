package Smoothy;

//import Matriz;
import java.util.*;

public class Tabuleiro {
	
	public class tabuleiro {
	
	int [][]Matriz;
	
	    int numeroColunas;
	    int numeroLinhas;
	
	    public tabuleiro(int coluna, int linha){
	         this.numeroColunas = coluna;
	         this.numeroLinhas = linha;
	         this.Matriz = new int[coluna][linha];
	
	    }
	
	    public int getColunas() {
	        return numeroColunas;
	    }
	
	    public int getLinhas() {
	        return numeroLinhas;
	    }
	
	    public void preencher (int a, int s){
	        Random al = new Random(s);
	         for (int x = 0; x < numeroLinhas; x++) {
	            for (int y = 0; y < numeroColunas; y++) {
	                Matriz[x][y] = al.nextInt(a) +1;
	            }
	
	         }
	         
	    }
	    public void getMatriz(){
	        for (int i=0; i<numeroLinhas; i++){
	            for(int p=0; p<numeroColunas; p++){
	                System.out.print(Matriz[i][p]+"  ");
	            }
	            System.out.println(" ");
	        }
	    }
	
	    
	}
}