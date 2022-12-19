package collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	private String subject;
	private String teacher;

	public StudentMap(String subject, String teacher) {
		super();
		this.subject = subject;
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "StudentMap [subject=" + subject + ", teacher=" + teacher + "]";
	}
	public static void main(String[] args) {

		Map<String, StudentMap> mapsubjecttoStudentMap = new HashMap<>();

		mapsubjecttoStudentMap.put("math", new StudentMap("shubham", "sai" ));
//		mapsubjecttoStudentMap.put("science", "sai");
//		mapsubjecttoStudentMap.put("english", "sagar");
		
		System.out.println(mapsubjecttoStudentMap);
		mapsubjecttoStudentMap.get(mapsubjecttoStudentMap);
//		mapsubjecttoStudentMap.putIfAbsent("history", "amruta");
		







	}

}
