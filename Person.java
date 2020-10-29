package cn.syhg.course;

import java.lang.annotation.Target;

public class Person {
	//人有属性：编号，姓名，性别，年龄，民族
	private int number;
	private String name;
	private String sex;
	private int age;
	private String nation;
	//无参的构造方法和有参的构造方法
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int number, String name, String sex, int age, String nation) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.nation = nation;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	//输出父类person的信息
	public String toString() {
		return "\t编号:" + number + "\t姓名:" + name + "\t性别:" + sex+ "\t年龄:" + age+ "\t民族:" + nation;
	}		
}
//Student类继承父类Person，属性：编号，姓名，性别，年龄，民族，所选课程
class Student extends Person{
    private Course course;
    private Teacher teacher;
  //无参的构造方法和有参的构造方法
  	public Student(Course course) {
  		super();
  		this.course = course;
  	}
  	public Student() {
  		super();
  		// TODO Auto-generated constructor stub
  	}
  	public Student(int number, String name, String sex, int age, String nation) {
		super(number, name, sex, age, nation);
		// TODO Auto-generated constructor stub
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	//输出学生的信息
	public String toString() {
		return "学生:"+super.toString()+course+teacher;
		
	}  	
}
//Teacher类继承父类Person，属性：编号，姓名，性别，年龄，民族，所授课程  
class Teacher extends Person{
    private Course course;
    //无参的构造方法和有参的构造方法
	public Teacher(Course course) {
		super();
		this.course = course;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int number, String name, String sex, int age, String nation) {
		super(number, name, sex, age, nation);
		// TODO Auto-generated constructor stub
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	//输出老师的信息
	public String toString() {
		return "\n授课老师信息:\t"+"老师姓名："+super.getName()+"\t性别:"+super.getSex()+"\t年龄:"+super.getAge()+"\n";	
	}

	
    	
}