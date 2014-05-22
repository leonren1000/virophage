package virophage.game;

public abstract class IntervalTimeable implements Timeable {

    private int interval;
    private int start;

    public IntervalTimeable(int interval, int start) {
        this.interval = interval;
        this.start = start;
    }

    @Override
    public abstract void act(int tick);

    @Override
    public boolean shouldAct(int tick) {
        return (tick - start) % interval == 0;
    }

}