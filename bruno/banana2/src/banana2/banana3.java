package banana2;

import java.util.Scanner;
public class banana3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner teclado = new Scanner(System.in);
      System.out.println("informe um número");
      int valor = teclado.nextInt();
      
      if(valor >= 0) {
    	  System.out.println(" O número é positivo" );
      }
      else {
    	  System.out.println(" O número negativo!");
      }
	}

}
