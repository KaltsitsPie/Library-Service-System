package control;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.collections.*;

import java.awt.print.Book;


public class ReaderInfoController {
    public TableColumn<ReaderTable, String> Book_borrowed_col;
    public TableColumn<ReaderTable, String> Book_ID_col;
    public TableColumn<ReaderTable, String> Return_date_col;
    public Text Name_text;
    public Text Id_text;
    public TableView<ReaderTable> Table_Reader;

    final ObservableList<ReaderTable> data = FXCollections.observableArrayList(
            new ReaderTable("Java程序设计", "ID1234567", "2020.12.25"),
            new ReaderTable("极限运动：你不得不知道的二三事", "ID2333333", "2021.2.1"),
            new ReaderTable("软件工程：实践者的研究方法", "ID6666666", "2021.3.4")
    );

    public void initialize() {
        Book_borrowed_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().bookBorrowed);
        Book_ID_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().bookID);
        Return_date_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().returnDate);

        Table_Reader.setItems(data);
        Table_Reader.getColumns().addAll(Book_borrowed_col, Book_ID_col, Return_date_col);
    }

    public void Check_click(ActionEvent actionEvent) {
        Table_Reader.getItems().clear();
        Book_borrowed_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().bookBorrowed);
        Book_ID_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().bookID);
        Return_date_col.setCellValueFactory(readerTableStringCellDataFeatures -> readerTableStringCellDataFeatures.getValue().returnDate);

        Table_Reader.setItems(data);
        Table_Reader.getColumns().addAll(Book_borrowed_col, Book_ID_col, Return_date_col);
    }

    static class ReaderTable {
        SimpleStringProperty bookBorrowed;
        SimpleStringProperty bookID;
        SimpleStringProperty returnDate;

        ReaderTable(String bookB, String bookI, String returnD) {
            this.bookBorrowed = new SimpleStringProperty(bookB);
            this.bookID = new SimpleStringProperty(bookI);
            this.returnDate = new SimpleStringProperty(returnD);
        }

        String getBookBorrowed() {
            return bookBorrowed.get();
        }
        void setBookBorrowed(String bookB) {
            bookBorrowed.set(bookB);
        }
        String getBookID() {
            return bookID.get();
        }
        void setBookID(String bookI) {
            bookID.set(bookI);
        }
        String getReturnDate() {
            return returnDate.get();
        }
        void setReturnDate(String returnD) {
            returnDate.set(returnD);
        }
    }
}