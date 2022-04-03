package mz.payroll.exceptions;

public class OrderNotFoundException extends RuntimeException{

    public OrderNotFoundException(Long id) {
        super("Was not able to find that employee with " + id);
    }
}
