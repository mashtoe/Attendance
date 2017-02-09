/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Bruger
 */
public class MainViewController implements Initializable
{

    @FXML
    private TitledPane titledPaneCenter;
    @FXML
    private HBox hBox;
    @FXML
    private VBox vBoxTimestamp;
    @FXML
    private VBox vBoxMonday;
    @FXML
    private VBox vBoxTuesday;
    @FXML
    private VBox vBoxWednesday;
    @FXML
    private VBox vBoxThursday;
    @FXML
    private VBox vBoxFriday;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            vBoxMonday.getChildren().add(getClassModul());
            vBoxMonday.getChildren().add(getClassModul());
            vBoxMonday.getChildren().add(getClassModul());
        } catch (IOException ex)
        {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    

    private Node getClassModul() throws IOException
    {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendance/automation/gui/view/Class.fxml"));
        Node node = loader.load();
       // ClassController controller = loader.getController();
        return node;
        
        
    }
    
}
