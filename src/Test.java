
//使用链表和映射存放多个图书信息，遍历并输出。
// 其中商品属性：编号，名称，单价，出版社；
// 使用商品编号作为映射中的key。

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.AbstractMap;

public class Test {
    public static void main(String[] args) {
//        Test of LinkedList
        LinkedList<Book> books = new LinkedList<Book>();
        books.add(new Book(1,"book1",10.0,"sun"));
        books.add(new Book(2,"book2",20.0,"sun"));
        books.add(new Book(3,"book3",30.0,"sun"));
        books.add(new Book(4,"book4",40.0,"sun"));
        for(Book x:books){
            System.out.println(x.getISBN()+" "+x.getName()+" "+x.getPrice()+" "+x.getPublisher());
        }

//        Test of TreeMap
        Map<Integer,Book> ex_books=new TreeMap<Integer, Book>();
        ex_books.put(1,new Book(1,"book1",10.0,"sun"));
        ex_books.put(2,new Book(2,"book2",20.0,"sun"));
        ex_books.put(3,new Book(3,"book3",30.0,"sun"));
        ex_books.put(4,new Book(4,"book4",40.0,"sun"));
//        for(int i=1;i<5;i++) {
//            System.out.println(ex_books.get(i).getISBN() + " " + ex_books.get(i).getName() + " " + ex_books.get(i).getPrice() + " " + ex_books.get(i).getPublisher());
//        }
        Iterator it=ex_books.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+" "+(entry.getKey())+" "+
                    ((Book)entry.getValue()).getPrice()+" "+((Book)entry.getValue()).getPublisher());
        }

    }
}
