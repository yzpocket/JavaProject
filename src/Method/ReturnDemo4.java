package Method;

public class ReturnDemo4 {
	 
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
        
    }
 
    public static void main(String[] args) {
		String[] members= getMembers();
		for(int i=0;i<members.length;i++) 
			System.out.println(members[i]);
		
		//1. 실행 했을 때의 members[]의 메모리 위치 주소값입니다.
        //2. 메인에서는 String[] members= getMembers(); 구문을 통해 getMembers()를 실행하라(배열을 만들고 안에 3명을 넣어라)라는
        //**동사 형태**의 명령이 호출되고 그 **동작이 members**에 담긴 상태입니다.
        //이말은 작성자가 원하시는 **배열의 값을 하나씩 뽑아라, 연결해라 등등 **라는 식 동사형태의 명령이 아직 없기 때문입니다.
        //하지만 System.out.println(members[0])에서 최진혁이 출력되는 것을 확인하셨습니다. [1]로 바꿔도, [2]로바꿔도 각 값이 나올 것이구요.
		//하지만 [0,1,2]처럼 여러개는 입력 할 수 없습니다. [ ]에 들어가는
		//이에 따라 System.out.println(members[i]); 로 i를 변수로 지정하고 i가 0~2라면 배열에 저장된 값이 나올 것임을 추측 할 수 있습니다.
		//이후부터는 for루프, while등 반복문을 통해서 i를 변경하면서 이름들을 출력 할 수 있을 것입니다.

    }
}