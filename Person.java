import java.util.*;

public class Person {
    //名字
    private String name;
    //身份证号
    private String id;

    public Person(){

    }

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //默认方法
    public void system(ArrayList<Book> bookList, Scanner sc) {

    }

    //查看个人信息
    public void getInfo(){
        System.out.println("姓名：" + name);
    }
}
