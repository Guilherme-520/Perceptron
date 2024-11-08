public class Main {
    public static void main(String[] args) {

        // Cria��o de uma inst�ncia da classe Perceptron
        Perceptron perceptron = new Perceptron();

        // Treinamento do Perceptron
        System.out.println("Iniciando treinamento...");
        perceptron.treinar();
        System.out.println("Treinamento conclu�do ap�s " + perceptron.getCount() + " �pocas.");

        // Testando o Perceptron com as combina��es poss�veis de entrada
        System.out.println("Resultados do Perceptron ap�s o treinamento:");

        int[][] testes = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };

        for (int[] entrada : testes) {
            int resultado = perceptron.executar(entrada[0], entrada[1]);
            System.out.println("Entrada: (" + entrada[0] + ", " + entrada[1] + ") -> Sa�da: " + resultado);
        }
    }
}
