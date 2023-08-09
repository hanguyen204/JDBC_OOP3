package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class chooser extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(chooser.class.getResource("file_chooser.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
