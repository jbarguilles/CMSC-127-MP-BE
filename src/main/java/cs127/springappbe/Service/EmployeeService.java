package cs127.springappbe.Service;

import cs127.springappbe.Entities.Employee;
import cs127.springappbe.Entities.Request.UpdateEmployeeSalaryRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    Optional<Employee> findByEmployeeID(long EmployeeID);

    Employee updateSalary(UpdateEmployeeSalaryRequest updateEmployeeSalaryRequest);

    List<Employee> findAllEmployees();
}
