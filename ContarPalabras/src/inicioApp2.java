
import java.util.Scanner;
public class inicioApp2  {
	public static int conteo= 0;
	public static int NumPalabras= 1; //Lo iniciamos a uno, Pues cuando escribamos no vamos a empezar con un espacio

	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe la palabra:\n");
		String palabra = teclado.nextLine();
		contarPalabras(palabra);
	}//main
	
	public static void contarPalabras(String palabra) {
		//Apartado de conteo de las letras
		char letra1;
		for(int i = 0; i< palabra.length();i++) {
			letra1 = palabra.charAt(i);
			if(letra1 == ' ') { //Declaramos que no sume al conteo si hay un espacio
				
			}
			else
				conteo++;
		}
		//Apartado de conteo de palabras
		char letra2;
		for(int i = 0; i< palabra.length();i++) {
			letra2 = palabra.charAt(i);
			if(letra2 == ' ') { //El espaciado nos sirve para localizar las palabras
				NumPalabras++;
			}
			
		}
			for (char j = 'a'; j <= 'z' ;j++) {
                            int numero = 0;
                            for(int k = 0; k < palabra.length();k++ ) {
				if(palabra.charAt(k) == j) {
                                    numero++;
                                    if (numero == 1){
                                        System.out.println("El caracter "+palabra.charAt(k)+ " se repite " + numero + " vez");
                                    }
                                    else{
                                        System.out.println("El caracter "+palabra.charAt(k)+ " se repite " + numero + " veces");
                                    }                                                                 
				}
                            }
                        }
                           
	/*	mostrarresultado(); //Metodo Que escribira los resultados por pantalla

	public static void mostrarresultado() {
		System.out.println("El total de caracteres es: "+ conteo);
		System.out.println("El total de palabras es: "+ NumPalabras);
		
	}//mostrarresultado*/
    }
}

