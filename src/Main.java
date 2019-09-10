import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene1, scene2;
    ComboBox<String> comboBox;
    ListView<String> listView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");

        //0.template
//        window = primaryStage;
//        VBox vBox = new VBox();
//        Button button = new Button("click me");
//        vBox.getChildren().addAll(button);
//        Scene scene = new Scene(vBox,300,200);
//
//        window.setScene(scene);
//        window.setTitle("title here");
//        window.show();

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


        //2. alert window===
//        window = primaryStage;
//
//        Label label1 = new Label("this is the first scene.");
//        Button button1 = new Button("show alert");
//        button1.setOnAction(e -> AlertBox.display("a title", "a message"));
//
//        //layout 1 - children are laid out in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1,button1);
//        scene1 = new Scene(layout1, 200,200);
//
//        window.setScene(scene1);
//        window.setTitle("title here");
//        window.show();


        //3.confirmBox
//        window = primaryStage;
//
//        Label label1 = new Label("this is the first scene.");
//        Button button1 = new Button("show confirm");
//        button1.setOnAction(e -> {
//            boolean result = ConfirmBox.display("a title", "are you sure?");
//            label1.setText("it said: " + String.valueOf(result));
//        });
//
//        //layout 1 - children are laid out in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1,button1);
//        scene1 = new Scene(layout1, 200,200);
//
//        window.setScene(scene1);
//        window.setTitle("title here");
//        window.show();


        //4.proper close
//        window = primaryStage;
//
//        Label label1 = new Label("this is the first scene.");
//        Button button1 = new Button("proper close app");
//
//        button1.setOnAction(e -> closeProgram());
//        window.setOnCloseRequest(e -> {
//            e.consume();//take the control manually
//            closeProgram();
//        }); //two way close on same result
//
//        //layout 1 - children are laid out in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label1,button1);
//        scene1 = new Scene(layout1, 200,200);
//
//        window.setScene(scene1);
//        window.setTitle("title here");
//        window.show();


        //5.embedding layout

//        window = primaryStage;
//
//        Label label1 = new Label("embedding layout.");
//
//        HBox topMenu = new HBox();
//        Button button1 = new Button("File");
//        Button button2 = new Button("Edit");
//        Button button3 = new Button("View");
//        topMenu.getChildren().addAll(button1,button2,button3);
//
//        VBox leftMenu = new VBox();
//        Button button4 = new Button("button 4");
//        Button button5 = new Button("button 5");
//        Button button6 = new Button("button 6");
//        leftMenu.getChildren().addAll(button4,button5,button6);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setLeft(leftMenu);
//
//        scene1 = new Scene(borderPane, 200,200);
//
//        window.setScene(scene1);
//        window.setTitle("title here");
//        window.show();

        //6. gridpane
//        window = primaryStage;
//        window.setTitle("gridpane");
//
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10,10,10,10));
//        grid.setVgap(8);
//        grid.setHgap(10);
//
//        //name label
//        Label nameLabel = new Label("Username: ");
//        GridPane.setConstraints(nameLabel, 0,0);
//
//        //name input
//        TextField nameinput = new TextField("Ken");
//        GridPane.setConstraints(nameinput,1,0);
//
//        //password label
//        Label passwordlabel = new Label("Password: ");
//        GridPane.setConstraints(passwordlabel, 0,1);
//
//        //name input
//        TextField psdinput = new TextField();
//        psdinput.setPromptText("password");
//        GridPane.setConstraints(psdinput,1,1);
//
//        Button loginButton = new Button("log in");
//        GridPane.setConstraints(loginButton,1,2);
//
//        grid.getChildren().addAll(nameLabel,nameinput,passwordlabel,psdinput,loginButton);
//
//        Scene scene = new Scene(grid,400,300);
//        window.setScene(scene);
//        window.show();

        //7.extract and validate info
        //use .getText to get the text
//        window = primaryStage;
//        VBox vBox = new VBox();
//        TextField inputF = new TextField();
//        Label result = new Label("result goes here");
//        Button firm = new Button("confirm");
//        firm.setOnAction(e->{
//            result.setText(inputF.getText());
//            isInt(inputF,inputF.getText());
//        });
//        vBox.getChildren().addAll(inputF,result,firm);
//        Scene scene = new Scene(vBox,300,200);
//
//        window.setScene(scene);
//        window.setTitle("title here");
//        window.show();


        //8.checkbox
//        window = primaryStage;
//        Button button = new Button("order now");
//
//
//        //checkboxes
//        CheckBox c1 = new CheckBox("fish");
//        CheckBox c2 = new CheckBox("beef");
//        c2.setSelected(true);
//
//        button.setOnAction( e -> hundlePick(c1,c2));
//
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(c1,c2,button);
//        Scene scene = new Scene(vBox, 300,200);
//
//        window.setScene(scene);
//        window.setTitle("title here");
//        window.show();


        //9.choice box
//        window = primaryStage;
//        VBox vBox = new VBox();
//        Button button = new Button("click me");
//
//        //dropdown
//        ChoiceBox<String> choiceBox = new ChoiceBox<>();
//
//        //get items then add to it
//        choiceBox.getItems().add("apples");
//        choiceBox.getItems().add("pear");
//        choiceBox.getItems().add("banana");
//        choiceBox.setValue("apples");
//
//        //listen for selection changes
//        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldvalue, newvalue) -> {
//            System.out.println(oldvalue + " is the old value");
//            System.out.println(newvalue + " is the new value");
//        } );
//
//        button.setOnAction(e -> {
//            System.out.println(choiceBox.getValue() + " selected");
//        });
//
//        vBox.getChildren().addAll(choiceBox, button);
//        vBox.setPadding(new Insets(10,10,10,10));
//        Scene scene = new Scene(vBox,300,200);
//
//        window.setScene(scene);
//        window.setTitle("title here");
//        window.show();


        //10.combobox
//        window = primaryStage;
//        VBox vBox = new VBox();
//        Button button = new Button("click me");
//
//        comboBox = new ComboBox<>();
//        comboBox.getItems().addAll("food1", "food2", "drink1", "drink2");
//        comboBox.setPromptText("what do you like?");
//        comboBox.setEditable(true);
//
//        button.setOnAction(e->System.out.println(comboBox.getValue() + " get selected"));
//        comboBox.setOnAction(e->System.out.println(comboBox.getValue() + " new value selected"));
//
//        vBox.getChildren().addAll(comboBox,button);
//        Scene scene = new Scene(vBox,300,200);
//
//        window.setScene(scene);
//        window.setTitle("title here");
//        window.show();

        //11.listview
        window = primaryStage;
        VBox vBox = new VBox();
        Button button = new Button("click me");

        listView = new ListView<>();
        listView.getItems().addAll("M1", "M2", "M3", "M4");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //multiple selection

        button.setOnAction(e->{
            String message="";
            ObservableList<String> movies;
            movies = listView.getSelectionModel().getSelectedItems();

            for(String s: movies){
                message += s + "\n";
            }

            System.out.println(message);
        });

        vBox.getChildren().addAll(listView,button);
        Scene scene = new Scene(vBox,300,200);

        window.setScene(scene);
        window.setTitle("title here");
        window.show();

    }

    //4.proper close
//    private void closeProgram() {
//        Boolean result = ConfirmBox.display("firm title", "are you sure you want to exit?");
//        if(result) {
//            System.out.println("file saved");
//            window.close();
//        }
//    }

    //7.input validation
//    private boolean isInt(TextField tf,String message){
//        try{
//            int age = Integer.parseInt(tf.getText());
//            System.out.println("User is: " + age);
//            return true;
//        } catch(NumberFormatException e){
//            System.out.println("error: " + message + " is not a number");
//            return false;
//        }
//    }

    //8.checkbox
//    private void hundlePick(CheckBox c1,CheckBox c2){
//        String massge = "";
//
//        if(c1.isSelected()){
//            massge+=c1.getText();
//        }
//
//        if(c2.isSelected()){
//            massge+=c2.getText();
//        }
//
//        System.out.println(massge + " added");
//    }


    public static void main(String[] args) {

        launch(args);
    }

}
