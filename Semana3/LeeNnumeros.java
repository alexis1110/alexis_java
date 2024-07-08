package Semana3;

public class LeeNnumeros {
    public static void main(String[] args) {
       
        String linea;
         System.out.println("ingresa un numero");
         linea = System.console().readLine();
         int numero1;
         numero1 = Integer.parseInt(linea);
         System.out.println("ingresa el segundo numero");
         linea = System.console().readLine();
         int numero2;
         numero2 = Integer.parseInt(linea);


         int suma = numero1 + numero2;
         int resta = numero1 - numero2;
         int multiplicacion = numero1 * numero2;
         double division = (double)numero1 / (double)numero2;


         System.out.println("la suma es:"+ suma);
         System.out.println("la resta es:"+ resta);
         System.out.println("la multiplicacion es:" + multiplicacion);
         System.out.println("la division es:" + division);




    }
}

   
