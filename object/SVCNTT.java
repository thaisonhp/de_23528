package object;

import java.util.Scanner;

public class SVCNTT extends SinhVien{
	
	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if(this.getDiemLT() >= 5 && this.getDiemTH() >= 5) {
			return true;
		}else return false;
	}
	@Override
	public void setData() {
		Scanner sn = new Scanner(System.in);
		String maSV = sn.nextLine();
		this.setMaSV(maSV); 
		String name = sn.nextLine();
		this.setName(name);
		double diemLT = sn.nextDouble();
		this.setDiemLT(diemLT);; 
		double diemTH = sn.nextDouble();
		this.setDiemTH(diemTH);;
	}
	@Override
	public void getData() {
		System.out.println(this.getMaSV());
		System.out.println(this.getName());
		System.out.println(this.getDiemLT());
		System.out.println(this.getDiemTH());
		if(this.datChuan()) {
			System.out.println("Dat");
		}else {
			System.out.println("Khong Dat");
		}
		
	}
	@Override
	public String toString() {
		return "SVCNTT [ "+super.toString()+"datChuan()=" + datChuan() + "]";
	}
	

}
