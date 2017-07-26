import package;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Smoothy {

	
	Scanner R = new Scanner(System.in);
	public static void menu throws InterruptedException{
        int intInputValue = 0;
        int vezesMenu = 0;
        boolean exit = true;
        while(exit == true){
            if(vezesMenu != 0){
            vezesMenu++;
            System.out.println("######## MENU ########" + "\n");
            System.out.println("Tamanho do tabuleiro:");
            R.nextInt();
            
            System.out.println("Coordenadas da peça:");
            System.out.println("Sair");
            System.out.println("######################\n");
            System.out.println("Opção: ");
            while(true){
                String R = in.next();
                try{
                    intInputValue = Integer.parseInt(R);
                    if(intInputValue > 0 && intInputValue < 6){
                        break;
                    }
                    System.out.println("Input Inválido\n");
                    System.out.println("Tente Novamente:");
                }
                catch(NumberFormatException | InputMismatchException e){
                    System.out.println("Input Inválido");
                    System.out.println("Tente Novamente:");
                }
            }
            Scanner novo = new Scanner(System.in);
            try {
            	case 1:
            		break;
            	case 2:
            		break;
            	case 3:
            		break;
            		
            }
	
            }
            
	public static void main(String[] args) {
		

	}

}
