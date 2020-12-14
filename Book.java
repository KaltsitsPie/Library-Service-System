
/**
 *  书类
 */
public class Book {
    //书号，小于10位
    private String id;
    //书名
    private String name;
    //归还期限，用yyyy年MM月dd日表示
    private String date;
    //是否处于被借出状态，true为借出
    private boolean isLent;
    //是否被收藏
    private boolean isStar;

    public Book() {
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
        this.isLent = true;
        this.isStar = false;
    }

    public boolean getIsLent() {
        return isLent;
    }

    public void setIsLent(boolean isLent) {
        this.isLent = isLent;
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

    public String getDate() {

        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    @Override
    public String toString() {
        if (getIsLent()) {
            return "书名：" + name + "\n" +
                    "书号：" + id + "\n" +
                    "状态：借出\n" +
                    "归还期限：" + date;
        }
        else{
            return "书名：" + name + "\n" +
                    "书号：" + id + "\n" +
                    "状态: 在馆";
        }
    }
}
