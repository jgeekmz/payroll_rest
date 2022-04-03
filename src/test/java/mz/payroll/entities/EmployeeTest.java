package mz.payroll.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @DisplayName("Test Object Constructor Creation")
    @Test
    public void createEmployeeObjectTest() {
        Employee employee = new Employee();
        assertEquals(employee, new Employee());
    }

    @DisplayName("Test setName/getName Method")
    @Test
    public void setEmployeeNameTest() {
        Employee emp1 = new Employee();
        emp1.setName("Bilbo Beggins");
        assertEquals("Bilbo Beggins", emp1.getName());
        assertNotEquals("Sam The Thief", emp1.getName());
    }

    @DisplayName("Employee Methods Test")
    @Test
    public void testEmployeeCreationTest() {
        Employee employee = new Employee("Martin", "Zlatkov", "Major");
        assertFalse(employee.equals(null));
        assertNull(employee.getId());

        employee.setId(1L);
        assertNotNull(employee.getId());

        assertEquals("Major", employee.getRole());
    }

}
