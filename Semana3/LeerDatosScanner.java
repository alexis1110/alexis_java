package Semana3;

import java.util.Scanner;

public class LeerDatosScanner {
   
   public static void main(String[] args) {
     
    Scanner lee = new Scanner(System.in);

    System.out.println("introduce tu nonbre y edad separados por un espacio");
String nonbre = lee.next();
int edad = lee.nextInt();

System.out.println("tu nonbre es:"+nonbre+",tu eda es:"+edad);

   } 

}
