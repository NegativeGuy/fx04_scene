package loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{

	@Override
	public void LoginProc(Parent root) {
		TextField id = (TextField)root.lookup("#fxId");
		// 넘어온 root를 lookup(들여다보면) 거기에 "fxId"가 있는데 그걸 id라는 변수에 대입

		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		// 넘어온 root를 lookup(들여다보면) 거기에 "fxPwd"가 있는데 그걸 Pwd라는 변수에 대입
		
		System.out.println("ID : "+id.getText());
		System.out.println("PW : "+pwd.getText());
	}

	@Override
	public void CancelProc(Parent root) {
		TextField id = (TextField)root.lookup("#fxId");
		PasswordField pwd = (PasswordField)root.lookup("#fxPwd");
		id.clear();
		pwd.clear();
	}

	@Override
	public void OpenMembershipForm() {
		System.out.println("회원가입을 선택 하셨습니다");
	}

}
