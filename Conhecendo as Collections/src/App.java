import services.OrdenacaoPessoa;

public class App {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoas("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoas("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoas("Nome 3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoas("Nome 4", 17, 1.56);

        System.out.println("Ordenação por idade: ");
        System.out.println(ordenacaoPessoa.ordenarPessoaPorIdade());

        System.out.println("Ordenação por altura: ");
        System.out.println(ordenacaoPessoa.ordenarPessoaPorAltura());
    }
}
