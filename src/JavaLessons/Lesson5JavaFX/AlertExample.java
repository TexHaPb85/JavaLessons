package JavaLessons.Lesson5JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class AlertExample extends Application{
    public Scene getScene(){
        TextField textField = new TextField("myTextField");
        Button button = new Button("myButton");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        button.setOnAction(event -> {
            alert.setTitle("Alert title");
            alert.setHeaderText("Alert Header Text");
            alert.setContentText(textField.getText());
            alert.show();

        });
        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField,button);
        return new Scene(vBox);
    }

    private Pane getPane(){
        TextField textField = new TextField("myTextField");
        Button button = new Button("myButton");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        button.setOnAction(event -> {
            alert.setTitle("Alert title");
            alert.setHeaderText("Alert Header Text");
            alert.setContentText(textField.getText());
            alert.show();

        });
        HBox vBox = new HBox();
        vBox.getChildren().addAll(textField,button);
        return vBox;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(getPane());
        //Scene scene = getScene();
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
