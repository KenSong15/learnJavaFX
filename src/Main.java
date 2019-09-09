import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene1, scene2;
    //Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");

//        //1. switch scene===
//        window = primaryStage;
//
//        Label label1 = new Label("this is the first scene.");
//        Button button1 = new Button("go to scene 2");
//        button1.setOnAction(e -> window.setScene(scene2));
//
//        Label label2 = new Label("this scene bad.");
//        Button button2 = new Button("go back to scene 1");
//        button2.setOnAction(e -> window.setScene(scene1));
//
//        //layout 1 - children are laid out in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1,button1);
//        scene1 = new Scene(layout1, 200,200);
//
//        //layout 2 - laid out in horizontal
//        HBox layout2 = new HBox();
//        layout2.getChildren().addAll(button2, label2);
//        scene2 = new Scene(layout2, 600, 600);
//
//        window.setScene(scene1);
//        window.setTitle("title here");
//        window.show();
//        //switch scene done===

        //2. alert window===
        window = primaryStage;

        Label label1 = new Label("this is the first scene.");
        Button button1 = new Button("show alert");
        button1.setOnAction(e -> AlertBox.display("a title", "a message"));

        //layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 200,200);


        window.setScene(scene1);
        window.setTitle("title here");
        window.show();
        //allert window===
    }


    public static void main(String[] args) {

        launch(args);
    }

}
