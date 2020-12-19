package model;

import java.util.*;

/**
 *  管理员类
 */
public class Manager extends Person {

    public Manager() {

    }

    public Manager(String name, String id) {
        this.setName(name);
        this.setId(id);
    }

    @Override
    public void system(ArrayList<Book> bookList, Scanner sc) {
        while(true){
            System.out.println("1.查询个人信息 2.检查图书借阅情况 3.增加读者账号 4.删除读者账号 5.查看读者信息 6.修改读者信息 7.返回");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    getInfo();
                    break;
                case 2:
                    checkBookList(bookList);
                    break;
                case 3:
                    addReader();
                    break;
                case 4:
                    deleteReader();
                    break;
                case 5:
                    getReaderInfo();
                    break;
                case 6:
                    changeReader();
                case 7:
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
        System.out.println("管理员");
        System.out.println("姓名：" + getName());
        System.out.println("身份证号：" + getId());
    }

    //检查图书借阅情况
    public void checkBookList(ArrayList<Book>bookList) {

    }

    //增加读者账号
    public void addReader() {

    }

    //删除读者账号
    public void deleteReader() {

    }

    //查看读者信息
    public void getReaderInfo() {

    }

    //修改读者信息
    public void changeReader() {

    }
}
