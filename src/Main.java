public class Main {
    public static void main(String[] args) {

        // Criação de uma instância da classe Perceptron
        Perceptron perceptron = new Perceptron();

        // Treinamento do Perceptron
        System.out.println("Iniciando treinamento...");
        perceptron.treinar();
        System.out.println("Treinamento concluído após " + perceptron.getCount() + " épocas.");

        // Testando o Perceptron com as combinações possíveis de entrada
        System.out.println("Resultados do Perceptron após o treinamento:");

        int[][] testes = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };

        for (int[] entrada : testes) {
            int resultado = perceptron.executar(entrada[0], entrada[1]);
            System.out.println("Entrada: (" + entrada[0] + ", " + entrada[1] + ") -> Saída: " + resultado);
        }
    }
}
