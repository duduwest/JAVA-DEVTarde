package ArrayList;

public class ExemploArrayList {
    // Atributos
    int cont = 0;
    int v1[] = new int[cont];
    int v2[] = new int[cont = 1];

    // Métodos
    public void add(int add) { // toda vez que chamar o metodo add , vai criar um vetor com +1 posição e
        // o metdod add vai crar um vetor com tamanho cont+1
        // e necessito que lee copie o vetor 1 para o vetor 2
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];
        }

    }

}
