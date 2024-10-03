// Programa que toma 20 números generados aleatoriamente, preguntando si se quieren resaltar aquellos números
// que son múltiplos de 5 o de 7 y mostrándolos en pantalla
import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		// Inicialización y asignación de array con números	
		int[] n = new int[20];
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    // Seleccion de opción
	    Scanner sc = new Scanner(System.in);
	    System.out.print("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(sc.next());
	    // Definir opción
	    int multiplo = (opcion == 1)? 5:7;
	    // Imprimir números resaltados con base en opción
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {
	    	  System.out.print(e + " ");
	      }//else
	    }//foreach
	    sc.close();
	}//main
}//class Codigo6
