import java.util.Scanner;
import classes.ListaDeProdutos;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        ListaDeProdutos lista = new ListaDeProdutos();

        lista.adicionarProduto(001, 35.00, "Cropped preto");
        lista.adicionarProduto(002, 65.00, "Short jeans");
        lista.adicionarProduto(003, 85.00, "Vestido florido");
        
        System.out.println(lista.listarProdutos());
    }
}
