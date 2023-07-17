import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        String frase;

        ler.nextLine();
        for (int i = 0; i < n; i++) {
            frase = ler.nextLine();
            int tamanha = frase.length();
            String dividirfim = frase.substring(tamanha / 2);
            String dividiriniciio = frase.substring(0, tamanha / 2);
            String aoReversInicio = "";
            String aoReversFim = "";
            for (int j = dividiriniciio.length() - 1; j >= 0; j--) {
                aoReversInicio += dividiriniciio.charAt(j);
            }
            for (int j = dividirfim.length() - 1; j >= 0; j--) {
                aoReversFim += dividirfim.charAt(j);
            }
            System.out.println(aoReversInicio+aoReversFim);

        }

        ler.close();
    }

}
