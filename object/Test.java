package object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public String getFirstName(String name) {
		String[] parts = name.split(" ");
		return parts[parts.length - 1];
	}
	
	public ArrayList<SVCNTT> giaLap() {
		ArrayList<SVCNTT> results = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i ++) {
			SVCNTT x = new SVCNTT() ;
			System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + " :");
			x.setData();
			results.add(x);
		}
		Test t = new Test();
		Collections.sort(results, new Comparator<SVCNTT>() {
			@Override
		    public int compare(SVCNTT s1, SVCNTT s2) {
		        return t.getFirstName(s1.getName()).compareTo(t.getFirstName(s2.getName()));
		    }
		});

		return results; 
	}
	
	public void printList(ArrayList<SVCNTT> list) {
		list.forEach(go->{
			System.out.println(go);
		});
	}
	public static void main( String[] args) {
//		SinhVien x = new SVCNTT();
//		x.setData();
//		x.getData();
		Test o1 = new Test() ; 
		ArrayList<SVCNTT> svs = o1.giaLap();
		o1.printList(svs);
	}
}
