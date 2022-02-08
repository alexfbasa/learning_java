package streams;


import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utils {
    final static public Consumer<String> print = System.out::println;
    final static public UnaryOperator<String> minuscula = n -> n.toLowerCase();
    final static public UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    final static public UnaryOperator<String> espaco = n -> n + " ";
    final static public UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";


}