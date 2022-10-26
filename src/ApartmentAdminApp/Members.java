package ApartmentAdminApp;

/** 아파트 단지 구성원 슈퍼 클래스*/
public class Members {
 	private String name; //구성원 이름
    private String phoneNum; //구성원 연락처
	private String carNum; //구성원 차량 번호

	
	
	/**private name의 getter
	* @return name*/
	public String getName() {
	    return name;
	}
	/**private name의 setter
	 * @param name to set*/
	public void setName(String name) {
	     this.name = name;
	}
	/**private phoneNum의 getter
	 * @return phoneNum*/
	public String getPhoneNum() {
	    return phoneNum;
	}
	/**private phoneNum의 setter
	 * @param phoneNum to set*/
	public void setPhoneNum(String phoneNum) {
	    this.phoneNum = phoneNum;
	}
	/**private carNum의 getter
	 * @return carNum*/
	public String getCarNum() {
	    return carNum;
	}
	/**private carNum의 setter
	 * @param carNum to set*/
	public void setCarNum(String carNum) {
	    this.carNum = carNum;
	}    
	
//    public String getName();
//    public String getPhoneNum();
//    public String getCarNum();
//    
//    public void setName(String name);
//    public void setPhoneNum(String phoneNum);
//    public void setCarNum(String carNum);

    
}
