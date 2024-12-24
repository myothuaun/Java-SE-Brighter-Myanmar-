package myy.com.Enum;

public enum Car {
	swift(200,2016),
	landcruiser(1200,2013),
	toyota(600,2015),
	marcedee(800,2017);
	public final int price;
	public final int year;
	
	Car(int cost,int made){
		price = cost;
		year = made;
	}
	public int getPrice() {
		return price;
	}
	public int getYear() {
		return year;
	}
}
