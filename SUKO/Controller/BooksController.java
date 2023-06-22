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

public class BooksController implements Initializable{
   @FXML
   Label name1, name2, name3, name4, name5, name6, name7, name8, price1, price2, price3, price4, price5, price6, price7, price8 ;

   @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

  @FXML
  Button Home, Cart, anatomy, rleOne, rleTwo, rleThree, rleFour, biochem, taxonomy, pharmaBook;

  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

   @Override
    public void initialize(URL location, ResourceBundle resources) {

        
        name1.setText(LoginController.anatomy.getProductName());
        price1.setText(Double.toString(LoginController.anatomy.getProductPrice()));
        Image anatomy = new Image(LoginController.anatomy.getProductImage());
        img1.setImage(anatomy);


        name2.setText(LoginController.rleOne.getProductName());
        price2.setText(Double.toString(LoginController.rleOne.getProductPrice()));

        Image rleOne = new Image(LoginController.rleOne.getProductImage());
        img2.setImage(rleOne);


        name3.setText(LoginController.rleTwo.getProductName());
        price3.setText(Double.toString(LoginController.rleTwo.getProductPrice()));
        Image rleTwo = new Image(LoginController.rleTwo.getProductImage());
        img3.setImage(rleTwo);


        name4.setText(LoginController.rleThree.getProductName());
        price4.setText(Double.toString(LoginController.rleThree.getProductPrice()));
        Image rleThree = new Image(LoginController.rleThree.getProductImage());
        img4.setImage(rleThree);


        name5.setText(LoginController.rleFour.getProductName());
        price5.setText(Double.toString(LoginController.rleFour.getProductPrice()));
        Image rleFour = new Image(LoginController.rleFour.getProductImage());
        img5.setImage(rleFour);


        name6.setText(LoginController.biochem.getProductName());
        price6.setText(Double.toString(LoginController.biochem.getProductPrice()));
        Image biochem = new Image(LoginController.biochem.getProductImage());
        img6.setImage(biochem);


        name7.setText(LoginController.taxonomy.getProductName());
        price7.setText(Double.toString(LoginController.taxonomy.getProductPrice()));
        Image taxonomy = new Image(LoginController.taxonomy.getProductImage());
        img7.setImage(taxonomy);


        name8.setText(LoginController.pharmaBook.getProductName());
        price8.setText(Double.toString(LoginController.pharmaBook.getProductPrice()));
        Image pharmaBook = new Image(LoginController.pharmaBook.getProductImage());
        img8.setImage(pharmaBook);

    }

  public void buy(ActionEvent event) throws IOException {
    AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(anatomy)) {
            LoginController.anatomy.setProductStatus(true);
            LoginController.anatomy.setProductQuantity(1);
            
        }

        else if (sourceButton == rleOne) {
           LoginController.rleOne.setProductStatus(true);
           LoginController.rleOne.setProductQuantity(1);
            
        }

        else if (sourceButton == rleTwo) {
           LoginController.rleTwo.setProductStatus(true);
           LoginController.rleTwo.setProductQuantity(1);
            
        }

        else if (sourceButton == rleThree) {
           LoginController.rleThree.setProductStatus(true);
           LoginController.rleThree.setProductQuantity(1);
            
        }

        else if (sourceButton == rleFour) {
           LoginController.rleFour.setProductStatus(true);
           LoginController.rleFour.setProductQuantity(1);
            
        }

        else if (sourceButton == biochem) {
           LoginController.biochem.setProductStatus(true);
           LoginController.biochem.setProductQuantity(1);
            
        }

        else if (sourceButton == taxonomy) {
           LoginController.taxonomy.setProductStatus(true);
           LoginController.taxonomy.setProductQuantity(1);
            
        }

        else if (sourceButton == pharmaBook) {
           LoginController.pharmaBook.setProductStatus(true);
           LoginController.pharmaBook.setProductQuantity(1);
            
        }
  }

    BooksController booksController = null;
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

