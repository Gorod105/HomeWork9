package mystack;

public class StackVariable <A> {
    private A variable;

    public StackVariable(A variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return (String) variable;
    }
}
