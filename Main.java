package Smoothy;

//import Matriz;  
import java.util.*;

public class Main {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    System.out.println("######## MENU ########" + "\n");
	    System.out.println("Tamanho do tabuleiro:");
	    int r = input.nextInt();
	    while (true) {
	        input.nextInt();
	        try{
	            if(r < 0 && r > 6){
	                break;
	            }
	            System.out.println("Input Inválido\n");
	            System.out.println("Tente Novamente:");
	        }
	        catch(NumberFormatException | InputMismatchException e){
	            System.out.println("Input Inválido\n");
	            System.out.println("Tente Novamente:");    
	        }
	        catch (ClassNotFoundException e){
	            System.out.println(e.getMessage());
	        }
	    }
	    System.out.println("Número de tipo de peças(entre 3 e 6):" );
	    int c = input.nextInt();
	    while (true) {
	        input.nextInt();
	        try{
	            if(c > 2 && c < 7){
	                break;
	            }
	            System.out.println("Input Inválido\n");
	            System.out.println("Tente Novamente:");
	        }
	        catch(NumberFormatException | InputMismatchException e){
	            System.out.println("Input Inválido");
	            System.out.println("Tente Novamente:");    
	        }
	        catch (ClassNotFoundException e){
	            System.out.println(e.getMessage());
	        }
	    }
	    System.out.println("Raiz:");
	    int s = input.nextInt();
	    while (true) {
	        input.nextInt();
	        try{
	            if(s > 0 && s < 6){
	                break;
	            }
	            System.out.println("Input Inválido\n");
	            System.out.println("Tente Novamente:");
	        }
	        catch(NumberFormatException | InputMismatchException e){
	            System.out.println("Input Inválido");
	            System.out.println("Tente Novamente:");    
	        }
	        catch (ClassNotFoundException e){
	            System.out.println(e.getMessage());
	        }
	    }

	    tabuleiro tabu = new tabuleiro(r,r);
	    tabu.preencher(c,s);
	    while(true){
	        tabu.getMatriz();
	        System.out.println("Por favor insire a linha da jogada ");
	        int x = input.nextInt();
	        if (x<0 || x>=tabu.getLinhas()){
	            System.out.println("insira outro valor:");
	            x = input.nextInt();}



	        System.out.println("Por favor insire a coluna da jogada ");
	        int y = input.nextInt();
	        if (y<0 || y >= tabu.getColunas()){
	            System.out.println("insira outro valor:");
	            y = input.nextInt();}
	        int j = tabu.getValor(x,y);

	        tabu.jogo(x,y,j);
	        tabu.baixar();

	    }


	}
	
	
	input.close();
	
	tabuleiro tabu = new tabuleiro(r,r);
	
	tabu.preencher(c,s);
	tabu.getMatriz();
	
	
	}
}
