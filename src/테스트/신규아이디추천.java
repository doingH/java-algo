package 테스트;

public class 신규아이디추천 {
	public static void main(String[] args) {
		/*
		아이디의 길이는 3자 이상 15자 이하여야 합니다.
		아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
		단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
		*/
		String new_id = "z-+.^.";
		
		//초기단계
		System.out.println(new_id);
		//1단계
		new_id = new_id.toLowerCase();
		System.out.println(new_id);
		
		//2단계
		new_id = new_id.replaceAll("[^ a-z0-9-_.]", "");
		System.out.println(new_id);
		
		//3단계
		new_id = new_id.replaceAll("[.]{2,}", ".");
		System.out.println(new_id);
		
		//4단계
		//^x : 문자열이 x로 시작
		//x$ : 문자열이 x로 끝남
		new_id = new_id.replaceAll("^[.]|[.]$","");    //4단계

		System.out.println(new_id);
		
		//5단계
		if("".equals(new_id)) {
			new_id += "a";
		}
		System.out.println(new_id);
		
		//6단계
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		System.out.println(new_id);
		
		//7단계
		if(new_id.length() <= 2) {
			while(true) {
				new_id += new_id.substring(new_id.length()-1, new_id.length());
				if(new_id.length() == 3) {
					break;
				}
			}
		}
		System.out.println(new_id);
		
	}
}
