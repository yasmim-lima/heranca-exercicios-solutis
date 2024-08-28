import java.util.Scanner;

public class PessoaFornecedorMain {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o telefone da pessoa: ");
        String telefone = entrada.nextLine();
        Pessoa p = new Pessoa(nome, telefone);
        System.out.println("Digite o crédito da pessoa: ");
        double credito = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite o valor da dívida da pessoa: ");
        double divida = Double.parseDouble(entrada.nextLine());
        Fornecedor f = new Fornecedor(nome, telefone, credito, divida);

        System.out.println("Nome: " + f.getNome() + "\nTelefone: " + f.getTelefone() + "\nSaldo: " + f.obterSaldo());

        entrada.close();
    }
}