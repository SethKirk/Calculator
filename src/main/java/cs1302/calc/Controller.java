package cs1302.calc;

import java.math.BigDecimal;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller{
    String text = "";
    @FXML
	public TextField display;
    @FXML
	public void handleButtons(ActionEvent event){
	text += "7";
	display.setText(text);

    }


}