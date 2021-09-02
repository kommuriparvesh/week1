package source;
import java.util.*;

public class College {

	private String clg;
	private String id;
	public College(String clg) {
		super();
		this.clg=clg;
	}
	List<Student> slist=new ArrayList<>();
	
	public void addStudent(Student st) {
		int n=slist.size()+1;
		id=""+n;
		st.setClgId(id);
		slist.add(st);
		st.onJoin(clg);
		
	}
	
	public void announceUpdate(String str) {
		for(Student obj:slist) {
			obj.getUpdate(str);
		}
	}
	
	public void showStudents() {
		for(Student obj:slist) {
			obj.displayStudent();
		}
	}
}
