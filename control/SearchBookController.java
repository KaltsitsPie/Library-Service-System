package control;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SearchBookController {
    public TextField Enter_name;
    public TextField Enter_ID;
    public TableView<SearchTable> Search_Table;
    public TableColumn<SearchTable, String> Search_Book_Name_col;
    public TableColumn<SearchTable, String> Search_Book_ID_col;
    public TableColumn<SearchTable, String> Search_Borrowed_col;
    public Button Search_buttom;
    public Button Search_button_1;

    final ObservableList<SearchTable> data0 = FXCollections.observableArrayList(

    );

    final ObservableList<SearchTable> data = FXCollections.observableArrayList(
            new SearchTable("Java程序设计", "ID1234567", "已借出"),
            new SearchTable("Java程序设计经典方法", "ID2234787", "未借出"),
            new SearchTable("Java程序设计实践", "ID4638299", "未借出"),
            new SearchTable("Java程序设计:现代方法", "ID4646382", "已借出")
    );

    final ObservableList<SearchTable> data1 = FXCollections.observableArrayList(
            new SearchTable("Java程序设计", "ID1234567", "已借出")
    );

    public void initialize() {
        Search_Book_Name_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().bookNameFound);
        Search_Book_ID_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().bookIDFound);
        Search_Borrowed_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().isBorrowed);

        Search_Table.setItems(data0);
        Search_Table.getColumns().addAll(Search_Book_Name_col, Search_Book_ID_col, Search_Borrowed_col);
    }
    
    public void Search_click(ActionEvent actionEvent) {
        Enter_name.clear();
        Search_Table.getItems().clear();

//        Search_Book_Name_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().bookNameFound);
//        Search_Book_ID_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().bookIDFound);
//        Search_Borrowed_col.setCellValueFactory(searchTableStringCellDataFeatures -> searchTableStringCellDataFeatures.getValue().isBorrowed);

        Search_Table.setItems(data);
//        Search_Table.getColumns().addAll(Search_Book_Name_col, Search_Book_ID_col, Search_Borrowed_col);

    }

    public void Search_click_1(ActionEvent actionEvent) {
        Enter_ID.clear();
        Search_Table.getItems().clear();
        Search_Table.setItems(data1);
//        Search_Table.getColumns().addAll(Search_Book_Name_col, Search_Book_ID_col, Search_Borrowed_col);

    }

    static public class SearchTable {
        SimpleStringProperty bookNameFound;
        SimpleStringProperty bookIDFound;
        SimpleStringProperty isBorrowed;

        SearchTable(String bookNF, String bookIF, String isB) {
            this.bookNameFound = new SimpleStringProperty(bookNF);
            this.bookIDFound = new SimpleStringProperty(bookIF);
            this.isBorrowed = new SimpleStringProperty(isB);
        }

        String getBookBookNameFound() {
            return bookNameFound.get();
        }
        void setBookNameFound(String bookNF) {
            bookIDFound.set(bookNF);
        }
        String getBookIDFound() {
            return bookIDFound.get();
        }
        void setBookID(String bookIF) {
            bookIDFound.set(bookIF);
        }
        String getIsBorrowed() {
            return isBorrowed.get();
        }
        void setIsBorrowed(String isB) {
            isBorrowed.set(isB);
        }
    }
}
