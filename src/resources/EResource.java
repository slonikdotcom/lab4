package resources;

public class EResource extends LibraryResource {
    public EResource(String title) {
        super(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Електронний ресурс: " + getTitle());
    }
}
