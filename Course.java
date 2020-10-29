package cn.syhg.course;

public class Course {
	//Course类，属性：课程编号，课程名字，授课老师，上课地点，上课时间，课程学分
	private int coursenumber;
	private String coursename;
	private String teacher;
	private String site;
	private String time;
	private double credit;
	//无参的构造方法和有参的构造方法
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int coursenumber, String coursename, String teacher,
			String site, String time, double credit) {
		super();
		this.coursenumber = coursenumber;
		this.coursename = coursename;
		this.teacher = teacher;
		this.site = site;
		this.time = time;
		this.credit = credit;
	}

	public int getCoursenumber() {
		return coursenumber;
	}
	public void setCoursenumber(int coursenumber) {
		this.coursenumber = coursenumber;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	//输出课程信息
	public String toString() {
		return "\n学生所选课程信息: "+"课程编号：" + coursenumber + " 课程名字："
				+ coursename + " 授课老师:" + teacher + " 上课地点:" + site
				+ " 上课时间:" + time +" 课程学分:" + credit ;
	}
	
}
