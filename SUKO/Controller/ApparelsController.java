package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
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

public class ApparelsController implements Initializable{
   @FXML
   Label name1, name2, name3, name4, name5, name6, name7, price1, price2, price3, price4, price5, price6, price7 ;
   
   @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7;

  @FXML
  Button Home, Cart, hoodie, nusgPM, nusgPF, nuTee, nuTeeB, nuTeeDB, nuTeeBl;

  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

   @FXML
  static MyCartController myCartController = null;

  @FXML
  private Parent root = null;

  @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(LoginController.hoodie.getProductName());
        price1.setText(Double.toString(LoginController.hoodie.getProductPrice()));
        Image hoodie = new Image(LoginController.hoodie.getProductImage());
        img1.setImage(hoodie);   

        name2.setText(LoginController.nusgPoloMale.getProductName());
        price2.setText(Double.toString(LoginController.nusgPoloMale.getProductPrice()));
        Image nusgPoloMale = new Image(LoginController.nusgPoloMale.getProductImage());
        img2.setImage(nusgPoloMale);

        name3.setText(LoginController.nusgPoloFemale.getProductName());
        price3.setText(Double.toString(LoginController.nusgPoloFemale.getProductPrice()));
        Image nusgPoloFemale = new Image(LoginController.nusgPoloFemale.getProductImage());
        img3.setImage(nusgPoloFemale);

        name4.setText(LoginController.bulldogsTeeN.getProductName());
        price4.setText(Double.toString(LoginController.bulldogsTeeN.getProductPrice()));
        Image bulldogsTeeN = new Image(LoginController.bulldogsTeeN.getProductImage());
        img4.setImage(bulldogsTeeN);

        name5.setText(LoginController.bulldogsTeeBlue.getProductName());
        price5.setText(Double.toString(LoginController.bulldogsTeeBlue.getProductPrice()));
        Image bulldogsTeeBlue = new Image(LoginController.bulldogsTeeBlue.getProductImage());
        img5.setImage(bulldogsTeeBlue);

        name6.setText(LoginController.bulldogsTeeDB.getProductName());
        price6.setText(Double.toString(LoginController.bulldogsTeeDB.getProductPrice()));
        Image bulldogsTeeDB = new Image(LoginController.bulldogsTeeDB.getProductImage());
        img6.setImage(bulldogsTeeDB);

        
        name7.setText(LoginController.bulldogsTeeBlack.getProductName());
        price7.setText(Double.toString(LoginController.bulldogsTeeBlack.getProductPrice()));
        Image bulldogsTeeBlack = new Image(LoginController.bulldogsTeeBlack.getProductImage());
        img7.setImage(bulldogsTeeBlack);
    }

    
  public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(hoodie)) {
            LoginController.hoodie.setProductStatus(true);
            LoginController.hoodie.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane19);
            
        }

        else if (sourceButton == nusgPM) {
           LoginController.nusgPoloMale.setProductStatus(true);
           LoginController.nusgPoloMale.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane20);
            
        }

        else if (sourceButton == nusgPF) {
           LoginController.nusgPoloFemale.setProductStatus(true);
           LoginController.nusgPoloFemale.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane21);
            
        }

        else if (sourceButton == nuTee) {
           LoginController.bulldogsTeeN.setProductStatus(true);
           LoginController.bulldogsTeeN.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane22);
            
        }

        else if (sourceButton == nuTeeB) {
           LoginController.bulldogsTeeBlue.setProductStatus(true);
           LoginController.bulldogsTeeBlue.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane23);
            
        }

        else if (sourceButton == nuTeeDB) {
           LoginController.bulldogsTeeDB.setProductStatus(true);
           LoginController.bulldogsTeeDB.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane24);
            
        }

        else if (sourceButton == nuTeeBl) {
           LoginController.bulldogsTeeBlack.setProductStatus(true);
           LoginController.bulldogsTeeBlack.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane25);
            
        }

        LoginController.cart.showItems();
  }

  
    ApparelsController aparelsController = null;
            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

    public void gotoCart(ActionEvent event) throws IOException {
      
            LoginController.myCartController.showItems(LoginController.cart.getItemList());
            LoginController.myCartController.getInitialAmount();

            loader = new FXMLLoader(getClass().getResource("/view/MyCart.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}





