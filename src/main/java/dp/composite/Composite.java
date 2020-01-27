package dp.composite;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Composite {
    public static void main(String[] args) {
        Folder users = new Folder("users");
        Folder etc = new Folder("etc");
        Folder root = new Folder("root");
        root.addFolders(etc, users);

        Folder mike = new Folder("mike");
        Folder kobe = new Folder("kobe");
        Folder tom = new Folder("tom");
        users.addFolders(mike, kobe, tom);

        root.printFolders();
    }

    static class Folder {
        private String name;
        private List<Folder> folders = new ArrayList<>();

        public Folder(String name) {
            this.name = name;
        }

        public void addFolders(Folder... folders) {
            this.folders.addAll(asList(folders));
        }

        public void printFolders() {
            folders.forEach(f -> {
                System.out.println(f.name);
                f.printFolders();
            });
        }
    }
}
