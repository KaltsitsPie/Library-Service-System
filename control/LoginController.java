package control;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LoginController {
    public void Login_click(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Login successfully!");
        alert.show();
    }
}
