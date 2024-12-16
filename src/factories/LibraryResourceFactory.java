package factories;

import resources.LibraryResource;

public abstract class LibraryResourceFactory {
    public abstract LibraryResource createResource(String title);
}
