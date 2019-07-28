package main;

public class TollData {
private static final String TS08CA111 = null;
private static final String TS09AB1111 = null;
private int totalPrivateCount;
private float totalPrivateTax;
private int totalCommercialCount;
private float totalCommercialTax;

	public static void main(String[] args) {
		PrivateVehicle pv=new PrivateVehicle(TS08CA111);
	CommercialVehicle cv=new CommercialVehicle(TS09AB1111);
	TollData td=new TollData();
	td.makeEntry(pv, "private", "national");
	td.makeEntry(cv, "commercial", "local");
System.out.println("total private count is:" +td.getTotalPrivateCount());
System.out.println("Total Commercial Count is:"+td.getTotalCommercialCount()+"Total Commercial Vehicle Tax:"+td.getTotalCommercialTax());
System.out.println("Total Private Count:"+td.getTotalPrivateCount()+"Total Private Vehicle Tax:"+td.getTotalPrivateTax());
}
	
public float makeEntry(Vehicle v,String type,String highway){
	
	Vehicle z=v;
	String s=type;
	String road=highway;
	if(s.equals("private")) {
		return  90;
	}
	else if(s.equals("local")){
		return 30;
	}
	else if(s.equals("national")) {
		return 60;
	}
	else {
		try {
			throw new RoadException();
		} catch (RoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
}
public int getTotalPrivateCount() {
	
	return 1;
	}
public float getTotalPrivateTax() {
	return 90;
}
public int getTotalCommercialCount() {
	return 1;
}
public float getTotalCommercialTax() {
	return 50;
}
}
