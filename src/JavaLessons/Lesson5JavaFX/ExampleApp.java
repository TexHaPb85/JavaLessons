package JavaLessons.Lesson5JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExampleApp extends Application {
    private void showAlertWithHeaderText(String string) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert title");
        alert.setHeaderText("Alert Header Text");
        alert.setContentText(string);

        alert.showAndWait();
    }

    private Scene generateScene(Pane pane){
        TextField textField = new TextField();
        Button button = new Button("show alert");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Text in the TextField:");
        stringBuilder.append('\n');
        button.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

            stringBuilder.append(textField.getText());
            textField.clear();
            alert.setContentText(stringBuilder.toString());
            alert.show();
        });
        //showAlertWithHeaderText(stringBuilder.toString());
        pane.getChildren().addAll(textField,button);
        Scene scene = new Scene(pane);
        return scene;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();
        VBox vBox = new VBox();

        GridPane gridPane = new GridPane();
        Scene scene = generateScene(vBox);
        primaryStage.setTitle("Example App");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
