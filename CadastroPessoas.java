import java.util.Scanner;

/** Classe que representa uma pessoa */
class Pessoa {
    private String nome;

    /** Construtor da classe Pessoa */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o nome da pessoa.
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da pessoa.
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}

/** Classe que representa uma pessoa física */
class PessoaFisica extends Pessoa {
    private String cpf;

    /** Construtor da classe PessoaFisica */
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    /**
     * Método para obter o CPF da pessoa física.
     * @return O CPF da pessoa física.
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Método para definir o CPF da pessoa física.
     * @param cpf O CPF da pessoa física.
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}

/** Classe que representa uma pessoa jurídica */
class PessoaJuridica extends Pessoa {
    private String cnpj;

    /** Construtor da classe PessoaJuridica */
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    /**
     * Método para obter o CNPJ da pessoa jurídica.
     * @return O CNPJ da pessoa jurídica.
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Método para definir o CNPJ da pessoa jurídica.
     * @param cnpj O CNPJ da pessoa jurídica.
     */
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
}

/** Classe responsável por cadastrar e exibir pessoas */
class Cadastro {
    private Pessoa[] pessoas;
    private int quantidadePessoas;

    /** Construtor da classe Cadastro */
    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        quantidadePessoas = 0;
    }

    /**
     * Método para cadastrar uma pessoa no vetor de cadastro.
     * @param pessoa A pessoa a ser cadastrada.
     */
    public void cadastrarPessoa(Pessoa pessoa) {
        if (quantidadePessoas < pessoas.length) {
            pessoas[quantidadePessoas] = pessoa;
            quantidadePessoas++;
        } else {
            System.out.println("Cadastro de pessoas está cheio!");
        }
    }

    /** Método para imprimir o vetor de cadastro de pessoas */
    public void imprimirCadastro() {
        System.out.println("Pessoas cadastradas:");
        for (int i = 0; i < quantidadePessoas; i++) {
            Pessoa pessoa = pessoas[i];
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                System.out.println("CPF: " + pessoaFisica.getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                System.out.println("CNPJ: " + pessoaJuridica.getCNPJ());
            }
            System.out.println("-----------------------");
        }
    }
}

/** Classe principal que contém o método main para execução do programa */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto de Cadastro com espaço para 3 pessoas
        Cadastro cadastro = new Cadastro(3);

        // Cadastrar pessoas
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("1 para Pessoa Física, 2 para Pessoa Jurídica: ");
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                System.out.print("CPF: ");
                String cpf = scanner.next();
                PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf
