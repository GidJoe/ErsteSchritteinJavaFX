package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // BorderPane wird aufgerufen und an "meinborderpane" gebunden
        BorderPane meinborderpane = new BorderPane();

        String test24 = "Position 1";


        // Button
        Button button1 = new Button("Anmelden");
        Button button2 = new Button("Suchen");
        Button button3 = new Button("Wartezimmer");
        Button button4 = new Button("nächsten Patienten aufrufen");

        Button[] buttons = {button1, button2, button3, button4};
        HBox hbox1 = new HBox(buttons);

        String test1 = "Hallo mein Name Ist  MArc \n" +
                "ich möchte hier was testen mal gucken ob das klappt \n"
                +test24 +" na das klappt ja schon besser";



        Text text = new Text("Patient bitte anmelden!");
        text.setText(test1);

        Text anmeldungen = new Text();
        anmeldungen.setText("Angemeldete Patienten");



        text.setFont(Font.font("Arial", FontWeight.EXTRA_LIGHT, 20));

    //   meinborderpane.setCenter(hbox1);
         meinborderpane.setBottom(hbox1);


//        button1.setMinHeight(100);
//        button3.setMinWidth(100);


        // Button Größe
        button1.setMaxSize(90, 90);
        button2.setMaxSize(90, 90);
        button3.setMaxSize(90, 90);


        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");

        TextField field = new TextField();
        field.setText("NAME");
        field.setAlignment(Pos.BASELINE_CENTER);

        String eingabe1 = field.getText();

        field.setOnAction(actionEvent -> {
            System.out.println("test");

        });



        Text patientenausage = new Text();
        String ausgabepatienten = "";



        for (int i = 1; i<20; i++) {
            ausgabepatienten+=i + " Müller \n";
        }


        patientenausage.setText(ausgabepatienten);
        patientenausage.setX(50);
        patientenausage.setY(50);


        button1.setOnAction(actionEvent -> meinborderpane.setLeft(field));
        button3.setOnAction(actionEvent -> meinborderpane.setCenter(text));
        meinborderpane.setRight(patientenausage);






        // Scene
        Scene neuescene = new Scene(meinborderpane, 600, 600);
        stage.setScene(neuescene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}