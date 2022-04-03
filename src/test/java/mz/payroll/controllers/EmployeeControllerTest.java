package mz.payroll.controllers;

import mz.payroll.entities.Employee;
import mz.payroll.reposotories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@DataJpaTest
public class EmployeeControllerTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private EmployeeController controller;

    @DisplayName("Test Mock helloService + employeeRepository")
    @Test
    void getTest() {
        List<Employee> emps = new ArrayList<>();
        assertEquals(emps, employeeRepository.findAll());
    }

    @Test
    public void  createEmployeeTest () {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setRole("Thief");
        employee.setName("Bilbo Beggins");
        employee.setFirstName("Bilbo");
        employee.setLastName("Beggins");
        when(employeeRepository.save(employee)).thenReturn(employee);
        assertNotNull(employee);
    }

}
