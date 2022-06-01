import java.util.Scanner;


public class VectoresDinamicos{
	public static void main(String args[]){
 
 int longitud = 0;
 	Scanner entrada = new Scanner(System.in);
  //*en scanner guardaremos la informacion que necesitamos

 	//*no podemos declarar el vector por que no sabemos el tamaño que el usuario quiere que tenga
 	//*entonces le preguntaremos al usuario, cual va a ser el tamaño de nuestro vector

 	System.out.print("¿Cuantos numeros deseas ingresar?");
 	longitud = entrada.nextInt();

 	//*ahora declaramos nuestro vector y lo llamaremos numero
 	//*entonces diremos que tenemos un new, osea un nuevo vector y que tiene posiciones de tipo entero
  //*y donde dice longitud pondremos el numero de cuadrados que deseamos


    int numeros[] = new int[longitud];


    //*continuaremos preguntandole a nuestro usuario que datos va a ingresar y que numero ocupara cada posicion
    //* esta bariable "for(int = 0)" nos va a ayudar a identificar el indice
    //*default:
      
    //*length tambien sirve para vectores para saber el numero o tamaño de posiciones que tiene
    for(int i = 0; i < numeros.length; i++){
      System.out.println("porfavor dame el valor #" + (i + 1));
      numeros[i] = entrada.nextInt();
    } 
    for(int i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
     }

 		}


}