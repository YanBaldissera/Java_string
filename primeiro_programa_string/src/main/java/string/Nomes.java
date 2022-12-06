package string;

public class Nomes {

    public static void main(String[] args){

        var nome = "Yan";
        var sobreNome = " Baldissera";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do clinte: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);
        final var mensagem = String.format("O cliente %s possui o  sobrenome %s", nome, sobreNome);
        System.out.println(mensagem);



        var Novo = " Minha string ";

        System.out.println("Char na posição [5]: " + Novo.charAt(5));
        System.out.println("Quantidade= " + Novo.length());
        System.out.println("Sem trim [" + Novo + " ]");
        System.out.println("Com trim [" + Novo.trim() + "]");
        System.out.println("Lower " + Novo.toLowerCase());
        System.out.println("Upper" + Novo.toUpperCase());
        System.out.println("Contém M: " + Novo.contains("M"));
        System.out.println("Contém X: " + Novo.contains("X"));
        System.out.println("Replace" + Novo.replace( "n",  "$"));
        System.out.println("Equals: " + Novo.equals(" Minha string "));
        System.out.println("EqualsIgnoreCase: " + Novo.equalsIgnoreCase(" minha sTring "));
        System.out.println("Substring(1,6)= " + Novo.substring(1, 6));

    }
}
