package Strategy;

import java.util.ArrayList;

public class BubbleSort implements Strategy {

    @Override
    public void sort(int[] peppe) {
        int dim = peppe.length;
        int tmp;
        for(int i = 0; i < dim; ++i){
            for(int j = 0; j < dim - 1; ++j){
                if(peppe[j] > peppe[j + 1]){
                    tmp = peppe[j+1];
                    peppe[j+1] = peppe[j];
                    peppe[j] = tmp;
                }
            }
        }
    }
}
