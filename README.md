A classe Perceptron implementa o modelo de perceptron, que é um tipo simples de rede neural usada principalmente para resolver problemas de classificação linear, como funções lógicas. Ela funciona ajustando pesos sinápticos através de um processo de treinamento para que as saídas estejam o mais próximo possível dos valores esperados.

Vamos analisar o comportamento e os métodos principais dessa classe.

1. Atributos
w: Vetor de pesos sinápticos, onde w[0] e w[1] representam os pesos para as duas entradas, e w[2] é o peso do bias (termo de ajuste).
NET: Variável que armazena o valor do somatório ponderado das entradas. Esse valor é calculado a cada vez que uma entrada é passada para o perceptron.
epocasMax: Número máximo de épocas, limitando o número de vezes que o perceptron tentará ajustar os pesos.
count: Contador de épocas durante o treinamento, para rastrear quantas vezes os pesos foram ajustados.
matrizAprendizado: Matriz de exemplos usados para o aprendizado, onde cada linha contém duas entradas e o valor esperado. Neste caso, representa uma função lógica AND.
2. Construtor
Inicializa a matrizAprendizado com exemplos da função lógica AND:
(0, 0) -> 0
(0, 1) -> 0
(1, 0) -> 0
(1, 1) -> 1
Inicializa os pesos w como zero, representando um estado neutro antes do treinamento.
3. Método executar
Esse método simula o funcionamento do perceptron, calculando o somatório ponderado (NET) com as entradas fornecidas (x1 e x2) e os pesos.
Se o valor de NET é maior ou igual a 0, a função de ativação retorna 1 (saída positiva), caso contrário, retorna 0 (saída negativa).
Esse método é usado tanto durante o treinamento quanto na fase de teste, onde o perceptron tenta classificar novas entradas.
4. Método treinar
Esse é o método principal para o treinamento do perceptron.
Ele itera sobre a matrizAprendizado e calcula a saída para cada par de entradas usando o método executar.
Se a saída não corresponder ao valor esperado, chama o método corrigirPeso para ajustar os pesos sinápticos. Isso é feito com base na diferença entre a saída e o valor esperado (usando a regra de aprendizagem do perceptron).
O processo de treinamento continua até que todas as saídas estejam corretas ou até que o número máximo de épocas (epocasMax) seja alcançado.
5. Método corrigirPeso
Esse método ajusta os pesos sinápticos quando a saída do perceptron não corresponde ao valor esperado.
Utiliza a fórmula:
w[i] = w[i] + (taxa_aprendizagem * erro * entrada)
Neste caso, a taxa de aprendizado é 1, e o erro é a diferença entre o valor esperado e a saída atual.
Os pesos para cada entrada (w[0] e w[1]) são ajustados em relação às entradas, enquanto o peso do bias (w[2]) é ajustado em relação a -1 (para representar o bias negativo).
6. Resumo do Funcionamento
Inicialização: Começa com pesos neutros e define o conjunto de treinamento para uma função lógica AND.
Treinamento: Realiza ajustes nos pesos até que o perceptron aprenda a classificar corretamente os exemplos.
Classificação: Após o treinamento, o perceptron pode ser usado para classificar novas entradas, aplicando a função de ativação.
A classe, em essência, simula um neurônio simples e é eficaz para classificar problemas linearmente separáveis, como a função AND. Esse tipo de rede não é capaz de resolver problemas não-linearmente separáveis, como a função XOR, pois não possui camadas ocultas.
