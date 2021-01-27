/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitybasics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Liam
 */
public class GravityBasics extends Application {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Application.launch(args);
        
        /*test.solveForY();
        System.out.println(test.getFHeight());
        test.setTime(test.getTime() + 0.01);
        while(test.getFHeight() >= 0){
            test.solveForY();
            System.out.println(test.getFHeight());
            test.setTime(test.getTime() + 0.01); */
        
    }
        
        

    @Override
    public void start(Stage stage) throws Exception {
    
        Parent root = FXMLLoader.load(getClass().getResource("GravityTestGUI.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
