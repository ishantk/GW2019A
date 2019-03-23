class Order{
	
	// Attributes : Property of Object
	int price;
	private String promoCode;
	
	void setPromoCode(String promoCode){
		
		if(promoCode.contains("50")){
			this.promoCode = promoCode;
		}else if(promoCode.equals("Zomato40")){
			this.promoCode = promoCode;
		}else{
			this.promoCode = "NA";
		}
		
	}
	
	String getPromoCode(){
		return promoCode;
	}
	
}


public class WhyPrivateApp {

	public static void main(String[] args) {
		
		Order oRef1 = new Order();
		oRef1.price = 3000;
		//oRef1.promoCode = "ZOMATO50"; error
		
		oRef1.setPromoCode("ZOMATO100");
		System.out.println("Which PromoCode has Been Applied? "+oRef1.getPromoCode());

	}

}

// Program : Traffic Light Implementation | R/O/G
			// TrafficLight -> Object
