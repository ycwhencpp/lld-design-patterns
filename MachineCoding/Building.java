package MachineCoding;

import java.util.*;

public class Building {
    private String buildingId;
    private Map<Integer, Floor> floors;

    public Building(String buildingId) {
        this.buildingId = buildingId;
        this.floors = new HashMap<>();
    }

    public void addFloor(int floorNumber) {
        floors.putIfAbsent(floorNumber, new Floor(floorNumber));
    }

    public Floor getFloor(int floorNumber) {
        return floors.get(floorNumber);
    }

    public String getBuildingId() {
        return buildingId;
    }

    public Collection<Floor> getAllFloors() {
        return floors.values();
    }
}