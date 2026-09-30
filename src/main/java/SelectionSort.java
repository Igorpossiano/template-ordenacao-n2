public class SelectionSort implements SortingStrategy {

    /**
    * Ordena um array de inteiros utilizando o selection sort.
    */
    public void sort(int[] v) {
        for(int i = 0; i < v.length;i++){
            int menor = i;
            for(int j = 0;j < v.length;j++){
                if(v[menor] > v[j]){
                    menor = j;
                }
            }
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
    }

    /**
    * Ordena um array de inteiros utilizando o selection sort de maneira recursiva.
    * Pense que selection sort são várias execuções da atividade de procurar 
    * o menor e colocá-lo em seu lugar. Use essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
        // TODO: implementar
    }
    
}
