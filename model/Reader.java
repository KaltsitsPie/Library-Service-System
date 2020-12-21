package model;

import java.util.*;

/**
 *  读者类
 */
public class Reader extends Person{
    ArrayList<LentBook> bookList;

    public Reader(){

    }

    public Reader(String name, String id, ArrayList<LentBook> bookList){
        this.setName(name);
        this.setId(id);
        this.bookList = bookList;
    }

    public void setBookList(ArrayList<LentBook> books) {
        this.bookList = books;
    }

    public ArrayList<LentBook> getBookList() {
        return bookList;
    }

    @Override
    public void system(ArrayList<Book>bookList, Scanner sc) {
        while(true){
            System.out.println("1.查看个人信息 2.查询图书 3.借书 4.还书 5.返回");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    getInfo();
                    break;
                case 2:
                    queryBooks(bookList, sc);
                    break;
                case 3:
                    borrowBook(bookList, sc);
                    break;
                case 4:
                    repayBook(bookList,sc);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("请输入正确的信息！");
                    break;
            }
        }
    }

    //查询个人信息
    @Override
    public void getInfo() {
        System.out.println("读者");
        System.out.println("姓名：" + getName());
        System.out.println("身份证号：" + getId());
        System.out.println("已借阅图书：");
        if (bookList.size() == 0) {
            System.out.println("尚未借阅任何图书");
        }
        else{
            for (int i = 0; i < bookList.size(); i++) {
                Book book = bookList.get(i);
                System.out.println(book);
            }
        }
    }

    //查询图书
    public static void queryBooks(ArrayList<Book> bookList, Scanner sc){
        System.out.println("请输入查询方式：0.按书名查询; 1.按书号查询 2.退出");
        int type = sc.nextInt();
        switch (type) {
            case 0:
                String bookName = sc.nextLine();
                //按书名查询

                break;
            case 1:
                String bookId = sc.nextLine();
                //按书号查询

                break;
            case 2:
                System.out.println("退出查询！");
                return;
            default:
                System.out.println("请正确输入！");
                return;
        }

    }

    //按书名查询图书
    public static Book queryBooksByName(ArrayList<Book> bookList, Scanner sc, String bookName){
        for (Book b: bookList) {
            if (b.getName().equals(bookName)) {
                return b;
            }
        }
        return null;
    }

    //按书号查询图书
    public static Book queryBooksById(ArrayList<Book> bookList, Scanner sc, String id){
        for (Book b: bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    //借书
    public static void borrowBook(ArrayList<Book> bookList, Scanner sc) {

    }

    //还书
    public static void repayBook(ArrayList<Book> bookList, Scanner sc) {

    }

}
