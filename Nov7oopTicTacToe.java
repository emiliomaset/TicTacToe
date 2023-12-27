package com.example.nov7ooptictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;


public class Nov7oopTicTacToe extends Application {

    private GridPane myGridPane;
    private Label resultLabel;
    private int whichTurn = 0;

    Button col0Row0Button = new Button();
    Button col1Row0Button = new Button();
    Button col2Row0Button = new Button();
    Button col0Row1Button = new Button();
    Button col1Row1Button = new Button();
    Button col2Row1Button = new Button(); // use 2d array of buttons
    Button col0Row2Button = new Button();
    Button col1Row2Button = new Button();
    Button col2Row2Button = new Button();


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        myGridPane = new GridPane();
        myGridPane.setAlignment(Pos.CENTER);

        resultLabel = new Label("");

        doABunchOfUglyButtonStuff();

        Label greetingLabel = new Label("Welcome to tic-tac-toe!");
        greetingLabel.setFont(Font.font(20));
        greetingLabel.setBorder((new Border(new BorderStroke(Color.MEDIUMBLUE, BorderStrokeStyle.SOLID, null, null))));

        HBox gridPaneHBox = new HBox(myGridPane);
        gridPaneHBox.setPadding( new Insets(40));
        gridPaneHBox.setAlignment(Pos.CENTER);

        VBox myVBox = new VBox(15, greetingLabel, gridPaneHBox, resultLabel);
        myVBox.setPadding( new Insets(30));
        myVBox.setAlignment(Pos.TOP_CENTER);

        Scene myScene = new Scene(myVBox, 500, 500);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Tic-tac-toe");
        primaryStage.show();
    }

    public void winChecker() {
        if ( (col0Row0Button.getText().equals("X") && col1Row0Button.getText().equals("X") && col2Row0Button.getText().equals("X"))
                || (col0Row0Button.getText().equals("O") && col1Row0Button.getText().equals("O") && col2Row0Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col0Row1Button.getText().equals("X") && col1Row1Button.getText().equals("X") && col2Row1Button.getText().equals("X"))
                || (col0Row1Button.getText().equals("O") && col1Row1Button.getText().equals("O") && col2Row1Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col0Row2Button.getText().equals("X") && col1Row2Button.getText().equals("X") && col2Row2Button.getText().equals("X"))
                || (col0Row2Button.getText().equals("O") && col2Row1Button.getText().equals("O") && col2Row2Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col0Row0Button.getText().equals("X") && col0Row1Button.getText().equals("X") && col0Row2Button.getText().equals("X"))
                || (col0Row0Button.getText().equals("O") && col0Row1Button.getText().equals("O") && col0Row2Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col1Row0Button.getText().equals("X") && col1Row1Button.getText().equals("X") && col1Row2Button.getText().equals("X"))
                || (col1Row0Button.getText().equals("O") && col1Row1Button.getText().equals("O") && col1Row2Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col2Row0Button.getText().equals("X") && col2Row1Button.getText().equals("X") && col2Row2Button.getText().equals("X"))
                || (col2Row0Button.getText().equals("O") && col2Row1Button.getText().equals("O") && col2Row2Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col0Row0Button.getText().equals("X") && col1Row1Button.getText().equals("X") && col2Row2Button.getText().equals("X"))
                || (col0Row0Button.getText().equals("O") && col2Row1Button.getText().equals("O") && col2Row2Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if ( (col0Row2Button.getText().equals("X") && col1Row1Button.getText().equals("X") && col2Row0Button.getText().equals("X"))
                || (col0Row2Button.getText().equals("O") && col1Row1Button.getText().equals("O") && col2Row0Button.getText().equals("O")))
            resultLabel.setText("A winner has been declared!");

        else if (whichTurn == 8 && resultLabel.getText().equals(""))
            resultLabel.setText("Cat has won ^.^");


    }

    class ButtonClickHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            if (resultLabel.getText().equals("A winner has been declared!"))
                return;

            if (actionEvent.getSource() == col0Row0Button && col0Row0Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col0Row0Button.setText("X");
                else
                    col0Row0Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col1Row0Button && col1Row0Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col1Row0Button.setText("X");
                else
                    col1Row0Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col2Row0Button && col2Row0Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col2Row0Button.setText("X");
                else
                    col2Row0Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col0Row1Button && col0Row1Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col0Row1Button.setText("X");
                else
                    col0Row1Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col1Row1Button && col1Row1Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col1Row1Button.setText("X");
                else
                    col1Row1Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col2Row1Button && col2Row1Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col2Row1Button.setText("X");
                else
                    col2Row1Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col0Row2Button && col0Row2Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col0Row2Button.setText("X");
                else
                    col0Row2Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col1Row2Button && col1Row2Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col1Row2Button.setText("X");
                else
                    col1Row2Button.setText("O");
                winChecker();
                whichTurn++;
            }

            if (actionEvent.getSource() == col2Row2Button && col2Row2Button.getText().equals("")) {
                if (whichTurn % 2 == 0)
                    col2Row2Button.setText("X");
                else
                    col2Row2Button.setText("O");
                winChecker();
                whichTurn++;
            }

        }

        }

        public void doABunchOfUglyButtonStuff() {
            col0Row0Button.setOnAction( new ButtonClickHandler());
            col1Row0Button.setOnAction( new ButtonClickHandler());
            col2Row0Button.setOnAction( new ButtonClickHandler());
            col0Row1Button.setOnAction( new ButtonClickHandler());
            col1Row1Button.setOnAction( new ButtonClickHandler());
            col2Row1Button.setOnAction( new ButtonClickHandler());
            col0Row2Button.setOnAction( new ButtonClickHandler());
            col1Row2Button.setOnAction( new ButtonClickHandler());
            col2Row2Button.setOnAction( new ButtonClickHandler());


            col0Row0Button.setPrefSize(50,50);
            col1Row0Button.setPrefSize(50, 50);
            col2Row0Button.setPrefSize(50,50);
            col0Row1Button.setPrefSize(50,50);
            col1Row1Button.setPrefSize(50,50);
            col2Row1Button.setPrefSize(50,50);
            col0Row2Button.setPrefSize(50, 50);
            col1Row2Button.setPrefSize(50, 50);
            col2Row2Button.setPrefSize(50, 50);

            myGridPane.add(col0Row0Button, 0, 0);
            myGridPane.add(col1Row0Button, 1, 0);
            myGridPane.add(col2Row0Button, 2, 0);
            myGridPane.add(col0Row1Button, 0, 1);
            myGridPane.add(col1Row1Button, 1, 1);
            myGridPane.add(col2Row1Button, 2, 1);
            myGridPane.add(col0Row2Button, 0, 2);
            myGridPane.add(col1Row2Button, 1, 2);
            myGridPane.add(col2Row2Button, 2, 2);
        }
}