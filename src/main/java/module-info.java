module com.example.br_seniorproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.br_seniorproject to javafx.fxml;
    exports com.example.br_seniorproject;
}