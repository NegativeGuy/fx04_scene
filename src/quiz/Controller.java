package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import loginService.LoginService;
import loginService.LoginServiceImpl;

public class Controller implements Initializable{
	Parent root;
	LoginService ls;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void LoginProc() {
		ls.LoginProc(root);
	}
	public void CancelProc() {
		ls.CancelProc(root);
	}
	public void OpenMembershipForm() {
		ls.OpenMembershipForm();
	}
}
