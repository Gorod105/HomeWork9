package myqueue;

public class QueueVariable<A>{
    private A variable;

    public QueueVariable(A variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return (String) variable;
    }
}
