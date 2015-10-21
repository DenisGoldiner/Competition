package com.denis.competition;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Created by Denis on 19.10.2015.
 */
public class Book {

    private String name;
    private String authorName;
    private MyDate publishDate;

    public Book(String name, String authorName, MyDate publishDate) {
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public MyDate getPublichDate() {
        return publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (authorName != null ? !authorName.equals(book.authorName) : book.authorName != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (publishDate != null ? !publishDate.equals(book.publishDate) : book.publishDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", authorName = '" + authorName + '\'' +
                ", publishDate = " + publishDate +
                '}';
    }
}
