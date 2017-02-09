package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {


    public TextField txtfldFormsCount;
    public Canvas cnvsResult;

    public void buttonClick(MouseEvent mouseEvent) {

    }

    private void showError(String textError){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Input error");
        alert.setContentText(textError);
        alert.show();
    }
}

