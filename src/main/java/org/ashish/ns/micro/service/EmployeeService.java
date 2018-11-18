package org.ashish.ns.micro.service;

import org.ashish.ns.micro.service.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Employee.
 */
public interface EmployeeService {

    /**
     * Save a employee.
     *
     * @param employeeDTO the entity to save
     * @return the persisted entity
     */
    EmployeeDTO save(EmployeeDTO employeeDTO);

    /**
     * Get all the employees.
     *
     * @return the list of entities
     */
    List<EmployeeDTO> findAll();


    /**
     * Get the "id" employee.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<EmployeeDTO> findOne(Long id);

    /**
     * Delete the "id" employee.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
