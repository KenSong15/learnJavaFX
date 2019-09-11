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

    private Stage window;
    private Scene scene2;
    private ComboBox<String> comboBox;
    private ListView<String> listView;
    private TreeView<String> treeView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("basic widget range");

        GridPane basegrid = new GridPane();
        basegrid.setPadding(new Insets(10,10,10,10));
        basegrid.setVgap(1);
        basegrid.setHgap(1);
        Scene scene = new Scene(basegrid,900,600);
        window.setScene(scene);


        //section 1: switch scene.
        VBox section1 = new VBox(10);
        section1.setPadding(new Insets(5,5,5,5));
        GridPane.setConstraints(section1, 0,0);
        Label title1 = new Label("1. switching scene");

        Button button1 = new Button("go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        Label label2 = new Label("this scene bad.");
        Button button12 = new Button("go back to scene 1");
        button12.setOnAction(e -> window.setScene(scene));

        section1.getChildren().addAll(title1,button1);

        HBox layout2 = new HBox(10);
        layout2.getChildren().addAll(label2,button12);
        scene2 = new Scene(layout2, 600, 600);


        //section 2: alert popup
        Label title2 = new Label("2.show alert pop");
        Button button2 = new Button("show alert");
        button2.setOnAction(e -> AlertBox.display("alert title", "alert message"));

        VBox section2 = new VBox(10);
        section2.setPadding(new Insets(5,5,5,5));
        section2.getChildren().addAll(title2,button2);
        GridPane.setConstraints(section2, 1,0);


        //section 3: confirm popup
        VBox section3 = new VBox(10);
        section3.setPadding(new Insets(5,5,5,5));
        Label title3 = new Label("this is 3");

        Label result3 = new Label("(answer)");
        Button button3 = new Button("show confirm");
        button3.setOnAction(e -> {
            boolean result = ConfirmBox.display("confirm title", "are you sure?");
            result3.setText("ans: " + String.valueOf(result));
        });

        section3.getChildren().addAll(title3,result3,button3);
        GridPane.setConstraints(section3, 2,0);

        //section 4: proper close.
        VBox section4 = new VBox(10);
        section4.setPadding(new Insets(5,5,5,5));
        Label title4 = new Label("4: proper close");


        Button button4 = new Button("proper close app");

        button4.setOnAction(e -> closeProgram());
        window.setOnCloseRequest(e -> {
            e.consume();//take the control manually
            closeProgram();
        }); //two way close on same result

        section4.getChildren().addAll(title4, button4);
        GridPane.setConstraints(section4, 3,0);

        //section 5: embed layout.
        VBox section5 = new VBox(10);
        section5.setPadding(new Insets(5,5,5,5));
        Label title5 = new Label("5.embedded layout");

        HBox topMenu = new HBox();
        Button button51 = new Button("File");
        Button button52 = new Button("Edit");
        Button button53 = new Button("View");
        topMenu.getChildren().addAll(button51,button52,button53);

        VBox leftMenu = new VBox();
        Button button54 = new Button("button 4");
        Button button55 = new Button("button 5");
        Button button56 = new Button("button 6");
        leftMenu.getChildren().addAll(button54,button55,button56);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        section5.getChildren().addAll(title5, borderPane);
        GridPane.setConstraints(section5, 0,1);


        //section6: gridpane
        Label title6 = new Label("6.gridpane");
        GridPane.setConstraints(title6, 0,0);

        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0,1);

        //name input
        TextField nameinput = new TextField("Ken");
        GridPane.setConstraints(nameinput,1,1);

        //password label
        Label passwordlabel = new Label("Password: ");
        GridPane.setConstraints(passwordlabel, 0,2);

        //name input
        TextField psdinput = new TextField();
        psdinput.setPromptText("password");
        GridPane.setConstraints(psdinput,1,2);

        Button loginButton = new Button("log in");
        GridPane.setConstraints(loginButton,1,3);

        GridPane grid6 = new GridPane();
        grid6.setPadding(new Insets(10,10,10,10));
        grid6.setVgap(8);
        grid6.setHgap(10);

        grid6.getChildren().addAll(title6,nameLabel,nameinput,passwordlabel,psdinput,loginButton);
        GridPane.setConstraints(grid6, 1,1);

        //section 7: extract info and verify.
        VBox section7 = new VBox(10);
        section7.setPadding(new Insets(5,5,5,5));
        Label title7 = new Label("7.extract info and verify");

        TextField inputF = new TextField();
        Label result7 = new Label("(result)");
        Button button7 = new Button("confirm");
        button7.setOnAction(e->{
            result7.setText(inputF.getText());
            isInt(inputF,inputF.getText());
        });

        section7.getChildren().addAll(title7,inputF,result7,button7);
        GridPane.setConstraints(section7, 2,1);

        //section 8 checkbox.
        VBox section8 = new VBox(10);
        section8.setPadding(new Insets(5,5,5,5));
        Label title8 = new Label("8.checkbox");

        Button button8 = new Button("order now");

        //checkboxes
        CheckBox c1 = new CheckBox("fish");
        CheckBox c2 = new CheckBox("beef");
        c2.setSelected(true);

        button8.setOnAction( e -> hundlePick(c1,c2));

        section8.getChildren().addAll(title8,c1,c2,button8);
        GridPane.setConstraints(section8, 3,1);


        //section 9: choice box
        VBox section9 = new VBox(10);
        section9.setPadding(new Insets(5,5,5,5));
        Label title9 = new Label("9.choice box");

        Button button9 = new Button("select");

        //dropdown
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //get items then add to it
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("pear");
        choiceBox.getItems().add("banana");
        choiceBox.setValue("apples");

        //listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldvalue, newvalue) -> {
            System.out.println(oldvalue + " is the old value");
            System.out.println(newvalue + " is the new value");
        } );

        button9.setOnAction(e -> System.out.println(choiceBox.getValue() + " selected"));

        section9.getChildren().addAll(title9, choiceBox, button9);
        GridPane.setConstraints(section9, 0,2);

        //section 10: combobox.
        VBox section10 = new VBox(10);
        section10.setPadding(new Insets(5,5,5,5));
        Label title10 = new Label("10.combobox");
        Button button10 = new Button("select");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("food1", "food2", "drink1", "drink2");
        comboBox.setPromptText("what do you like?");
        comboBox.setEditable(true);

        button10.setOnAction(e->System.out.println(comboBox.getValue() + " get selected"));
        comboBox.setOnAction(e->System.out.println(comboBox.getValue() + " new value selected"));

        section10.getChildren().addAll(title10,comboBox,button10);
        GridPane.setConstraints(section10, 1,2);

        //section 11: listview
        VBox section11 = new VBox(10);
        section11.setPadding(new Insets(5,5,5,5));
        Label title11 = new Label("11.listview");

        Button button11 = new Button("select");

        listView = new ListView<>();
        listView.getItems().addAll("M1", "M2", "M3", "M4");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //multiple selection

        button11.setOnAction(e->{
            String message="";
            ObservableList<String> movies;
            movies = listView.getSelectionModel().getSelectedItems();

            for(String s: movies){
                message += s + "\n";
            }

            System.out.println(message);
        });

        section11.getChildren().addAll(title11,listView,button11);
        GridPane.setConstraints(section11, 2,2);


        //section 12: tree view.
        VBox section12 = new VBox();
        section12.setPadding(new Insets(5,5,5,5));
        Label title12 = new Label("12.treeview");
        Button button121 = new Button("select");


        TreeItem<String> root, food, movie;

        //tree root
        root = new TreeItem<>("root here");
        root.setExpanded(true);

        //food
        food = makeBranch("Food", root);
        makeBranch("shenzhen",food);
        makeBranch("hongkong",food);
        makeBranch("guangzhou",food);

        //movie
        movie = makeBranch("Movie", root);
        makeBranch("pinguo",movie);
        makeBranch("taozi",movie);

        //create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v, oldvalue, newvalue) -> {
            if(newvalue != null){
                System.out.println(newvalue.getValue());
            }
        });

        button121.setOnAction( e -> System.out.println(treeView.getSelectionModel().getSelectedItems().toString() + " selected"));

        section12.getChildren().addAll(title12,treeView,button121);
        GridPane.setConstraints(section12, 3,2);




        basegrid.getChildren().addAll(section1,section2,section3,section4,section5,grid6,
                section7,section8,section9,section10,section11,section12);
        basegrid.setGridLinesVisible(true);
        window.show();

    }



    //4.proper close
    private void closeProgram() {
        Boolean result = ConfirmBox.display("firm title", "are you sure you want to exit?");
        if(result) {
            System.out.println("close function run, app properly shut down");
            window.close();
        }
    }

    //7.input validation
    private boolean isInt(TextField tf,String message){
        try{
            int age = Integer.parseInt(tf.getText());
            System.out.println("User is: " + age);
            return true;
        } catch(NumberFormatException e){
            System.out.println("error: " + message + " is not a number");
            return false;
        }
    }

    //8.checkbox
    private void hundlePick(CheckBox c1,CheckBox c2){
        String massge = "";

        if(c1.isSelected()){
            massge+=c1.getText();
        }

        if(c2.isSelected()){
            massge+=c2.getText();
        }

        System.out.println(massge + " added");
    }

    //12.treeview
    private TreeItem<String> makeBranch(String title, TreeItem<String> root) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);

        root.getChildren().add(item);
        return item;
    }


    public static void main(String[] args) {

        launch(args);
    }

}
