module com.enemyspeak.enemyspeak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.enemyspeak.enemyspeak to javafx.fxml;
    exports com.enemyspeak.enemyspeak;
}