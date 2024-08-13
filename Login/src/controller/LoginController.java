package controller;

import model.User;

import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginController {
    public TextField txtName;
    public TextField txtPassword;
    public Button btnLogin;
    public Label lblbox;
private String username="Halidha";
private  String password="1234";
    public void btnLoginOnAction(ActionEvent actionEvent) {
        //System.out.println("Click"+txtName.getText());

        String username=txtName.getText();
       String password= txtPassword.getText();

       if(this.username.equalsIgnoreCase(username) && this.password.equalsIgnoreCase(password)) {
           lblbox.setText("Login Sucessful...");
      }else{
        lblbox.setText("Login Fail");
       }
       User user=new User(username,password);
        System.out.println(user);



    }
}
