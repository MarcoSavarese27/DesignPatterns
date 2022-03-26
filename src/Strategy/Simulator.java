package Strategy;

import java.util.Arrays;

public class Simulator {
    public static void main(String[] args) {
        int[] v = {3,8,7,6,4,2};
        Context context = new Context(v);
        BubbleSort bb = new BubbleSort();
        context.setSortStrategy(bb);
        context.Sort();
        System.out.println(Arrays.toString(v));
    }

}
