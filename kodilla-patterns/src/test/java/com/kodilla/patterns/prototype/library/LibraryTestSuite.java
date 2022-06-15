package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Biblioteka");
        Book book1 = new Book("Potop", "Sienkiewicz",LocalDate.of(2000,10,10));
        Book book2 = new Book("Zbrodnia i Kara", "Dostojewski", LocalDate.of(1800,10,10));
        Book book3 = new Book("Zemsta", "Fredro", LocalDate.of(1900,10,10));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        System.out.println(library);

        //making a shallow copy of object board
        Library clonedBoard = null;
        try {
            clonedBoard = library.shallowCopy();
            clonedBoard.setName("Biblioteka Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedBoard = null;
        try {
            deepClonedBoard = library.deepCopy();
            deepClonedBoard.setName("Biblioteka Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedBoard.getBooks().size());
     //   assertEquals(3, deepClonedBoard.getBooks().size());
        assertEquals(clonedBoard.getBooks(), library.getBooks());
        assertNotEquals(deepClonedBoard.getBooks(), library.getBooks());
    }
}
