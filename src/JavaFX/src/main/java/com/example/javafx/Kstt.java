package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kstt extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Kstt.class.getResource("khao_sat.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),500,500);
        primaryStage.setTitle("Khảo Sát Thông Tin Sinh Viên");
        primaryStage.setScene(scene);
        RadioButton radio1 = new RadioButton("male");
        RadioButton radio2 = new RadioButton("female");
        ToggleGroup toggleGroup = new ToggleGroup();
        radio1.setToggleGroup(toggleGroup);
        radio2.setToggleGroup(toggleGroup);
        primaryStage.show();
    }
}
