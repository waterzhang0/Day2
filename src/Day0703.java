/**
 * �����ϰ
 * @author Administrator
 *
 */
public class Day0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student0 s1 =new Student0();
		s1.name="��1";
		s1.age=16;
		s1.gender=false;
		//s1.classNum=201604;
		s1.sno=101;
		s1.displayInfo();
		//Student s2=new Student("��2",17,true,201604,102); // ERROR
		//   102Ϊint���ͣ��������е�byte���Ͳ�ƥ��;
		//  ��Ҫ��102��intǿ��ת��Ϊbyte,
		// �µ�����,��ʲôs1.sno=101����Ҫת�� ,�����Ժ�
		//Student s2=new Student("��2",17,true,201604,(byte)102);
		Student0 s2=new Student0("��2",17,true,(byte)102);
		s2.displayInfo();
		//Student s3=new Student("��3",18,true,201604,(byte)103);
		Student0 s3=new Student0("��3",18,true,(byte)103);
		s3.displayInfo();
		//Student s4=new Student("��4",18,true,201604,(byte)104);
		Student0 s4=new Student0("��4",19,true,(byte)104);
		s4.displayInfo();		
	}

}

class Student0 {
	//����(name)������(age)���Ա�(sex)���༶��(classNum)����λ��(sno)
	public String name="";
	public int age;
	public boolean gender;
	public int classNum=201604;  //Ĭ��ֵΪΪ201604
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
				",gender="+(gender? "��": "Ů")+
				"classNum="+classNum;
		System.out.println(text);		
	}
	
}
