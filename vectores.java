public class vectores{
	public static void main(String args[]){
     //*con los corchetes le estoy avisando al sistema que esto sera un vector
     //* new int [5], aqui estoy diciendo que es un tipo de vector con datos enteros con 5 posiciones o se divida en 5
      int numeros[] = new int [5];
     // numero, nombre del vector que estamos utilizando 
     // la primera posicion de un vector simpre sera cero, si nosotros dijeramos que empieza en 1, la primera posicion quedaria basia

      numeros[0] = 5;
      numeros[1] = 220;
      numeros[2] = 8;
      numeros[3] = 458;
      numeros[4] = 22;

      System.out.print("[" + numeros [0] + "]");
      System.out.print("[" + numeros [1] + "]");
      System.out.print("[" + numeros [2] + "]");
      System.out.print("[" + numeros [3] + "]");
      System.out.print("[" + numeros [4] + "]");
      	}


}