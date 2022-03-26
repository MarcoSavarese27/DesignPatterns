package Strategy;

public class Context {

    int[] v;
    Strategy sortStrategy;

    public Context(int[] v){
        this.v = v;
    }

    public void setSortStrategy(Strategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void Sort(){
        this.sortStrategy.sort(this.v);
    }
}
