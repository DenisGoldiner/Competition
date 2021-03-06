package com.denis.competition.algoritm;

import com.denis.competition.Book;

import java.util.ArrayList;

/**
 *
 * Created by Denis on 20.10.2015.
 */
public class PrioritySortByName implements Sort{

    @Override
    public void sort(ArrayList<Book> list) {

        Book helpingBook;

        for (int i = 0; i < list.size(); ++i){
            for (int j = i; j < list.size(); ++j){

                char[] buffer_1 = new char[list.get(i).getName().length()];
                char[] buffer_2 = new char[list.get(j).getName().length()];
                list.get(i).getName().getChars(0, buffer_1.length, buffer_1, 0);
                list.get(j).getName().getChars(0, buffer_2.length, buffer_2, 0);

                for(int z = 0; (z < buffer_1.length) && (z < buffer_2.length); ++z){
                    if (buffer_2[z] < buffer_1[z]){
                        helpingBook = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, helpingBook);
                        break;
                    } else if (buffer_2[z] > buffer_1[z]){
                        break;
                    } else if ( ( (z == buffer_1.length - 1) || (z == buffer_2.length - 1) ) && buffer_2[z] == buffer_1[z]){
                        if (buffer_2.length < buffer_1.length){
                            helpingBook = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, helpingBook);
                        } else if (buffer_2.length == buffer_1.length){
                            if (authorPriority(list.get(i), list.get(j))){
                                helpingBook = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, helpingBook);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean authorPriority (Book book_1, Book book_2){
        boolean result = false;
        char[] buffer_1 = new char[book_1.getAuthorName().length()];
        char[] buffer_2 = new char[book_2.getAuthorName().length()];
        book_1.getAuthorName().getChars(0, buffer_1.length, buffer_1, 0);
        book_2.getAuthorName().getChars(0, buffer_2.length, buffer_2, 0);

        for(int z = 0; (z < buffer_1.length) && (z < buffer_2.length); ++z){
            if (buffer_2[z] < buffer_1[z]){
                result = true;
                break;
            } else if (buffer_2[z] > buffer_1[z]){
                break;
            } else if ( ( (z == buffer_1.length - 1) || (z == buffer_2.length - 1) ) && buffer_2[z] == buffer_1[z]){
                if (buffer_2.length < buffer_1.length){
                    result = true;
                }
            }
        }
        return result;
    }

}
