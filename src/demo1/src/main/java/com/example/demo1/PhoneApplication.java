package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PhoneApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PhoneApplication.class.getResource("phone.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
