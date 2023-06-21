public class TryCatchFinally {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e) {
            System.out.println("\nA frase inicial é nula. Para solucionar o problema, " +
                    "atribuímos um valor default para a frase.");
            frase = "Frase vazia";
        }
        finally {
            novaFrase = frase.toUpperCase();
            System.out.println("Frase antiga: "+ frase);
            System.out.println("Frase nova: "+ novaFrase);
        }
    }
}
