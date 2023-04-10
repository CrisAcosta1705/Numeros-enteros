package NuemeroEnteros;
import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese un número entero (0 para salir): ");

	    int numero = scanner.nextInt();

	    while (numero != 0) {
	      System.out.println(numero);
	      System.out.println("Ingrese otro número entero (0 para salir): ");
	      numero = scanner.nextInt();
	    }

	    scanner.close();
	  }
	
	}

