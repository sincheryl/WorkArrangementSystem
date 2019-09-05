package System;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.logging.*;

/**
 * Some codes were adapted from the YouTube JavaFX teaching video by thenewboston;
 * URL: https://bit.ly/2hG0e2q
 */


public class GuiDemo extends Application{

    Button addEmployeeButton, deleteEmployeeButton, setTimeButton;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        /*------------------------------------------------------------------------------------*/
        //set main scene

        primaryStage.setTitle("Work Arrangement System");

        addEmployeeButton = new Button();
        addEmployeeButton.setText("Add New Employee");
        deleteEmployeeButton = new Button();
        deleteEmployeeButton.setText("Delete Employee");
        setTimeButton = new Button();
        setTimeButton.setText("Set Time");

        VBox mainWindow = new VBox(20);
        mainWindow.getChildren().addAll(addEmployeeButton, deleteEmployeeButton, setTimeButton);
        mainWindow.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainWindow,500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        /*------------------------------------------------------------------------------------*/

    }
}