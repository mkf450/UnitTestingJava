package id.ifundip.Dagang;

public class Buah {
	private String jenis;
//	private int jumlah;
	private int harga;
	
	public Buah(String jenis, /*int jumlah, */int harga){
		this.jenis = jenis;
//		this.jumlah = jumlah;
		this.harga = harga;
	}
	
	public String getNamaBuah(){
		return this.jenis;
	}
	
//	public int getJumlahBuah(){
//		return this.jumlah;
//	}
	
	public int getHargaBuah(){
		return this.harga;
	}
	
	public int beliBuah(int qty) {
//		if (qty <= this.getJumlahBuah()) {
//			return (this.harga*qty);
//		}
		return (this.harga*qty);
	}
}
