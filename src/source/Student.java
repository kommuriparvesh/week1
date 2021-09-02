package source;

public class Student {
	
	private String id;
	private String name;
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void setClgId(String id) {
		this.id=id;
	}

	public void getUpdate(String str) {
		System.out.println("Hi "+name+" here is an update. Message is:  "+str+".");
		
	}
	
	public void onJoin(String clg) {
		System.out.println("Hi"+name+"Welcome to "+clg);
	}
	
	public void displayStudent() {
		System.out.println("\nCollge ID\t:"+id);
		System.out.println("NAME\t\t:"+name+"\n");		
	}
	
}
