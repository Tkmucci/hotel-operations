package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchCard_should_add_hours_worked_on_current_shift_to_the_hours_worked_total() {

        //Arrange
        Employee employee = new Employee(1, "John", "Doe", "IT", 10.0, 10);

        //Act
        employee.punchTimeCard(9,17);

        //Assert
        assertEquals(18,employee.getHoursWorked());
    }

}