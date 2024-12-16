import factories.*;
import resources.LibraryResource;
import systems.Catalog;
import systems.IssueSystem;
import systems.ReturnSystem;

public class Main {
    public static void main(String[] args) {
        // Фабрики
        LibraryResourceFactory bookFactory = new BookFactory();
        LibraryResourceFactory journalFactory = new JournalFactory();
        LibraryResourceFactory eResourceFactory = new EResourceFactory();

        // Каталог
        Catalog catalog = new Catalog();

        // Створення та додавання ресурсів
        LibraryResource book = bookFactory.createResource("Java Programming");
        LibraryResource journal = journalFactory.createResource("Science Today");
        LibraryResource eResource = eResourceFactory.createResource("Online Course: Data Structures");

        catalog.addResource(book);
        catalog.addResource(journal);
        catalog.addResource(eResource);

        // Відображення каталогу
        catalog.displayResources();

        // Система видачі та повернення
        IssueSystem issueSystem = new IssueSystem();
        ReturnSystem returnSystem = new ReturnSystem();

        issueSystem.issueResource(book);
        returnSystem.returnResource(book);
    }
}
