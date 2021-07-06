package j2eeTypePatterns.DataAccessObjectPattern;
/*
 * 数据访问对象模式
*/
public class MainApp {
	
	public static void main(String[]args) {
		StudentDao studentDao = new StudentDaoImpl();
		for(Student student:studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
		}
		Student student1 =studentDao.getStudent(0);
		student1.setName("Michael");
		studentDao.updateStudent(student1);
		for(Student student:studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
		}
		studentDao.deleteStudent(student1);
		for(Student student:studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
		}
	}
}
