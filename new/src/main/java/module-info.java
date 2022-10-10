module com.example.new{
        requires javafx.controls;
        requires javafx.fxml;


        opens com.example.new to javafx.fxml;
        exports com.example.new;
        }