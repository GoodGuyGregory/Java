package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        GridPane example = (GridPane) root;

//        Group root = new Group();
//        Text txt = new Text("Sup?");
//        txt.setFont(new Font("Papyrus", 80));
//        Label label = new Label("Name:");
//        TextField nameFld = new TextField();
////Creates the Gridpane layout
//        GridPane grid = new GridPane();
//
////        Add Items to the grid and specify the layout
////        gridlineshelp for visual debugging
////        grid.setGridLinesVisible(true);
//        grid.add(label, 0, 0);
//        grid.add(nameFld, 1, 0);
////        Adds the btn to the second column and the second row
//        Button btn = new Button();
//        btn.setText("Say Sup!");
//
//        grid.add(btn, 1, 1);
//
//        //Sets the Height gap distance
//        grid.setHgap(20);
//
//
//        txt.setY(50);
//
//        VBox box = new VBox();
//        box.getChildren().addAll(txt, grid);
//        root.getChildren().add(box);
////    Sets an event listener to listen to the action that was taken with a lambda function
//        btn.setOnAction(evt -> System.out.printf("Sup %s!%n", nameFld.getText()));

        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        root.getStylesheets().add(getClass().getResource("/css/sample.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
