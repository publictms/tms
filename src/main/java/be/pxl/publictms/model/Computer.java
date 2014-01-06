package be.pxl.publictms.model;

public class Computer {
	private int id;
	private String merk;
	
	public Computer(){
		
	}
	
	public Computer(int id, String merk){
		this.id = id;
		this.merk = merk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	

}
