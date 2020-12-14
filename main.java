import java.util.*;

public class main {
    public static void main(String[] args) {
        //所有书籍的数组
        ArrayList<Book> bookList = new ArrayList<>();
        //加两本书
        Book b1 = new Book("01", "软件工程：实践者的研究方法");
        Book b2 = new Book("02", "Java程序设计");
        bookList.add(b1); bookList.add(b2);
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------图书馆服务系统--------------");
        while (true) {
            System.out.println("请输入权限：0.管理员 1.用户 2.退出");
            int type = sc.nextInt();
            sc.nextLine();
            switch (type) {
                case 0:
                    System.out.println("------------欢迎进入管理员系统！-----------");
                    Manager manager = new Manager("莫小西", "0987654321");
                    manager.system(bookList, sc);
                    break;
                case 1:
                    System.out.println("-------------欢迎进入读者系统！-------------");
                    ArrayList<Book> books = new ArrayList<>();
                    Reader reader = new Reader("张思瑞", "1234567890", books);
                    reader.system(bookList, sc);
                    break;
                case 2:
                    System.out.println("退出系统！");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
