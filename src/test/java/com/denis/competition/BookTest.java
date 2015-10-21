package com.denis.competition;

import com.denis.competition.algoritm.PrioritySortByName;
import com.denis.competition.algoritm.Sort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class BookTest {

    @Test
    public void testInterface() throws Exception {
        Sort sort;
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Baad", "Bob", new MyDate( 2015 , 12, 12)));
        books.add(new Book("Daz", "Far", new MyDate( 1890 , 1, 4)));
        books.add(new Book("Ada", "Rob", new MyDate( 1972 , 1, 4)));
        books.add(new Book("Ad", "Rob", new MyDate( 1972, 1, 4)));
        books.add(new Book("Ada", "Add", new MyDate( 1972 , 1, 4)));
        books.add(new Book("Cta", "Rob", new MyDate( 1900, 1, 4)));
        books.add(new Book("Ada", "Yen", new MyDate( 1980, 1, 4)));
        books.add(new Book("Ctt", "Rob", new MyDate( 1980, 1, 4)));
        books.add(new Book("Car", "Rob", new MyDate( 190, 1, 4)));

        sort = new PrioritySortByName();
        sort.sort(books);

        for(Book book: books){
            System.out.println(book);
        }

    }
}