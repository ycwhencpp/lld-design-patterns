package compositeDesignPattern;

public class File implements FileSystem {

    public String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("filename:" + fileName);
    }
}
