package myarraylist;

public class  Variable <A>{
    private A variable;

    public Variable(A variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return (String) variable;
    }
}
