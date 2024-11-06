package junit.test.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeSalaryManagerTest {

    @Test
    public void testCalculateBonus_Employee1001() {
        EmployeeSalaryManager manager = new EmployeeSalaryManager();
        assertEquals(5000, manager.calculateBonus(1001, 50000), 0.01);
    }

    @Test
    public void testCalculateBonus_Employee1002() {
        EmployeeSalaryManager manager = new EmployeeSalaryManager();
        assertEquals(6000, manager.calculateBonus(1002, 60000), 0.01);
    }

    // Additional test cases can be added here for different inputs
}
