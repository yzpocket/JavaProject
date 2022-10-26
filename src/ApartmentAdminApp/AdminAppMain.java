package ApartmentAdminApp;
import java.util.Scanner;

/**
 * 입주민 정보를 등록, 수정, 조회 할 수 있는 아파트 관리 프로그램 메인 클래스
 * @author 김인용
 * @since 2022-10-19 Draft "ADMIN PAGE ONLY" /
 * @version v1.0.1
 * */
public class AdminAppMain {

	public static void main(String[] args) {
		MyApartment Desian = new MyApartment();
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("*********************************");
            System.out.println("****  입주민 관리 프로그램 v1.0  *****");
            System.out.println("*********************************");
            System.out.println("*\t1. 입주민 정보 등록 \t*");
            System.out.println("*\t2. 입주민 정보 수정 \t*");
            System.out.println("*\t3. 입주민 정보 삭제 \t*");
            System.out.println("*\t4. 등록된 입주민 목록 보기 \t*");
            System.out.println("*\t5. 차량 번호로 입주민 확인 \t*");
            System.out.println("*\t6. 입주자 자원 사용량 입력 \t*");
            System.out.println("*\t7. 세금 고지서 출력 \t*");
            System.out.println("*\t8. 프로그램 종료 \t\t*");
            System.out.println("*********************************");
            System.out.print("메뉴 번호 입력>>>");
            int select = sc.nextInt();
            switch (select) {
            case 1:
                Desian.saveMember();
                break;
            case 2:
            	Desian.modifyMember();
            	break;
            case 3:
            	Desian.deleteMember();
            	break;
            case 4:
                Desian.outputAllUser();
                break;
            case 5:
                Desian.searchCarInfo();
                break;
            case 6:
            	Desian.useInput();
            	break;
            case 7:
            	Desian.outputAllBill();
            	break;
            case 8:
                System.out.println("프로그램 종료");
                System.exit(0);
                
            default:
                System.out.println("잘못된 입력");
                break;
            }
        }
	}

}
