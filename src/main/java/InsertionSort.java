public class InsertionSort implements SortingStrategy {

    /**
    * O array  está ordenado exceto pelo último elemento. Esse método
    * deve colocar o último elemento em sua posição.
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
        // TODO: implementar
        int idx = v.length - 1;
        while (idx > 0 && v[idx] < v[idx - 1]) {
            int auxiliar = v[idx - 1];
            v[idx - 1] = v[idx];
            v[idx] = auxiliar;
            idx -= 1;
        }
    }
   
    /**
    * O array  está ordenado exceto pelo primeiro elemento. Esse método
    * deve colocar o primeiro elemento em sua posição. Ao final da execução,
    * v deve estar ordenado.
    * Importante: seu algoritmo deve ser O(n);
    */
    public void inserePrimeiroOrdenado(int[] v) {
        int idx = 0;
        while (idx < v.length - 1 && v[idx] > v[idx+1]) {
            int auxiliar = v[idx + 1];
            v[idx + 1] = v[idx];
            v[idx] = auxiliar;
            idx += 1;
        }
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort.
    */
    public void sort(int[] v) {
        for(int i = 1; i < v.length; i++){
            int j  =  i;
            while (j > 0 && v[j] < v[j - 1]) {
                int auxiliar = v[j - 1];
                v[j - 1] = v[j];
                v[j] = auxiliar;
                j -= 1;
            }
        }
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort de maneira recursiva.
    * Pense que insertion sort são várias execuções da inserção ordenada e use
    * essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
    } 
    
}
