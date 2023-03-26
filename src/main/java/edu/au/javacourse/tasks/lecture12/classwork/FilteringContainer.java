package edu.au.javacourse.tasks.lecture12.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class FilteringContainer<T> {

    List<T> items = new ArrayList<>();
    Predicate<T> filter;
    Consumer<T> rejecter;
   public FilteringContainer(Predicate<T> filter ,Consumer<T> rejecter) {
       this.filter = filter;
       this.rejecter = rejecter;
   }
   public void add(T item){
       if (filter.test(item)) items.add(item);
       else rejecter.accept(item);
   }
   public List<T> getItems() {
       return items;
   }

}
