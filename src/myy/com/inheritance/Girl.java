package myy.com.inheritance;

public class Girl extends Boy {
	public void getParent() { //override 
		this.name = "Nobel";
		System.out.println("I override p bya, it");
	}
	public void sayMyName() {
		System.out.println("sayarmagyi");
	}
}


