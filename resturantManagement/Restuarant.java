package resturantManagement;

import java.util.ArrayList;
import java.util.List;

public class Restuarant {
    List<Table> tables;
    private int id;
    private String name;

    public Restuarant(int id, String name, List<Table> t) {
        this.id = id;
        this.name = name;
        this.tables = t;
    }

    public List<Table> getAvialiableTables() {
        List<Table> ls = new ArrayList<>();
        for (Table t : tables) {
            if (!t.isReserved()) {
                ls.add(t);
            }
        }
        return ls;
    }

    public String getInfo() {
        return "Name" + name + "id" + id;
    }
}
