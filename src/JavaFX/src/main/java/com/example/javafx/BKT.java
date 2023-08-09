package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class BKT extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BKT.class.getResource("BKT.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),500,500);
        primaryStage.setTitle("Bài Kiểm Tra");
        primaryStage.setScene(scene);
        RadioButton a = new RadioButton();
        RadioButton b = new RadioButton();
        RadioButton c = new RadioButton();
        RadioButton d = new RadioButton();
        ToggleGroup toggleGroup =new ToggleGroup();
        a.setToggleGroup(toggleGroup);
        b.setToggleGroup(toggleGroup);
        c.setToggleGroup(toggleGroup);
        d.setToggleGroup(toggleGroup);
        primaryStage.show();
    }
}
