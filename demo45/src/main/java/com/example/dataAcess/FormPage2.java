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

public class FormPage2 {

    private FormNavigationApp app;
    private GridPane view;
    private TextField field2;

    public FormPage2(FormNavigationApp app) {
        this.app = app;
        initialize();
    }

   
    private void initialize() {
       
        view = new GridPane();
        view.setPadding(new Insets(16)); 
        view.setHgap(16); 
        view.setVgap(10);
        view.setAlignment(Pos.CENTER); 

        
        Label label2 = new Label("College Name:");
        label2.setStyle("-fx-font-weight: bold");
        label2.setFont(Font.font("Arial", 20));
       label2.setFont(Font.font("Arial", 20));

        field2 = new TextField();
        field2.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #4CAF50; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-padding: 5px; -fx-font-weight: bold; -fx-pref-height: 30px;");
        field2.setPromptText("Enter Field 2");

        Image image = new Image("assets/images/panda.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400);  
        imageView.setFitHeight(300); 
        imageView.setPreserveRatio(true); 


  
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #008CBA; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage1(); 
            }
        });

        
        Button nextButton = new Button("Next");
        nextButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px;");

        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToPage3(); 
            }
        });

      
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setField2Value(null); 
            }
        });

        
        view.add(imageView,0,0);
        view.add(label2, 1, 0); 
        view.add(field2, 2, 0); 
        view.add(backButton, 3, 0); 
        view.add(nextButton, 4, 0); 
        view.add(clearButton, 5, 0); 
        view.setStyle("-fx-background-color:#FFFED3;");
    }

   
    public GridPane getView() {
        return view;
    }

  
    public String getField2Value() {
        return field2.getText();
    }

   
    public void setField2Value(String value) {
        field2.setText(value);
    }
}
