package proxy;

interface EmployeeTable {
    public void get(String Client, Employee employeeobj) throws Exception;

    public void delete(String Client, Employee employeeobj) throws Exception;

    public void create(String Client, Employee employeeobj) throws Exception;

}
