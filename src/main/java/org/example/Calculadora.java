package org.example;

public class Calculadora {
    private double valor1;
    private double valor2;

    private double somar(){
        return valor1 + valor2;
    }

    private double subtrair(){
        return valor1 - valor2;
    }

    private double multiplicar(){
        return valor1 * valor2;
    }

    private double dividir(){
        if (valor2 != 0){
            return valor1 / valor2;
        }
        else {
            System.out.println("Erro: Não é possivel dividir por zero.");
            //Retornando um valor Not A Number caso o usuário tente realizar a divisão por zero
            return Double.NaN;
        }
    }

    public double calcular(String operacao){
        switch (operacao){
            case "+":
                return somar();
            case "-":
                return subtrair();
            case "*":
                return multiplicar();
            case "/":
                return dividir();
            default:
                System.out.println("Erro: Operador inválido");
                return Double.NaN;
        }

    }


    //CONTRUTORES
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //GETTERS
    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10,5);

        //Métodos acessíveis somente dentro da classe
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());

    }

}
