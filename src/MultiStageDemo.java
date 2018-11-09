import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiStageDemo extends Application{

    @Override
    public void start(Stage primaryStage)   {

        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJacaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show();
    }
}
