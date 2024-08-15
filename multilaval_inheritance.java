



class multilaval_inheritances{
	public void reserve_bank() {
		System.out.println("reseve bank");
		
	}
	public void sbi_bank() {
		System.out.println("sbi bank");
		
	}
	public void union_bank() {
		System.out.println("union bank");
		
	}
	
}

class bank extends multilaval_inheritances{
	public void karur_vysya_bank() {
		System.out.println("karur vysya bank");
		
	}
	public void tmb() {
		System.out.println("tamilnad mercantile bank");
	}
	
}
class banks extends bank{
	public void kotak_mahindra_bank() {
		System.out.println("kotak mahindra bank");
	}
	public void hdfc() {
		System.out.println("HDFC bank");
	}

}
public class multilaval_inheritance {

	public static void main(String[] args) {
		banks b1=new banks();
		
b1.reserve_bank();
b1.sbi_bank();
b1.tmb();
b1.union_bank();
	}

}
