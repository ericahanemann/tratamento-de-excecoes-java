public class Throws {
    static void checkIdade(int idade) throws ArithmeticException {
        if (idade < 18) {
            throw new ArithmeticException("Acesso negado - você precisa ter no minimo 18 anos de idade!");
        }
        else {
            System.out.println("Acesso concedido - você tem idade o suficiente");
        }
    }

    public static void main(String[] args) {
        checkIdade(15); // Set age to 15 (which is below 18...)
    }
}
