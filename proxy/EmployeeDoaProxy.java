package proxy;

public class EmployeeDoaProxy implements EmployeeTable {
    EmployeeDoa employeedoa;

    public EmployeeDoaProxy(EmployeeDoa employeeDoa) {
        this.employeedoa = employeeDoa;
    }

    @Override
    public void create(String Client, Employee employeeobj) throws Exception {
        if (Client.equals("ADMIN")) {
            employeedoa.create(Client, employeeobj);
            return;
        }
        throw new Exception("Access Denied");

    }

    @Override
    public void delete(String Client, Employee employeeobj) throws Exception {
        if (Client.equals("ADMIN")) {
            employeedoa.delete(Client, employeeobj);
            return;
        }
        throw new Exception("Access Denied");

    }

    @Override
    public void get(String Client, Employee employeeobj) throws Exception {
        if (Client.equals("ADMIN") || Client.equals("USER")) {
            employeedoa.get(Client, employeeobj);
            return;
        }
        throw new Exception("Access Denied");

    }

}
