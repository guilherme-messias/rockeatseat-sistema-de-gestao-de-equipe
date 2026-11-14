package exception;

public class NegativeSalaryValue extends IllegalArgumentException {
    public NegativeSalaryValue(String message) {
        super(message);
    }
}
