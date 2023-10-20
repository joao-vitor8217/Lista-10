import java.util.Scanner;

/** Classe que representa um círculo */
class Circulo {
    private int x;
    private int y;
    private double raio;

    /** Construtor que recebe as coordenadas e o raio do círculo */
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /** Construtor vazio que inicia as coordenadas e o raio com 0 */
    public Circulo() {
        this(0, 0, 0);
    }

    /** Método para calcular a área do círculo */
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    /** Método para calcular o perímetro do círculo */
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    /** Método para mover o círculo horizontalmente */
    public void moveX(int x1) {
        x += x1;
    }

    /** Método para mover o círculo verticalmente */
    public void moveY(int y1) {
        y += y1;
    }

    /** Método para aumentar o raio do círculo */
    public void aumenta(double n) {
        raio *= n;
    }

    /** Método para exibir as informações do círculo */
    public String exibe() {
        return "Centro: (" + x + ", " + y + ")\nRaio: " + raio + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }
}

/** Classe principal que contém o método main para execução do programa */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário as coordenadas e o raio do círculo
        System.out.print("Digite a coordenada x do círculo: ");
        int x = scanner.nextInt();
        System.out.print("Digite a coordenada y do círculo: ");
        int y = scanner.nextInt();
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Criar o objeto Circulo
        Circulo circulo = new Circulo(x, y, raio);

        // Menu de opções
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar raio");
            System.out.println("3 - Imprimir informações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade para mover horizontalmente: ");
                    int deltaX = scanner.nextInt();
                    System.out.print("Digite a quantidade para mover verticalmente: ");
                    int deltaY = scanner.nextInt();
                    circulo.moveX(deltaX);
                    circulo.moveY(deltaY);
                    break;
                case 2:
                    System.out.print("Digite o fator de aumento do raio: ");
                    double fator = scanner.nextDouble();
                    circulo.aumenta(fator);
                    break;
                case 3:
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        // Fechar o scanner
        scanner.close();
    }
}
