package com.denis.competition;

import com.denis.competition.algoritm.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Created by Denis on 19.10.2015.
 */
public class Main {

    public static void main(String[] args) {
        Sort sort;
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("Welcome to bookshelf");

        try{
            String arrayExit;
            while (true) {

                System.out.println("Enter name of book");
                String name = reader.next();
                System.out.println("Enter name of author");
                String authorName = reader.next();
                System.out.println("Enter publish year");
                int year = reader.nextInt();
                System.out.println("Enter publish month");
                int month = reader.nextInt();
                System.out.println("enter publish date");
                int day = reader.nextInt();


                books.add(new Book(name, authorName, new MyDate(year, month, day)));
                System.out.println("Is the any more books (yes / no) ?");
                arrayExit = reader.next();
                    if (arrayExit.equals("no")){
                        break;
                    }
                }
                String sortTypeExit = "yes";

                while(sortTypeExit.equals("yes")){
                    sortTypeExit = "no";

                    System.out.println( "Choose how to sort the list:   \n" +
                                        " - byName                      \n" +
                                        " - byAuthor                    \n" +
                                        " - byDate                      \n " +
                                        " - priorityName                    ");

                    String sortType = reader.next();

                    switch (sortType){

                        case "byName":
                            sort = new BubbleSortByName();
                            sort.sort(books);
                            for (Book book: books){
                                System.out.println(book);
                            }
                            break;

                        case "byAuthor":
                            sort = new BubbleSortByAuthorName();
                            sort.sort(books);
                            for (Book book: books){
                                System.out.println(book);
                            }
                            break;

                        case "byDate":
                            sort = new BubbleSortByDate();
                            sort.sort(books);
                            for (Book book: books){
                                System.out.println(book);
                            }
                            break;

                        case "priorityName":
                            sort = new PrioritySortByName();
                            sort.sort(books);
                            for (Book book: books){
                                System.out.println(book);
                            }
                            break;

                        default:
                            System.out.println("There is no such type, try again (yes / no) ?");
                            sortTypeExit = reader.next();
                    }
                }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }

}
