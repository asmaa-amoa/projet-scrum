public class Main {
    // Fonction qui calcule le factoriel d'un entier n
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n doit être >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int nombre = 5;
        System.out.println("Factoriel de " + nombre + " = " + factorial(nombre));
    }
}
