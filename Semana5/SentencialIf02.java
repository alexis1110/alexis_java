package Semana5;

public class SentencialIf02 {
  public static void main(String[] args) {
    int numero = 0;
    System.out.println("ingrese un numero entero");
    numero = Integer.parseInt(System.console().readLine());

    if (numero > 0) {
        System.out.println("el numero ingresado es positivo");
    }else{
        System.out.println("el numero ingresado es negativo");
    }    
        
    
  }   
}
