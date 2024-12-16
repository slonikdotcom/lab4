package systems;

import resources.LibraryResource;

public class IssueSystem {
    public void issueResource(LibraryResource resource) {
        System.out.println("Ресурс видано: " + resource.getTitle());
    }
}
