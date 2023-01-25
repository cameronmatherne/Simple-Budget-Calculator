package com.example.javafx_demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    Stage window;
    Scene scene1, scene2;


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Budget calculator");

        Label label1 = new Label("Personal budget calculator");
        Button button1 = new Button("Calculate budget ");
        button1.setOnAction(e -> AlertBox.display("Title of window", "Wow"));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Budget Calculator");
        Text scenesubtitle = new Text("Enter biweekly earnings below:");
        TextField sceneinput = new TextField();
        Button generatebudget = new Button("Generate budget");
        generatebudget.setOnAction(e -> {
            CalculateBudget.calculate(732.40);
        });

        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20 ));
        scenesubtitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12 ));
        grid.add(scenetitle, 1, 0);
        grid.add(scenesubtitle, 1, 1);
        grid.add(sceneinput, 1, 2);
        grid.add(generatebudget, 1, 3);


        scene1 = new Scene(grid, 200, 200);
        window.setScene(scene1);
        window.show();



    }
}