public class Counter {

    private int memory;

    public Counter() {
        this.memory = 0;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void add() {
        add(1);
    }
    public void add(int amount) {
        memory += amount;
    }

    public void reset() {
        memory = 0;
    }

    public void subtract(int amount) {
        memory -= amount;
    }
}
