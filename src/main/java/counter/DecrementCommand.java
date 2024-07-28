package counter;

public class DecrementCommand implements Command{
    private Counter counter;

    public DecrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void excute() {
        counter.decrement();
    }

    @Override
    public void unExcute() {
        counter.increment();
    }
}
