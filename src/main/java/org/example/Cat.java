package org.example;

public class Cat {

    String nome;
    float peso;
    boolean ehArrisco;
    String cor;
    int idade;



    public void cochilar(){
        System.out.println(this.nome + " diz: ZzZz, gatinho a mimir");
    }

    public void brincar(){
        System.out.println(this.nome + " diz: Wooow, vamos brincar humano!");
    }

    public void comer(){
        System.out.println(this.nome + " diz: Nhom nhom nhom, delicia de ração");
    }

    public void comer(String comida){
        System.out.println(this.nome + " diz: Nhom nhom nhom, delicia de " + comida);
    }


    public Cat(String nome, float peso, boolean ehArrisco, String cor, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.ehArrisco = ehArrisco;
        this.cor = cor;
        this.idade = idade;
    }

    public Cat(String nome, String cor) {
        this.nome = nome;
        this.peso = 0.0f;
        this.ehArrisco = false;
        this.cor = cor;
        this.idade = 0;
    }





    public static void main(String[] args) {
        //System.out.println("ola");
        Cat pudim = new Cat("Pudim", 4.90f, true, "laranja", 2);
        Cat pingado = new Cat ("Pingado", 5.50f, false, "frajola", 2);
        Cat paozinho = new Cat ("Paozinho", 5.3f, true, "frajola", 4);
        //Cat bibi = new Cat("Ruby", 3.5f, false, "furia da noite", 3);
        Cat bibi = new Cat("Ruby","pretinha");

        pudim.comer();
        pingado.cochilar();
        paozinho.brincar();
        bibi.comer("petisco");


    }



}
