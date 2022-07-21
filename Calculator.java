public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer, Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer, Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer, Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Double, Integer> divide = (x, y) -> x.doubleValue() / y.doubleValue();
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Double> println = System.out::println;
}
