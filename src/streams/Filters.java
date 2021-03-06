package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filters {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4899.89, 0.32, 0);
        Produto p2 = new Produto("lapis", 1.99, 0.35, 0);
        Produto p3 = new Produto("Caderno", 30, 0.45, 0);
        Produto p4 = new Produto("Impressora", 1200, 0.40, 0);
        Produto p5 = new Produto("Ipad", 3100, 0.29, 0);
        Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
        Produto p7 = new Produto("Monitor", 800, 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Consumer<String> print = System.out::println;

        Predicate<Produto> superPromocao = n -> n.desconto >= 0.3;
        Predicate<Produto> freteZero = n -> n.frete == 0;
        Predicate<Produto> prodRelevante = n -> n.preco >= 500;
        Predicate<Produto> custaMenosMil = n -> n.preco <= 1000;
        Function<Produto, String> getNome = n -> "O nome do produto eh " + n.nome;


        Function<Produto, String> chamadaPromocional = p -> "Aproveite " + p.nome + " por R$"+p.preco;

        System.out.println("Iniciando a BUILD");

        produtos.stream()
                .filter(superPromocao)
                .filter(freteZero)
                .filter(prodRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

        produtos.stream()
                .filter(custaMenosMil)
                .map(getNome)
                .map(l -> l.toUpperCase())
                .map(Utils.espaco)
                .forEach(System.out::print);



    }
}
