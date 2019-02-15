package Exerc01Java;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] args){
        System.out.println("Entre com o valor da conta");
        Scanner s = new Scanner(System.in);
          double conta = s.nextDouble();
          double resultado = conta * 1.1;
        System.out.println("O Valor da conta é:" + resultado);
    }
}
