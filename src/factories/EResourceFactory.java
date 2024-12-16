package factories;

import resources.EResource;
import resources.LibraryResource;

public class EResourceFactory extends LibraryResourceFactory {
    @Override
    public LibraryResource createResource(String title) {
        return new EResource(title);
    }
}
