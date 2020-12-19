package model;

public class LentBook extends Book {
    //归还期限，用yyyy年MM月dd日表示
    private String date;
    //借阅者姓名
    private String readerName;

    public String getDate() {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }
}
