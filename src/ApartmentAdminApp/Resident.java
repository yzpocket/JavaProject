package ApartmentAdminApp;

/** 단지 구성원의 서브 입주민 클래스*/
public class Resident extends Members {
    private int buildingNumber; //이용자의 동수
    private int unitNumber; //이용자의 호수
   
    private int useageElec; //전기 사용량(프로그램을 통해 입력)
    private double taxRateElec; //전기 단위 요금
    private int basicElecTax; //전기 기본요금
    
    private int useageGas; //가스 사용량(프로그램을 통해 입력)
    private double taxRateGas; //가스 단위 요금
    private int basicGasTax; //가스 기본요금
    
    private int monthBill; //세금 총 합



    /**private buildingNumber의 getter
     * @return buildingNumber*/
    public int getBuildingNumber() {
    	return buildingNumber;
    }
    /**private buildingNumber의 setter
     * @param buildingNumber to set*/
    public void setBuildingNumber(int buildingNumber) {
    	this.buildingNumber = buildingNumber;
    }
    /**private unitNumber의 getter
     * @return unitNumber*/
    public int getUnitNumber() {
        return unitNumber;
    }
    /**private unitNumber의 setter
     * @param unitNumber to set*/
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    


    /** 전기 사용량에 따른 단위 요금 선택 변수(사용량마다 변함)
     * @return 전기 단위 요금*/
    public double getTaxRateElec() {
        if (useageElec <= 200) {
            taxRateElec = 88.3;
            return taxRateElec;
        } else if (useageElec > 200 && useageElec <= 400) {
            taxRateElec = 182.9;
            return taxRateElec;
        } else {
            taxRateElec = 275.6;
            return taxRateElec;
        }
    }
    
    /** 전기 기본 요금 선택 변수(사용량마다 변함)
     * @return 전기 기본 요금*/
    public double getBasicElecTax() {
        if(useageElec <= 200)
        	return basicElecTax= 910; 
        else if(useageElec > 200 && useageElec <= 400)
        	return basicElecTax= 1600;
        else 
        	return basicElecTax= 7300;
    }
    
    /** 가스 단위 요금 변수(주택용도에 따라 변하지만 해당 건물은 "주거용"으로 고정 되어 있음)
     * @return 가스 단위 요금*/
    public double getTaxRateGas() { // 
        taxRateGas = 21.3923;
        return taxRateGas;
    }
    
    /** 가스 기본 요금 변수(주택용도에 따라 변하지만 해당 건물은 "주거용"으로 고정 되어 있음)
     * @return 가스 기본 요금*/
    public double getBasicGasTax() {
    	basicGasTax = 900;
    	return basicGasTax;
    }
    
    /** 세금 총 합계 연산 변수
     * @return 합계 금액*/
    public int getMonthBill() {
    	monthBill =
    			(int)((useageElec)*(taxRateElec)+(basicElecTax)) //전기세 입력받은 사용량*단가+기본료
    			+
    			(int)((useageGas)*(taxRateGas)+(basicGasTax)); //가스세 입력받은 사용량*단가+기본료
    	return monthBill;
    }

    /**private useageElec의 getter
     * @return useageElec*/
    public int getUseageElec() {
		return useageElec;
	}
    /**private useageElec의 setter
     * @param useageElec to set*/
	public void setUseageElec(int useageElec) {
		this.useageElec = useageElec;
	}
    /**private useageGas의 getter
     * @return useageGas*/
    public int getUseageGas() {
		return useageGas;
	}
    /**private useageGas의 setter
     * @param useageGas to set*/
	public void setUseageGas(int useageGas) {
		this.useageGas = useageGas;
	}

}
