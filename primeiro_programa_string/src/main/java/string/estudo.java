package string;

public class estudo {

    public static void main(String[] args){

        var s = "A B C D E F G";
        char[] Imp = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            System.out.println(Imp[i]);
        }

        String aula = "Aula de Java";
        String[] novaAula = aula.split(" ");
        System.out.println(novaAula[0]);
        System.out.println(novaAula[1]);
        System.out.println(novaAula[2]);

        System.out.println("Aula" .concat(" de Java"));


        System.out.println("1h34 asda qw" .replaceAll("[0-9]", "#"));

    }
}
