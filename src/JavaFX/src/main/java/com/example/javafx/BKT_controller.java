package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class BKT_controller {
    @FXML
    protected RadioButton a;
    @FXML
    protected RadioButton b;
    @FXML
    protected RadioButton c;
    @FXML
    protected RadioButton d;
    @FXML
    protected ToggleGroup toggleGroup;
    @FXML
    protected RadioButton a1;
    @FXML
    protected RadioButton b1;
    @FXML
    protected RadioButton c1;
    @FXML
    protected RadioButton d1;
    @FXML
    protected Label textLabel;
    @FXML
    protected Label textLabel2;
    @FXML
    protected ToggleGroup toggleGroup2;
    @FXML
    protected void submit(){
        if (a.isSelected()  ){
            textLabel.setText("câu1: đúng");
        }else {
            textLabel.setText("Câu 1: Saii");
        }
        if (c1.isSelected() ){
            textLabel2.setText("câu 2: đúng");
        }else {
            textLabel2.setText("Câu 2: Saii");
        }

    }
}
