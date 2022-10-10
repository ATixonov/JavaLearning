module ru.synergy.javalearning {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.synergy.javalearning to javafx.fxml;
    exports ru.synergy.javalearning;
}