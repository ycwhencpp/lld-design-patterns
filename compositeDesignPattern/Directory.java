package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    List<FileSystem> objList;
    String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.objList = new ArrayList<>();
    }

    public void add(FileSystem obj) {
        this.objList.add(obj);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystem fileObj : objList) {
            fileObj.ls();
        }
    }

}
