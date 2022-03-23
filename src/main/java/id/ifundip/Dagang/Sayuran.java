package id.ifundip.Dagang;

public class Sayuran {
	private String nama;
//	private int jumlah;
	private int harga;
	
	public Sayuran(String nama, /*int jumlah,*/ int harga){
		this.nama = nama;
//		this.jumlah = jumlah;
		this.harga =  harga;
	}
	
	public String getNamaSayuran(){
		return this.nama;
	}
	
//	public int getJumlahSayuran(){
//		return this.jumlah;
//	}
	
	public int getHargaSayuran(){
		return this.harga;
	}
	
	public int beliSayur(int qty) {
//		if (qty <= this.getJumlahSayuran()) {
//			return (this.harga*qty);
//		}
		return (this.harga*qty);
	}
}
