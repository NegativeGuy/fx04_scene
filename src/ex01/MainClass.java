package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		//eventTest.fxml 파일을 로드함
		
		Parent root = loader.load(); // 로드 실행
		// 두번에 나눠서 객체를 만들면 컨트롤러 객체를 얻어올 수 있다
		// 다시 말해 컨트롤러에 있는 기능을 쓸 수 있다

		Scene scene = new Scene(root);
		
		// 기능을 이용
		Controller ctl = loader.getController();
		ctl.setRoot(root);	// setRoot()매서드 만들어주고 호출
		
		
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
