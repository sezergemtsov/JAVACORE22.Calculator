public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // При делении на 0 выдаст ошибку, можно добавить проверку или перевести операцию деления в double
        double c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
