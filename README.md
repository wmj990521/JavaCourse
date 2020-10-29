# JavaCourse
Java第二次试验——模拟学生选课
# 计G201 武美娟 2020322065

# 实验2

## 一、实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2. 掌握面向对象的类设计方法（属性、方法）；
3. 掌握类的继承用法，通过构造方法实例化对象；
4. 学会使用super()，用于实例化子类；
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、实验要求
1. 学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
对象示例： 	 
   * 人员（编号，姓名，性别，年龄，民族） 
   * 教师（编号，姓名，性别，年龄，民族，所授课程 ） 
   * 学生（编号，姓名，性别，年龄，民族，所选课程） 
   * 课程（课程编号，课程名字，授课老师，上课地点，上课时间，课程学分）
2. 编写上述实体类以及测试主类（注意类之间继承关系的适用） 。 
   在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 ）；模拟学生退课操作，再打印课程信息。  
## 三、实验过程
1. 创建Person封装类，人员有属性：编号，姓名，性别，年龄，民族;   
   要求setNumber(int number)方法将参数number的值赋值给number，要求getNumber()返回number的值；  
   要求setName(String name) 方法将参数name的值赋值给name，要求getName（）返回name的值;     
   要求setSex(String sex)方法将参数sex的值赋值给sex，要求getSex（）返回sex的值;     
   要求setAge(int age)方法将参数age的值赋值给age，要求getAge（）返回age的值;    
   要求setNation(String nation)方法将参数nation的值赋值给nation，要求getNation（）返回nation的值;  
   创建Person类的构造方法，实例化对象;  
   创建toString()方法，返回person的信息。 
2. 创建Student类继承父类Person，学生有属性：编号，姓名，性别，年龄，民族，所选课程；   
   要求setCourse(Course course)方法将参数course的值赋值给course，要求getCourse()返回course的值；   
   创建Student类的构造方法，实例化对象；   
   创建toString()方法，返回学生的信息。 
3. 创建Teacher类继承父类Person，学生有属性：编号，姓名，性别，年龄，民族，所授课程；   
   要求setCourse(Course course)方法将参数course的值赋值给course，要求getCourse()返回course的值；   
   创建Teacher类的构造方法，实例化对象；  
   创建toString()方法，返回老师的信息。  
4. 创建Course类，属性：课程编号，课程名字，授课老师，上课地点，上课时间，课程学分；   
   要求setCoursenumber(int coursenumber)方法将参数coursenumber的值赋值给coursenumber，要求getCoursenumber返回coursenumber的值；   
   要求setCoursename(String coursename)方法将参数coursename的值赋值给coursename，要求getCoursename（）返回coursename的值；   
   要求setTeacher(String teacher)方法将参数teacher的值赋值给teacher，要求getTeacher（）返回teacher的值；   
   要求setSite(String site)方法将参数site的值赋值给site，要求getSite（）返回site的值；    
   要求setTime(String time)方法将参数time的值赋值给time，要求getTime（）返回time的值；   
   要求setCredit(double credit)方法将参数credit的值赋值给credit，要求getCredit（）返回credit的值；   
   创建Course类的构造方法，实例化对象；   
   创建toString()方法，返回课程的信息。 
 5. 创建主类Test类
  * main方法中创建两个Student对象stu1、stu2,stu1将自己的属性：编号，姓名，性别，年龄，民族,设置为(1,"Karry","男",21,"汉族"),stu2将自己的属性：编号，姓名，性别，年龄，民族设置为(2,"鹿晗","男",21,"汉族");
  * main方法中创建两个Teacher对象tea1、tea2,tea1将自己的属性：编号，姓名，性别，年龄，民族,设置为(1,"Wang","女",31,"汉族"),tea2将自己的属性：编号，姓名，性别，年龄，民族设置为(2,"Wang","女",30,"汉族");
  * main方法中创建两个Course对象cour1、cour2,cour1将自己的属性：课程编号，课程名字，授课老师，上课地点，上课时间，课程学分设置为(1,"高数","Jackson","1教102","08:00-09:30",2.0),cour2将自己的属性：课程编号，课程名字，授课老师，上课地点，上课时间，课程学分设置为( );
  * stu1调用setCourse(Course course)方法，调用时实参是cour1,stu2调用setCourse(Course course)方法，调用时实参是cour2;
  * stu1调用setTeacher(String teacher)方法，调用时实参是tea1,stu2调用setTeacher(String teacher)方法，调用时实参是tea2;
  * 创建if-else()方法判断学生所选课程是否为空，若为空，输出该学生已经退课或还没有选课，否则，输出学生的信息，该学生所选课程的信息，该学生所选课程的老师的信息。
## 三、核心方法
1. 方法1
```
public int getSpeed() {
  return speed;
}
public void setSpeed(int speed) {
  this.speed = speed;
}
 ```
 2. 方法2
 ```
 public void show(){
   System.out.println("CPU的速度："+cpu.getSpeed());
   System.out.println("硬盘容量："+HD.getAmount());
}
 ```
 3. 方法3
 ```
 CPU cpu=new CPU();
 HardDisk disk=new HardDisk();
 PC pc=new PC();
 cpu.setSpeed(2200);
 disk.setAmount(200);
 pc.setCpu(cpu);
 pc.setHD(disk);
 pc.show();
 ```
 4. 方法4
 ```
 public CPU() {
   super();
   // TODO Auto-generated constructor stub
 }
 public CPU(int speed, float price) {
   super();
   this.speed = speed;
   this.price = price;
 }
 ```
## 四、实验结果
  运行成功，输出结果：CPU的速度：2200   硬盘容量：200
  ![img](http://note.youdao.com/yws/public/resource/253af59d7c3cc80c27cd7edcfc8a506e/xmlnote/WEBRESOURCEed65ad4dbc90574ec7d9e524bb29c401/13)
  
## 五、实验感想
  通过这次实验，我学会了类的编写，更加了解了类的成员的使用;学会了构造方法的使用，有参的构造方法和无参的构造方法;更加理解了访问权限，private、protected、public修饰符的作用。

