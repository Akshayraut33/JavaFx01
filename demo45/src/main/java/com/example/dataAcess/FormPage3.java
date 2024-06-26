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

public class FormPage3 {

    private FormNavigationApp app;
    private GridPane view;
    private TextField field3;

   
    public FormPage3(FormNavigationApp app) {
        this.app = app;
        initialize();
    }


    private void initialize() {
       
        view = new GridPane();
        view.setPadding(new Insets(10)); 
        view.setHgap(10); 
        view.setVgap(10);
        view.setAlignment(Pos.CENTER); 

       
        Label label3 = new Label("Phone no:");
        
         label3.setStyle("-fx-font-weight: bold");
         label3.setFont(Font.font("Arial", 20));
       

       
        field3 = new TextField();
        field3.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #4CAF50; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-padding: 5px; -fx-font-weight: bold; -fx-pref-height: 30px;");
        field3.setPromptText("Enter Field 3");

      
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #008CBA; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 10px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
        backButton.setOnAction(new EventHandler<ActionEvent>() {
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
                setField3Value(null); 
            }
        });

        Image image = new Image("assets/images/panda.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400); 
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true); 

        

       
        view.add(imageView,0,0);
        view.add(label3, 1, 0); 
        view.add(field3, 2, 0);  
        view.add(backButton, 3, 0); 
        view.add(clearButton, 4, 0); 
        view.setStyle("-fx-background-color:#FFFED3;");
       
    }

  
    public GridPane getView() {
        return view;
    }

   
    public String getField3Value() {
        return field3.getText();
    }

   
    public void setField3Value(String value) {
        field3.setText(value);
    }
}

