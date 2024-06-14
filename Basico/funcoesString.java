package javaudemy.Basico;

public class funcoesString {
    public static void main(String[] args) {
        String original = "abcd FGHIJ ABC abc DEFG  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); // Tirar os espaões
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        int i = original.indexOf("bc");

        System.out.println("Original: - " + original + "-");
        System.out.println("toLowerCasse: - " + s01 + "-");
        System.out.println("toUpperCasse: - " + s02 + "-");
        System.out.println("trim: - " + s03 + "-");
        System.out.println("substring: - " + s04 + "-");
        System.out.println("substring: - " + s05 + "-");
        System.out.println("replace: - " + s06 + "-");

        // split - vetor recordado por separador informado

        String s = "potato apple lemon";

        String[] vect = s.split(" "); // O espaço é o separador nesse caso e armazena no vetor
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
    }
}
