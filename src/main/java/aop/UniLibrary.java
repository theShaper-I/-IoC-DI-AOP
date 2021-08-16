package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Took book from UniLibrary");
        System.out.println("--------------------------------");
    }

    public String returnBook() {
        System.out.println("Return book in UniLibrary");
        return "War and Peace";
    }

    public void getMagazine() {
        System.out.println("Took magazine from UniLibrary");
        System.out.println("--------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return magazine in UniLibrary");
        System.out.println("--------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Adding book in UniLibrary");
        System.out.println("--------------------------------");
    }

    public void addMagazine() {
        System.out.println("Adding magazine in UniLibrary");
        System.out.println("--------------------------------");
    }
}
