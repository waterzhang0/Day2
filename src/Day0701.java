
public class Day0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.���
		
		
		
		Person tangSeng;
		//3.2�������������ݲ��ֲ���ֵ���������������͵ı������������ݾ���ʵ��
		tangSeng = new Person();
		//3.3����ɮ��һ�����ҽ���
		//3.3.1ͨ������tangSeng=��
		//3.3.2�ұ��������ڴ��ж�Ӧ��ֵ��ʵ����
		//3.3.3Ȼ��ִ��ʵ���ķ���
		//.��ʾ�ĵ���˼
		tangSeng.displayInfo();
		
		Person sunWuKong=new Person();
		sunWuKong.displayInfo();
		
		//4.����
		//ͨ��ִ�С����������������ҽ�����ȫһ�����޷�����
		
		//5.�������
		//ԭ��tangSeng��sunWuKong��Ȼ��ͬһ��ģ���¡������
		//�������ڴ�����������ȫ����ص�ʵ����
		//����ʵ��:�޸ĸ��Ե����� ����
		//5.1�޸�tangSeng��
		tangSeng.name="��ɮ";
		tangSeng.age=29;
		tangSeng.gender=true;
		tangSeng.nick="������";
		//5.2�޸�sunWuKong;
		sunWuKong.name="�����";
		sunWuKong.age=550;
		sunWuKong.gender=true;
		sunWuKong.nick="������";
		//5.3�޸�������½���һ���Լ�
		System.out.println("=========");
		tangSeng.displayInfo();
		sunWuKong.displayInfo();
	}

}
class Person{
	public String name="";//�ǻ������ͣ�string�������ʼΪ""
	public int age;       //0
	public boolean gender;//false
	public String nick="";
	
	//����
	public void speak(){
		System.out.println("��Ҳ��֪��˵ɶ������");
		System.out.println("���������");
	}
	public void run(){
		System.out.println("Ԥ��");
		System.out.println("��");
		System.out.println("ֹͣ");
	}
	public void displayInfo(){
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+(gender?"��":"Ů")+",�ǳ�:"+nick);
	}
}
