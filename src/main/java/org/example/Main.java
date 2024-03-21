package org.example;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10,0);

        double soma = calc.calcular("+");
        double subtracao = calc.calcular("-");
        double divisao = calc.calcular("/");
        double multiplicacao = calc.calcular("*");


        System.out.println(calc.getValor1() + " + " + calc.getValor2() + " = " + soma);
        System.out.println(calc.getValor1() + " - " + calc.getValor2() + " = " + subtracao);
        System.out.println(calc.getValor1() + " * " + calc.getValor2() + " = " + multiplicacao);
        System.out.println(calc.getValor1() + " / " + calc.getValor2() + " = " + divisao);

        // valor1 + valor2 = resultado
        // 10 + 5 = 15

    }

}
