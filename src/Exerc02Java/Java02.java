package Exerc02Java;

import java.util.Scanner;

public class Java02 {
    public static void main(String[] args){
        System.out.println("Entre com o valor do RAIO");
         Scanner s = new Scanner(System.in);
          double R = s.nextDouble();
        System.out.println("Entre com o valor da ALTURA");
         Scanner d = new Scanner(System.in);
          double altura = d.nextDouble();
        double volume = 3.141559 * Math.pow(R,2) * altura;
        System.out.println("O volume é:" + volume);



    }
}
