package compositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        FileSystem file = new File("movie.txt");

        Directory dir = new Directory("movies");
        Directory comedydir = new Directory("comedy");
        FileSystem lifefile = new File("life.txt");
        comedydir.add(lifefile);
        dir.add(file);
        dir.add(comedydir);
        dir.ls();
    }
}
