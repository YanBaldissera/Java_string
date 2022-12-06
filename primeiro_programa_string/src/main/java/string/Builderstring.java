package string;

public class Builderstring {

    public static void main(String[] args){
         var nome = "Yan";

         final var builder = new StringBuilder(nome);
        System.out.println(builder.append("Baldissera"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(4, "#").insert(reverse.length(), "#");
        System.out.println(insert);
    }
}
