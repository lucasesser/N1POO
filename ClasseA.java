public class ClasseA {
    public static void main(String[] args){
        ClasseB cachorro = new ClasseB();
        ClasseC dono = new ClasseC();

        cachorro.cor = "caramelo";
        cachorro.tamanho = "pequeno";
        cachorro.nome = "totó";
        cachorro.sobrenome = "da silva";

        dono.nome = "Lucas";
        dono.sobreNome = "Esser";
        dono.fone = "6684589458";
        dono.altura = "alto";
        dono.rua = "das tulipas";
        dono.numero = "503";
        dono.bairro = "recanto";
        dono.caracteristica = "magro";

        String nomeDono = dono.donoCompleto();
        String enderecoDono = dono.donoEndereco();
        String visualDono = dono.visual();

        cachorro.escreverNome();
        cachorro.escreverCor();
        cachorro.escreverTamanho();

        System.out.println("O nome do dono é " +nomeDono);
        System.out.println("Ele mora na " +enderecoDono);
        System.out.println("Visual: " +visualDono);
    }
}
