module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.Dienthoai;
    opens com.example.demo.Dienthoai to javafx.fxml;
    exports com.example.demo.week2.TH;
    opens com.example.demo.week2.TH to javafx.fxml;
}