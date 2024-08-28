import java.util.Scanner;

public class PessoaEmpregadoMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeEmpregado = entrada.nextLine();
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Digite a porcentagem de imposto: ");
        double imposto = entrada.nextDouble();
        Empregado empregado = new Empregado(nomeEmpregado, salario, imposto);

        System.out.printf("%s, seu salário base é %.2f e seu salário líquido é %.2f", empregado.getNome(),
                empregado.getSalarioBase(), empregado.calcularSalario());
    }
}
