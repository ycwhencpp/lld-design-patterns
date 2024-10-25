package proxy;

/**
 * EmployeeDoa
 */
public class EmployeeDoa implements EmployeeTable {

    @Override
    public void create(String Client, Employee employeeobj) throws Exception {
        System.out.println("Employee Created");
    }

    @Override
    public void delete(String Client, Employee employeeobj) throws Exception {
        System.out.println("Employee deleted");

    }

    @Override
    public void get(String Client, Employee employeeobj) throws Exception {
        System.out.println("Employee Fetched");

    }

}