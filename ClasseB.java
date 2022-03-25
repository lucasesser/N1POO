public class ClasseB {
    String nome;
    String tamanho;
    String cor;
    String sobrenome;

    classeb(String nome){
        this.nome = nome;
    }

    classeb(String nome, String tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    classeb(String nome, String tamanho, String cor){
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }    

    void escreverNome(){
        System.out.println("O nome do cachorro é: " +nome);
    }

    void escreverCor(){
        System.out.println("A cor do " +nome+ " é " +cor);
    }

    void escreverTamanho(){
        System.out.println("Ele tem um tamanho " +tamanho);
    }
}