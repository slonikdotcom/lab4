package systems;

import resources.LibraryResource;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<LibraryResource> resources = new ArrayList<>();

    public void addResource(LibraryResource resource) {
        resources.add(resource);
        System.out.println("Ресурс додано до каталогу: " + resource.getTitle());
    }

    public void displayResources() {
        System.out.println("Каталог:");
        for (LibraryResource resource : resources) {
            resource.displayInfo();
        }
    }
}
