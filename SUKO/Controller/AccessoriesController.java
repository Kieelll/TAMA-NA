package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;




public class AccessoriesController implements Initializable{
  @FXML
  Label name1, name2, name3, name4, name5, name6, price1, price2, price3, price4, price5, price6;
   
  @FXML
  ImageView img1, img2, img3, img4, img5, img6;

  @FXML
  Button Home, Cart, bagTag, windB, capG, laceB, laceG, laceBG;

  @FXML
  FXMLLoader loader;

  @FXML
  private Stage stage;

  @FXML
  private Parent root = null;

  @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(LoginController.bagTag.getProductName());
        price1.setText(Double.toString(LoginController.bagTag.getProductPrice()));
        Image bagTag = new Image(LoginController.bagTag.getProductImage());
        img1.setImage(bagTag);   

        name2.setText(LoginController.windbreaker.getProductName());
        price2.setText(Double.toString(LoginController.windbreaker.getProductPrice()));
        Image windbreaker = new Image(LoginController.windbreaker.getProductImage());
        img2.setImage(windbreaker);

        name3.setText(LoginController.capGold.getProductName());
        price3.setText(Double.toString(LoginController.capGold.getProductPrice()));
        Image capGold = new Image(LoginController.capGold.getProductImage());
        img3.setImage(capGold);

        name4.setText(LoginController.bluelace.getProductName());
        price4.setText(Double.toString(LoginController.bluelace.getProductPrice()));
        Image bluelace = new Image(LoginController.bluelace.getProductImage());
        img4.setImage(bluelace);

        name5.setText(LoginController.goldLace.getProductName());
        price5.setText(Double.toString(LoginController.goldLace.getProductPrice()));
        Image goldLace = new Image(LoginController.goldLace.getProductImage());
        img5.setImage(goldLace);

        name6.setText(LoginController.bgLace.getProductName());
        price6.setText(Double.toString(LoginController.bgLace.getProductPrice()));
        Image bgLace = new Image(LoginController.bgLace.getProductImage());
        img6.setImage(bgLace);
    }


  public void buy(ActionEvent event) throws IOException {   
      
        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(bagTag)) {
            LoginController.bagTag.setProductStatus(true);
            LoginController.bagTag.setProductQuantity(1);
            
            
        }

        else if (sourceButton == windB) {
           LoginController.windbreaker.setProductStatus(true);
           LoginController.windbreaker.setProductQuantity(1);
            
        }

        else if (sourceButton == capG) {
           LoginController.capGold.setProductStatus(true);
           LoginController.capGold.setProductQuantity(1);
            
        }

        else if (sourceButton == laceB) {
           LoginController.bluelace.setProductStatus(true);
           LoginController.bluelace.setProductQuantity(1);
            
        }

        else if (sourceButton == laceG) {
           LoginController.goldLace.setProductStatus(true);
           LoginController.goldLace.setProductQuantity(1);
            
        }

        else if (sourceButton == laceBG) {
           LoginController.bgLace.setProductStatus(true);
           LoginController.bgLace.setProductQuantity(1);
            
        }
  }

  
    AccessoriesController accessoriesController = null;

            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

    
            public void gotoCart(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/MyCart.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}



