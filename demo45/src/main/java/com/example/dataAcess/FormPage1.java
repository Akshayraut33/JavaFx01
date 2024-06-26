package com.example.dataAcess;


import com.example.controller.FormNavigationApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.text.Font;

public class FormPage1 {

    private FormNavigationApp app;
    private GridPane view;
    private TextField field1;

    public FormPage1(FormNavigationApp app) {
        this.app = app;
        initialize();
    }

    private void initialize() {

        view = new GridPane();
        view.setPadding(new Insets(10));
        view.setHgap(10);
        view.setVgap(10);
        view.setAlignment(Pos.CENTER);

     
        Image image = new Image("assets/images/panda.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400); 
        imageView.setFitHeight(300); 
        imageView.setPreserveRatio(true); 

      
        Label label1 = new Label("Name:");
        label1.setStyle("-fx-font-weight: bold");
       label1.setFont(Font.font("Arial", 20));

       field1 = new TextField();
       field1.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #4CAF50; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-padding: 5px; -fx-font-weight: bold; -fx-pref-height: 30px;");
       field1.setPromptText("Enter Field 1");
       



       

       
        Button nextButton = new Button("Next");
        nextButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px;");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage2();
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setField1Value(null);
            }
        });

        view.add(imageView, 0, 0);
        view.add(label1, 1, 0);
        view.add(field1, 2, 0);
        view.add(nextButton, 3, 0);
        view.add(clearButton, 4, 0);
        view.setStyle("-fx-background-color:#FFFED3;");

    }

    public GridPane getView() {
        return view;
    }

    public String getField1Value() {
        return field1.getText();
    }

    public void setField1Value(String value) {
        field1.setText(value);
    }
}
