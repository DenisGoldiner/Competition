package com.denis.competition.algoritm;

import com.denis.competition.Book;

import java.util.ArrayList;

/**
 *
 * Created by Denis on 20.10.2015.
 */
public class BubbleSortByDate implements Sort {

    @Override
    public void sort(ArrayList<Book> list) {

        Book helpingBook;

        for (int i = 0; i < list.size(); ++i){
            for (int j = i; j < list.size(); ++j){

                int bufferYear_1 = list.get(i).getPublichDate().getYear();
                int bufferYear_2 = list.get(j).getPublichDate().getYear();
                int bufferMonth_1 = list.get(i).getPublichDate().getMonth();
                int bufferMonth_2 = list.get(j).getPublichDate().getMonth();
                int bufferDay_1 = list.get(i).getPublichDate().getDay();
                int bufferDay_2 = list.get(j).getPublichDate().getDay();

                if (bufferYear_2 < bufferYear_1){
                    helpingBook = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, helpingBook);
                } else if (bufferYear_2 == bufferYear_1){
                    if (bufferMonth_2 < bufferMonth_1){
                        helpingBook = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, helpingBook);
                    } else if (bufferMonth_2 == bufferMonth_1){
                        if (bufferDay_2 < bufferDay_1){
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
