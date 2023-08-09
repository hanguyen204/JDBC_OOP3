package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class chooser_Controller {
    @FXML
    protected ImageView imageView;
    @FXML
    protected AnchorPane ap;
    @FXML
    protected void chooseImage(){
        Stage stage = (Stage) ap.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("choose image");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("ImageFile","*jpeg","*.jpg","*.png");
        fileChooser.getExtensionFilters().add(imageFilter);
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }

    }
}
