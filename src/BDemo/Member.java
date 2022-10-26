package BDemo;
/**회원정보(이름,비밀번호,연락처)를 담는 도메인 객체*/
public class Member {
	private String name;
	private String pwd;
	private String tel;
	
	public Member() {
		this("아무개","","");
	}
	public Member(String n, String pwd, String tel) {
		this.name=n;
		this.pwd=pwd;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**회원정보를 문자열로 반환하는 메서드*/
	public String showInfo() {
		return name+"\t"+tel+"\t"+pwd;
	}
}
