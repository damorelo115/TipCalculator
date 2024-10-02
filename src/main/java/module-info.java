module lauren.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens lauren.tipcalculator to javafx.fxml;
    exports lauren.tipcalculator;
}