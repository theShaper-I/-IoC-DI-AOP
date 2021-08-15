package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Took book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("Return book in UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Took magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Return magazine in UniLibrary");
    }

    public void addBook() {
        System.out.println("Adding book in UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Adding magazine in UniLibrary");
    }
}
