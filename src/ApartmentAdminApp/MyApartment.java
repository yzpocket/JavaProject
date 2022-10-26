package ApartmentAdminApp;
import java.util.ArrayList;
import java.util.Scanner;


/**주요 메소드들의 기능 정의 실체화 클래스*/
public class MyApartment implements AppFeatures {
		ArrayList<Resident> arr1 = new ArrayList<>();
		ArrayList<Staff> arr2 = new ArrayList<>();
	    Scanner input = new Scanner(System.in);
	    
	/**입주민 정보를 입력 받아 배열에 저장하는 메서드*/
    @Override
    public void saveMember() {
    	String name;
        int buildingNumber;
        int unitNumber;
        String phoneNum;
        String carNum;
        Resident rs = new Resident();
        System.out.print("세대주 이름 : ");
        name = input.next();
        System.out.print("동수 : ");
        buildingNumber = input.nextInt();
        System.out.print("호수 : ");
        unitNumber = input.nextInt();
        System.out.println("세대 연락처 : ");
        System.out.println("연락처 없는 경우 'x'를 입력하세요");
        String p=input.next();
        if(p.equals("x")) {
        	phoneNum= "연락처 미등록";
        }
        else {phoneNum = p;}
        System.out.println("등록 차량 번호 : ");
        System.out.println("차량 번호가 없는 경우 'x'를 입력하세요");
        String c=input.next();
        if(c.equals("x")) {
        	carNum= "차량미등록 ";
        }
        else {carNum = c;}
        rs.setName(name);
        rs.setBuildingNumber(buildingNumber);
        rs.setUnitNumber(unitNumber);
        rs.setPhoneNum(phoneNum);
        rs.setCarNum(carNum);
        arr1.add(rs);
        System.out.println("등록 완료!!");
    }
    
    /**입주민 이름으로 검색하여 배열에 저장된 입주민 정보를 수정하는 메서드*/
    @Override
    public void modifyMember() {//수정
        System.out.println("수정할 입주민의 이름을 입력 하세요 : ");
        String yourName = input.next();
        String modiphoneNum;
        String modicarNum;
        boolean flag = true;
        for (int i = 0 ; i < arr1.size(); i++) {
            if (arr1.get(i).getName().equals(yourName)) {
                flag = false;
                System.out.println("동수 변경 입력 : ");
                int modibuildingNumber = input.nextInt();
                arr1.get(i).setBuildingNumber(modibuildingNumber);
                System.out.println("호수 변경 입력 : ");
                int modiunitNumber = input.nextInt();
                arr1.get(i).setUnitNumber(modiunitNumber);
                System.out.println("연락처 변경 입력 : ");
                System.out.println("연락처 없는 경우 'x'를 입력하세요");
                String modip=input.next();
                if(modip.equals("x")) {
                	modiphoneNum= "연락처 미등록";
                }
                else {modiphoneNum = modip;}
                arr1.get(i).setPhoneNum(modiphoneNum);
                System.out.println("차량 번호 변경 입력 : ");
                System.out.println("차량 번호가 없는 경우 'x'를 입력하세요");
                String modic=input.next();
                if(modic.equals("x")) {
                	modicarNum= "차량미등록 ";
                }
                else {modicarNum = modic;}
                arr1.get(i).setCarNum(modicarNum);
                System.out.println("수정이 정상적으로 완료되었습니다.");
                break;
            }
        }
        if (flag) {
            System.out.println("해당 이름의 입주자는 없습니다.");
        }
    }
    
    /**입주민 이름으로 검색하여 배열에 저장된 입주민 정보를 삭제하는 메서드*/
    @Override
    public void deleteMember() {//수정
        System.out.println("삭제할 입주민의 이름을 입력 하세요 : ");
        String yourName = input.next();
        boolean flag = true;
        for (int i = 0 ; i < arr1.size(); i++) {
            if (arr1.get(i).getName().equals(yourName)) {
                flag = false;
                System.out.println(arr1.get(i).getName()+"님의 정보는 모두 삭제되었습니다.");
                arr1.remove(i);
                break;
            }
        }
        if (flag) {
            System.out.println("해당 이름의 입주자는 없습니다.");
        }
    }
    
    
    /**배열에 저장된 모든 입주민 기본 정보를 확인하는 메서드*/
    @Override
    public void outputAllUser() {
        System.out.println("* * * * * * * *  입주민 기본 정보 조회   * * * * * * *");
        System.out.println("---------------------------------------------------------");
        System.out.println("|이름\t|동\t|호수\t|비상연락처\t|차량번호\t\t|");
        System.out.println("---------------------------------------------------------");
        for(int i = 0 ; i < arr1.size(); i++) {
            System.out.println("|"+arr1.get(i).getName()+"\t|"+arr1.get(i).getBuildingNumber()+"\t|"+arr1.get(i).getUnitNumber()
                    +"\t|"+arr1.get(i).getPhoneNum()+"\t|"+arr1.get(i).getCarNum()+"\t|");
        }
        System.out.println("---------------------------------------------------------");
    }
    
    /**차량 번호로 검색하여 배열에 저장된 입주민 정보를 확인하는 메서드*/
	@Override
	public void searchCarInfo() {
        System.out.println("검색할 차량 번호를 입력 하세요 : ");
        String yourCNum = input.next();
        boolean flag = true;
        for (int i = 0 ; i < arr1.size(); i++) {
            if (arr1.get(i).getCarNum().equals(yourCNum)) {
                flag = false;
                System.out.println("-------------------------------------------------");
            	System.out.println("|차량번호   |이름\t|동\t|호수\t|긴급 연락처\t|");
                System.out.println("-------------------------------------------------");
                System.out.println("|"+arr1.get(i).getCarNum()+" |"+arr1.get(i).getName()+"\t|"+arr1.get(i).getBuildingNumber()+"\t|"+arr1.get(i).getUnitNumber()+"\t|"+arr1.get(i).getPhoneNum()+"\t|");
                System.out.println("-------------------------------------------------");
                break;
            }
        }
        if (flag) {
            System.out.println("** < "+yourCNum+" >해당 차량은 등록된 차량이 아닙니다.**");
            System.out.println("미등록 차량 또는 외부인 차량 경고문을 부착해 주세요.");
        }
	}
    
    /**동/호수로 검색하여 배열에 저장된 입주민 정보에 자원 사용량을 추가 입력하는 메서드*/
    @Override
    public void useInput() {//전기, 가스 사용량 입력
    	System.out.println("자원 사용량을 입력할 동/호수를 입력 하세요 : ");
    	System.out.println("동 : ");
    	int yourBuildingNum = input.nextInt();
    	System.out.println("호 : ");
        int yourUnitNum = input.nextInt();
        boolean flag = true;
        for (int j = 0 ; j < arr1.size(); j++) {
        	if (arr1.get(j).getBuildingNumber()==yourBuildingNum) {
		        for (int i = 0 ; i < arr1.size(); i++) {
		            if (arr1.get(i).getUnitNumber()==yourUnitNum) {
		                flag = false;
		                System.out.println("전기 사용량 kWh 입력 : ");
		                int UseageElec = input.nextInt();
		                arr1.get(i).setUseageElec(UseageElec);
		                System.out.println("가스 사용량 MJ 입력 : ");
		                int UseageGas = input.nextInt();
		                arr1.get(i).setUseageGas(UseageGas);
		                System.out.println(yourBuildingNum+"동"+yourUnitNum+"호의 전기 사용량"+UseageElec+"kWh 입력이 정상적으로 완료되었습니다.");
		                System.out.println(yourBuildingNum+"동"+yourUnitNum+"호의 가스 사용량"+UseageGas+"MJ 입력이 정상적으로 완료되었습니다.");
		                break;
		            }
	            }
        	}
        }
        if (flag) {
            System.out.println("해당 입주자가 없습니다.");
        }
    }
    
    /**기본정보와 자원 사용량이 입력된 세대의 세금 고지서를 출력하는 메서드*/
	@Override
	public void outputAllBill() {
		System.out.println("* * * * 세금 고지서 출력 * * * *");
        for(int i = 0 ; i < arr1.size(); i++) {
            System.out.println("-------------------------------------------------");
        	System.out.println("|이름\t|동\t|호수\t|세대연락처\t\t|");
            System.out.println("-------------------------------------------------");
            System.out.println("|"+arr1.get(i).getName()+"\t|"+arr1.get(i).getBuildingNumber()+"\t|"+arr1.get(i).getUnitNumber()+"\t|"+arr1.get(i).getPhoneNum()+"\t\t|");
            System.out.println("-------------------------------------------------");
            System.out.println("| 전기 사용료 산출 근거 :\t\t\t\t|");
            System.out.println("| (사용량"+arr1.get(i).getUseageElec()+"kWh*(단가"+arr1.get(i).getTaxRateElec()+"원/kWh)+기본료("+arr1.get(i).getBasicElecTax()+")원\t|");
            System.out.println("| 가스 사용료 산출 근거 :\t\t\t\t|");
            System.out.println("| (사용량"+arr1.get(i).getUseageGas()+"MJ*(단가"+arr1.get(i).getTaxRateGas()+"원/MJ)+기본료("+arr1.get(i).getBasicGasTax()+")원\t|");
            System.out.println("-------------------------------------------------");
            System.out.println("| 합계\t\t\t\t\t\t|");
            System.out.println("|\t"+arr1.get(i).getMonthBill()+"원\t\t\t\t\t|");
            System.out.println("-------------------------------------------------");
        }
	}
}
