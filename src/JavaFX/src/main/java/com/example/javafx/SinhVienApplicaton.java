package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SinhVienApplicaton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SinhVien.class.getResource("Sinhvien.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300,300);
        primaryStage.setTitle("Quản lý điểm số");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
