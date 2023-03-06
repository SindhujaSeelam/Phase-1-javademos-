package javafsd;

public class enumdemo {
 public static void main(String[] args) {
	PaymentType pt =  PaymentType.DEBITCARD;
	System.out.println(pt);
    PaymentType[] values = PaymentType.values();
    for(PaymentType ptt:values) {
    	System.out.println(ptt);
    	System.out.println(ptt.ordinal());
    	System.out.println(ptt.getFee());

    }
 }
}

enum PaymentType{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(1);
	int fee;
	PaymentType(int fee) {
		this.fee=fee;
	}
	public int getFee() {
		return this.fee;
	}
}
