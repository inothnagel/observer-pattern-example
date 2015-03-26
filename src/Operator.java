import java.util.ArrayList;

public class Operator implements Observer {
    protected Operand a = null;
    protected Operand b = null;

    public void setValues(Operand a, Operand b) {
        this.a = a; registerWithObservable(a);
        this.b = b; registerWithObservable(b);
    }

    @Override
    public void update() {
        System.out.println("Observer: I have been notified of a change to one of my values. My new result is " + result() + ".");
    }
    
    public int result() {
        return 0;
    }

    public Operand[] getOperands() {
        Operand[] operands = {a, b};
        return operands;
    }

    private void registerWithObservable(Observable o) {
        System.out.println("Observer: I am registering myself as an observer.");
        o.addObserver(this);
    }
}