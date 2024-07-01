package Solotarea;

public class Ejercicio1 {
    public static void main(String[] args) {
        
  
    int pesetas;
    double euros; 

    System.out.println("ingrese un monto en pesetas");
    pesetas = Integer.parseInt(System.console().readLine()); 
    euros = pesetas*0.00601;
System.out.println("el valor en euros es"+euros);
}
  }