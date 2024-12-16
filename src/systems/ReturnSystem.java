package systems;

import resources.LibraryResource;

public class ReturnSystem {
    public void returnResource(LibraryResource resource) {
        System.out.println("Ресурс повернено: " + resource.getTitle());
    }
}
