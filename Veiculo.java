import java.util.Scanner;

/** Classe que representa um Veículo */
class Veiculo {
    private String marca;
    private String modelo;
    private String numeroChassi;
    private String placa;
    private String cor;

    /** Construtor da classe Veiculo */
    public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.cor = cor;
    }

    // Métodos de acesso (getters e setters) para as propriedades privadas
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

/** Classe responsável por cadastrar e exibir veículos */
class Cadastro {
    private Veiculo[] veiculos;
    private int quantidadeVeiculos;

    /** Construtor da classe Cadastro */
    public Cadastro(int tamanho) {
        veiculos = new Veiculo[tamanho];
        quantidadeVeiculos = 0;
    }

    /**
     * Método para cadastrar um veículo no vetor de cadastro.
     * @param veiculo O veículo a ser cadastrado.
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        if (quantidadeVeiculos < veiculos.length) {
            veiculos[quantidadeVeiculos] = veiculo;
            quantidadeVeiculos++;
        } else {
            System.out.println("Cadastro de veículos está cheio!");
        }
    }

    /** Método para imprimir o vetor de cadastro de veículos */
    public void imprimirCadastro() {
        System.out.println("Veículos cadastrados:");
        for (int i = 0; i < quantidadeVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Chassi: " + veiculo.getNumeroChassi());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("-----------------------");
        }
    }
}

/** Classe principal que contém o método main para execução do programa */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto de Cadastro com espaço para 5 veículos
        Cadastro cadastro = new Cadastro(5);

        // Cadastrar veículos
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro do veículo " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.next();
            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.print("Chassi: ");
            String chassi = scanner.next();
            System.out.print("Placa: ");
            String placa = scanner.next();
            System.out.print("Cor: ");
            String cor = scanner.next();

            // Criar um objeto Veiculo e cadastrá-lo
            Veiculo veiculo = new Veiculo(marca, modelo, chassi, placa, cor);
            cadastro.cadastrarVeiculo(veiculo);
        }

        // Imprimir o cadastro de veículos
        cadastro.imprimirCadastro();

        // Fechar o scanner
        scanner.close();
    }
}
