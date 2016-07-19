package TemplateMethodPattern.dp;

public abstract class GameConnectHelper {

	//보안단계
	protected abstract String doSecurity(String string);
	
	//인증단계
	protected abstract boolean authentication(String id, String password);
	
	//권한단
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String info);
	
	//템플릿 메소
	public String requestConnection(String encodedInfo){
		// 보안 작업 -> 암호화 된 문자열을 복호화 한다.
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String pw = "bbb";
		
		//반환된 것을 가지고 아이디, 암호를 할당한다.
		if(!authentication(id, pw)){
			throw new Error("아이디 암호 불일치");
		}
		String userName = "userName";
		
		int i = authorization(userName);
		
		switch (i) {
			case -1:
				throw new Error("셧다운");
			case 0: //게임 매니저
				break;
			case 1: //유료회원
				break;	
			case 2: //무료회원
				break;	
			case 3: //권한없
				break;		
			default://기타상황
				break;
		}
		
		return connection(decodedInfo);
	}
	
}
