package Semana3;

public class Ejercicios1 {

    public static void main(String[] args){

    int euros;
    double soles; 

    System.out.println("ingrese un monto en euros");
    euros = Integer.parseInt(System.console().readLine()); 
    soles = euros*4.09;
System.out.println("el valor en soles es"+soles);}
    
}
