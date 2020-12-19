package model;

/**
 *  书类
 */
public class Book {
    //书号，小于10位
    private String id;
    //书名
    private String name;
    //是否被收藏
    private boolean isStar;

    public Book() {
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
        this.isStar = false;
    }

    public boolean getRemark() {
        return isStar;
    }

    public void setRemark(boolean isStar) {
        this.isStar = isStar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "书名：" + name + "\n" +
                "书号：" + id;
    }
}
