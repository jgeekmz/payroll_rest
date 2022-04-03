package mz.payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Was not able to find that employee with " + id);
    }
}
