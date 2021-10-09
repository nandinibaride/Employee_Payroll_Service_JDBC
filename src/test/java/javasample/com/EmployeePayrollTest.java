package javasample.com;

import java.awt.List;

import org.junit.Test;

import javasample.com.EmployeePayrollService.IOService;
import static com.bridgelabz.EmployeePayrollService.IOService.DB_IO;

public class EmployeePayrollTest 
{
	@Test
    void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
        Assertions.assertEquals(4, employeePayrollData.size());
    }
	

}
