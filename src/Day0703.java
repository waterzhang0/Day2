/**
 * 类的练习
 * @author Administrator
 *
 */
public class Day0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student0 s1 =new Student0();
		s1.name="张1";
		s1.age=16;
		s1.gender=false;
		//s1.classNum=201604;
		s1.sno=101;
		s1.displayInfo();
		//Student s2=new Student("张2",17,true,201604,102); // ERROR
		//   102为int类型，跟构造中的byte类型不匹配;
		//  需要把102从int强制转换为byte,
		// 新的问提,问什么s1.sno=101不需要转换 ,留到以后
		//Student s2=new Student("张2",17,true,201604,(byte)102);
		Student0 s2=new Student0("张2",17,true,(byte)102);
		s2.displayInfo();
		//Student s3=new Student("张3",18,true,201604,(byte)103);
		Student0 s3=new Student0("张3",18,true,(byte)103);
		s3.displayInfo();
		//Student s4=new Student("张4",18,true,201604,(byte)104);
		Student0 s4=new Student0("张4",19,true,(byte)104);
		s4.displayInfo();		
	}

}

class Student0 {
	//姓名(name)、年龄(age)、性别(sex)，班级号(classNum)，座位号(sno)
	public String name="";
	public int age;
	public boolean gender;
	public int classNum=201604;  //默认值为为201604
	public byte sno;
	
	public Student0(){
		
	}
	
	public Student0(String name1,int age1,boolean gender1,
			byte sno1){
		name=name1;
		age=age1;
		gender=gender1;
		sno=sno1;		
	}

	public Student0(String name1,int age1,boolean gender1,
			int claslNum1,byte sno1){
		name=name1;
		age=age1;
		gender=gender1;
		classNum=claslNum1;
		sno=sno1;		
	}
	
	public void displayInfo(){
		String text="name="+name+
				",age="+age+
				",gender="+(gender? "男": "女")+
				"classNum="+classNum;
		System.out.println(text);		
	}
	
}
