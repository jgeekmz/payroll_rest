package mz.payroll.assemblers;

import mz.payroll.controllers.EmployeeController;
import mz.payroll.entities.Employee;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return EntityModel.of(employee,
                linkTo(methodOn(EmployeeController.class).getEmployeeViaId(employee.getId())).withSelfRel().withSelfRel(),
                linkTo(methodOn(EmployeeController.class).showAllEmployeesFromDB()).withRel("employees"));
    }
}
