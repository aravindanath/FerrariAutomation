package day9;


public class DemEncap {
	
	
	public static void main(String[] args) {
		
		Transaction txn = new Transaction();
		txn.setAddress("Marathalli");
		System.out.println(txn.getAddress());
		txn.setAddress("BTM");
		System.out.println(txn.getAddress());
		txn.setCardNumber(134134234522345l);
		txn.setCvv(444);
		txn.setName("Arvind");
		
		System.out.println(txn.getCardNumber());
		System.out.println(txn.getCvv());
		System.out.println(txn.getName());
		
	}

}
