
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu1=new Student("����", 23, true, 3, 15);
		//Student stu2=new Student("�����", 28, false, 5, 24);
		//15��24��int���ͣ��������е�byte���Ͳ�ƥ��;
		//��Ҫ��15��24ǿ��ת����byte��
		//�µ�����,Ϊʲôs1.sno=101����Ҫת��
		Student s1=new Student();
		s1.sno=101;
		Student stu1=new Student("����", 23, true, 3, (byte)15);
		Student stu2=new Student("�����", 28, false, 5, (byte)24);
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
		String text="����:"+name+",����:"+age+",�Ա�:"+(sex?"��":"Ů");
		System.out.println(text);
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+(sex?"��":"Ů")+",�༶:"+classNum+",����:"+sno);
	}
	
}