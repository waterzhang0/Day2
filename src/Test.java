
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu1=new Student("张三", 23, true, 3, 15);
		//Student stu2=new Student("刘亦菲", 28, false, 5, 24);
		//15和24是int类型，跟构造中的byte类型不匹配;
		//需要把15和24强制转换成byte型
		//新的问题,为什么s1.sno=101不需要转换
		Student s1=new Student();
		s1.sno=101;
		Student stu1=new Student("张三", 23, true, 3, (byte)15);
		Student stu2=new Student("刘亦菲", 28, false, 5, (byte)24);
		stu1.displayInfo();
		stu2.displayInfo();
		
		

	}

}
class Student{
	public String name;
	public int age;
	public boolean sex;
	public int classNum;
	public byte sno;
	
	
	
	public Student(){
		
	}
	
	public Student(String name1,int age1,
			boolean sex1,int classNum1,byte sno1){
		name=name1;
		age=age1;
		sex=sex1;
		classNum=classNum1;
		sno=sno1;
			
	}
	
	
	public void displayInfo(){
		String text="姓名:"+name+",年龄:"+age+",性别:"+(sex?"男":"女");
		System.out.println(text);
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+(sex?"男":"女")+",班级:"+classNum+",座号:"+sno);
	}
	
}