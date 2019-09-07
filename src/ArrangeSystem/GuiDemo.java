package ArrangeSystem;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Some codes were adapted from the YouTube JavaFX teaching video by thenewboston;
 * URL: https://bit.ly/2hG0e2q
 */


public class GuiDemo extends Application{

    private Scene addEmployeeScene, deleteEmployeeScene, setTimeScene;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        /*------------------------------------------------------------------------------------*/
        //set main scene

        primaryStage.setTitle("Work Arrangement ArrangeSystem");

        Button addEmployeeButton = new Button();
        addEmployeeButton.setText("Add New Employee");
        addEmployeeButton.setOnAction(e -> primaryStage.setScene(addEmployeeScene));
        Button deleteEmployeeButton = new Button();
        deleteEmployeeButton.setText("Delete Employee");
        deleteEmployeeButton.setOnAction(e -> primaryStage.setScene(deleteEmployeeScene));
        Button setTimeButton = new Button();
        setTimeButton.setText("Set Time");
        setTimeButton.setOnAction(e -> primaryStage.setScene(setTimeScene));

        VBox mainWindow = new VBox(20);
        mainWindow.getChildren().addAll(addEmployeeButton, deleteEmployeeButton, setTimeButton);
        mainWindow.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainWindow,500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        /*------------------------------------------------------------------------------------*/


        /*------------------------------------------------------------------------------------*/
        //set add employee scene

        VBox addEmployeeWindow = new VBox();
        addEmployeeScene = new Scene(addEmployeeWindow, 300, 300);
        Button addEmployeeSceneBackButton = new Button();
        addEmployeeSceneBackButton.setText("Back");
        addEmployeeSceneBackButton.setOnAction(e -> primaryStage.setScene(scene));
        addEmployeeWindow.setAlignment(Pos.CENTER);
        addEmployeeWindow.getChildren().addAll(addEmployeeSceneBackButton);

        /*------------------------------------------------------------------------------------*/


        /*------------------------------------------------------------------------------------*/
        //set add employee scene

        VBox deleteEmployeeWindow = new VBox();
        deleteEmployeeScene = new Scene(deleteEmployeeWindow, 300, 300);
        Button deleteEmployeeSceneBackButton = new Button();
        deleteEmployeeSceneBackButton.setText("Back");
        deleteEmployeeSceneBackButton.setOnAction(e -> primaryStage.setScene(scene));
        deleteEmployeeWindow.setAlignment(Pos.CENTER);
        deleteEmployeeWindow.getChildren().addAll(deleteEmployeeSceneBackButton);

        /*------------------------------------------------------------------------------------*/


        /*------------------------------------------------------------------------------------*/
        //set add employee scene

        VBox setTimeWindow = new VBox();
        setTimeScene = new Scene(setTimeWindow, 300, 300);
        Button setTimeSceneBackButton = new Button();
        setTimeSceneBackButton.setText("Back");
        setTimeSceneBackButton.setOnAction(e -> primaryStage.setScene(scene));
        setTimeWindow.setAlignment(Pos.CENTER);
        setTimeWindow.getChildren().addAll(setTimeSceneBackButton);

        /*------------------------------------------------------------------------------------*/
    }
}