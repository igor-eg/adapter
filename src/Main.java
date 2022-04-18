public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.printf("сложение: %s + %s = %s", 2, 2, intsCalc.sum(2, 2));
        System.out.println();
        System.out.printf("сложение: %s + %s = %s", 10, 22, intsCalc.sum(10, 22));
        System.out.println();
        System.out.printf("вычитание: %s - %s = %s", 28, 23, intsCalc.sub(28, 23));
        System.out.println();
        System.out.printf("умножение: %s * %s = %s", 11, 33, intsCalc.mult(11, 33));
        System.out.println();
        System.out.printf("деление: %s - %s = %s", 44, 4, intsCalc.div(44, 4));
        System.out.println();
        System.out.printf("возведение в степень: %s ст. %s = %s", 2, 10, intsCalc.pow(2, 10));
        System.out.println();

    }
}

