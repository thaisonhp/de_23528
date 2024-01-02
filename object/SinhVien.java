package object;

import java.util.Scanner;

public abstract class SinhVien {
	private String maSV ; 
	private String name ; 
	private double diemLT ; 
	private double diemTH ;
	
	
	public SinhVien() {
		
	}

	public SinhVien(String maSV, String name, double diemLT, double diemTH) {
		this.maSV = maSV;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public String getMaSV() {
		return maSV;
	}

	public String getName() {
		return name;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}

	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "maSV=" + maSV + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + ",";
	} 
	
	public void setData() {
		Scanner sn = new Scanner(System.in);
		String maSV = sn.nextLine();
		this.maSV = maSV ; 
		String name = sn.nextLine();
		this.name = name ; 
		double diemLT = sn.nextDouble();
		this.diemLT = diemLT ; 
		double diemTH = sn.nextDouble();
		this.diemTH = diemTH ;
	}
	
	public void getData() {
		System.out.println(this.maSV);
		System.out.println(this.name);
		System.out.println(this.diemLT);
		System.out.println(this.diemTH);
		
	}
	
	public abstract boolean datChuan();
	
}
