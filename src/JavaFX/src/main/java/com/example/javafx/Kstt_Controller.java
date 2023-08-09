package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Kstt_Controller {
    @FXML
    protected TextField name;
    @FXML
    protected TextField clas;
    @FXML
    protected DatePicker myDate;
    @FXML
    protected RadioButton male;
    @FXML
    protected RadioButton female;
    @FXML
    protected ToggleGroup toggleGroup;

    public List<Student> listStudent= new ArrayList<>();
    @FXML
    protected TextField sdt;
    @FXML
    protected void onclick() throws IOException {
//        gender
            RadioButton select = (RadioButton) toggleGroup.getSelectedToggle();
            String gender = select.getText();
//
        LocalDate myDate1 = myDate.getValue();
        String myFormattedDate = myDate1.format(DateTimeFormatter.ofPattern("dd-MM-yy"));

          Student newStudent = new Student(name.getText(), clas.getText(),gender,myFormattedDate);
          listStudent.add(newStudent);
        for (Student c:listStudent
             ) {
            System.out.println(c);
        }
        System.out.println("-------------------------");
        File file = new File("C:\\Users\\haa27\\IdeaProjects\\JavaFX\\src\\main\\java\\com\\example\\javafx\\data.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listStudent);
        oos.close();
    }

}
