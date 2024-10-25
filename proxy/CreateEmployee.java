package proxy;

public class CreateEmployee {
    public static void main(String[] args) {
        try {
            EmployeeDoaProxy proxy = new EmployeeDoaProxy(new EmployeeDoa());

            proxy.get("USER", new Employee());

            System.out.println("Succesfull!!!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
