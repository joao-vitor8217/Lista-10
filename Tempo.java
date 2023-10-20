/** Classe que representa o tempo (hora, minuto e segundo) */
class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    /** Construtor sem parâmetros (tempo padrão 0:0:0) */
    public Tempo() {
        this(0, 0, 0);
    }

    /** Construtor com o parâmetro hora (tempo padrão hora:0:0) */
    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    /** Construtor com os parâmetros hora e minuto (tempo padrão hora:minuto:0) */
    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    /** Construtor com os parâmetros hora, minuto e segundo */
    public Tempo(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    /**
     * Método para definir o tempo (hora, minuto e segundo) de uma só vez.
     * @param hora A hora (0-23).
     * @param minuto O minuto (0-59).
     * @param segundo O segundo (0-59).
     */
    public void setTime(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Valores de tempo inválidos.");
        }
    }

    /** Método para obter a hora */
    public int getHora() {
        return hora;
    }

    /** Método para obter o minuto */
    public int getMinuto() {
        return minuto;
    }

    /** Método para obter o segundo */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Método para retornar uma string contendo o tempo no formato h:m:s.
     * @return O tempo no formato h:m:s.
     */
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

/** Classe principal que contém o método main para execução do programa */
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe Tempo
        Tempo tempo1 = new Tempo(); // Tempo padrão 0:0:0
        System.out.println("Tempo 1: " + tempo1);

        Tempo tempo2 = new Tempo(10); // Tempo padrão 10:0:0
        System.out.println("Tempo 2: " + tempo2);

        Tempo tempo3 = new Tempo(8, 30); // Tempo padrão 8:30:0
        System.out.println("Tempo 3: " + tempo3);

        Tempo tempo4 = new Tempo(15, 45, 30); // Tempo 15:45:30
        System.out.println("Tempo 4: " + tempo4);

        // Tentativa de atribuição de valores inválidos
        Tempo tempoInvalido = new Tempo(25, 70, 80); // Saída: Valores de tempo inválidos.
    }
}