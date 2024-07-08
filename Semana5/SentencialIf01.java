package Semana5;

public class SentencialIf01 {
    
public static void main(String[] args) {
    String respuesta = "";
    System.out.println("¿cual es la capital de venesuela?");
    respuesta = System.console().readLine();
    if (respuesta.equals("caracas")) {
        System.out.println("eres un genio, debes estar en sistemas");
        }else{
            System.out.println("Recoje tu pico y pala, ve a la chacra");
        }
}
}
