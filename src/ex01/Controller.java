package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML TextField fxId;	// 1. 어노테이션 사용해서 변수 만듬
				// 어노테이션은 .fxml에서 연결한 그 클래스 외에는 사용 불가 
	
	public Parent root;		// 2. 일반 변수로 만듬
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	public void LoginProc() {
		System.out.println("로그인 버튼 클릭");
		TextField t = (TextField)root.lookup("#fxId");
		System.out.println(t.getText());
		System.out.println("어노테이션(@) 사용 버전 : "+fxId.getText());
	}
}
