package com.example.tcu.checkinpro.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {
    private final employeeRepository employeeRepository;
    @Autowired
    public employeeService(employeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


public String addEmployee(employeeDTO employeeDTO) {
    Optional<employeeEntity> checkEmployee = employeeRepository.findByEmail(employeeDTO.getEmail());
    if (checkEmployee.isPresent()) {
        return "Employee with this email already exists";
    } else {
       employeeEntity employeeEntity = new employeeEntity(
                employeeDTO.getName(),
                employeeDTO.getEmail(),
                employeeDTO.getPassword(),
                employeeDTO.getPhone(),
                employeeDTO.getDepartment(),
                employeeDTO.getStatus()
        );
        employeeRepository.save(employeeEntity
       );
        return "Employee added";
    }
}

    public List<employeeEntity> getAllEmployees() {
        return employeeRepository.findAll();

    }

    public String updateEmployee(Integer employeeId, employeeDTO employeeDTO) {
        Optional <employeeEntity> employeeEntity = employeeRepository.findById(employeeId);

        if (employeeEntity.isPresent()) {
            employeeEntity oldEmployee = employeeEntity.get();
            oldEmployee.setName(employeeDTO.name);
            oldEmployee.setEmail(employeeDTO.email);
            oldEmployee.setPhone(employeeDTO.phone);
            oldEmployee.setDepartment(employeeDTO.password);
            oldEmployee.setStatus(employeeDTO.status);
            employeeRepository.save(oldEmployee);
            return "Employee updated";
        }
        else {
            return "Employee not found";
        }
    }

    public String deleteEmployee(Integer employee_id) {
        Optional<employeeEntity> employeeEntity = employeeRepository.findById(employee_id);
        if (employeeEntity.isEmpty()) {
            return "Employee not found";
        }else {
            employeeRepository.deleteById(employee_id);
            return "Employee deleted";
        }

    }

}


