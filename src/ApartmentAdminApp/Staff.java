package ApartmentAdminApp;

/** 단지 구성원의 서브 관리 직원 클래스*/
public class Staff extends Members {
    private int staffNumber; //직원 번호
    

	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int number) {
		staffNumber = number;
	}

}
