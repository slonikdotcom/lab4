package resources;

public class Journal extends LibraryResource {
    public Journal(String title) {
        super(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Журнал: " + getTitle());
    }
}
