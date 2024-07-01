package Semana5;

public class SentencialIf03 {
   public static void main(String[] args) {
    //operadores de comparacion
    //Igual ==  a==b
    //
    int notafinal = 0;
    System.out.println("ingrese la nota final");
    notafinal = Integer.parseInt(System.console().readLine());

    if (notafinal >= 11) {
     System.out.println("Has aprobado");   
    }else{
        System.out.println("Has reprobado");
    }
} 
}
