package cn.syhg.course;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟学生1选课操作
		Student stu1=new Student(1,"Karry","男",21,"汉族");
		Teacher tea1=new Teacher(1,"Wang","女",31,"汉族");
		Course cour1=new Course(1,"高数","Jackson","1教102","08:00-09:30",2.0);
		stu1.setCourse(cour1);
		stu1.setTeacher(tea1);
		//判断学生所选课程是否为空，若为空，说明该学生已经退课或还没有选课
		if(stu1.getCourse().getCoursenumber()==0){
			System.out.println("学生:\t编号:"+stu1.getNumber()+"\t姓名："+stu1.getName()+"\n该学生已经退课或还没有选课");
		}else{
			System.out.println(stu1);
		}
		//模拟学生2选课操作
		Student stu2=new Student(2,"鹿晗","男",21,"汉族");
		Teacher tea2=new Teacher(2,"Wang","女",30,"汉族");
		Course cour2=new Course();
		stu2.setCourse(cour2);
		stu2.setTeacher(tea2);
		if(stu2.getCourse().getCoursenumber()==0){
			System.out.println("学生:\t编号:"+stu2.getNumber()+"\t姓名："+stu2.getName()+"\n该学生已经退课或还没有选课");
		}else{
			System.out.println(stu2);
		}
	}
}
