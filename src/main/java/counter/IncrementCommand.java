package counter;

public class IncrementCommand implements Command{
    private Counter counter;

    public IncrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void excute() {
        counter.increment();
    }

    @Override
    public void unExcute() {
        counter.decrement();
    }
}
