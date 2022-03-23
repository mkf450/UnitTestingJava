package id.ifundip.suhu;

public class Suhu {
	public double jumlah(int a, int b) {
		return a+b;
	}
	
	public double selisih(int a, int b) {
		if(a>b) {
			return a-b;
		} else {
			return b-a;
		}
	}
}
