public class Main {

    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    }
