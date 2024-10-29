package resturantManagement;

public class User {
    private int id;
    private String name;
    private String info;

    public User(int id, String n, String info) {
        this.id = id;
        this.name = n;
        this.info = info;
    }

    public String getDetails() {
        return "User: " + name + ", Contact: " + info;
    }

}
