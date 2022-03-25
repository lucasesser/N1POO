public class ClasseC {
    String nome;
    String sobreNome;
    String fone;
    String rua;
    String numero;
    String bairro;
    String altura;
    String caracteristica;

    String donoCompleto(){
        String nomeCompleto = nome +" "+ sobreNome;
        return nomeCompleto;
    }

    String donoEndereco(){
        String endereco = rua +" "+ numero +" "+ bairro;
        return endereco;
    }

    String visual(){
        String visualDono = altura +" e "+ caracteristica;
        return visualDono;
    }
}
