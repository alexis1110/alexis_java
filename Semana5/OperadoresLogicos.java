package Semana5;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("adivina el numero que estoy pensando");
        System.out.println("ingresa un numero estre el 1 y el 100");
        numero =Integer.parseInt(System.console().readLine());
        
        if ((numero < 1) || (numero > 100)){
            System.out.println("el numero ingresado debe estar entre 1 - 100");
            System.out.println("tienes otra oportunidad, ingrese un numero");
            numero =Integer.parseInt(System.console().readLine());
}
            if (numero == 15){
                System.out.println("has acertado!!!!");
            }else{
                System.out.println("lo siento, ese no es el numero que estoy pensando!");
            }
    }
}
