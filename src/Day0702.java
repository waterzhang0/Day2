
public class Day0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.��ĸ���
		// 2.��Ķ���
		// 2.1 ��ʽ ������ public �� ���� {����}
		// 2.2 ���3�ೣ�ó�Ա
		// 2.2.1 (1)��Ա����
		// 2.2.1.1 λ�ã������{}�ڣ�
		// 2.2.1.2 ��ʽ��[���η� public] �������� ������ [=��ʼֵ];
		// 2.2.2 (2)����
		// 2.2.2.1 λ�ã������{}�ڣ�
		// 2.2.2.2 ��ʽ��[���η� public] ����ֵ���� �������������б� Ŀǰ�ޣ�{�����壬����ֵ};
		// 2.2.3 (3)����
		// 2.2.2.1 λ�ã������{}�ڣ�
		// 2.2.2.2 ������һ������ķ���
		// 2.2.2.2.1��ʽ���� [���η�] �������������������ȫһ�£������б� Ŀǰ�ޣ�{�����壬�޷���ֵ};
		// 2.2.2.2.2��;����;
		// (��;1):�����new��ϣ����ڸ�����������������¡��ʵ����
		// (��;2):�ڹ����ڣ�����ϵͳ�ײ��Զ����ã�����Ա����2�θ���ʼֵ��

		// 3.�����ഴ�����ʵ��
		// 3.1����һ��Person���͵ı���

		Person tangSeng;
		// 3.2�������������ݲ��ֲ���ֵ���������������͵ı������������ݾ���ʵ��
		tangSeng = new Person();
		// 3.3����ɮ��һ�����ҽ���
		// 3.3.1ͨ������tangSeng=��
		// 3.3.2�ұ��������ڴ��ж�Ӧ��ֵ��ʵ����
		// 3.3.3Ȼ��ִ��ʵ���ķ���
		// .��ʾ�ĵ���˼
		tangSeng.displayInfo();

		Person sunWuKong = new Person();
		sunWuKong.displayInfo();
		Person zuBaJie=new Person();
		Person shaHeShang=new Person();

		// 4.����
		// ͨ��ִ�С����������������ҽ�����ȫһ�����޷�����

		// 5.�������
		// ԭ��tangSeng��sunWuKong��Ȼ��ͬһ��ģ���¡������
		// �������ڴ�����������ȫ����ص�ʵ����
		// ����ʵ��:�޸ĸ��Ե����� ����
		// 5.1�޸�tangSeng��
		tangSeng.name = "��ɮ";
		tangSeng.age = 29;
		tangSeng.gender = true;
		tangSeng.nick = "������";
		// 5.2�޸�sunWuKong;
		sunWuKong.name = "�����";
		sunWuKong.age = 550;
		sunWuKong.gender = true;
		sunWuKong.nick = "������";
		//5.3�޸�zuBaJie
		// 5.3�޸�������½���һ���Լ�
		System.out.println("=========");
		tangSeng.displayInfo();
		sunWuKong.displayInfo();
		//1.�������
		//û����һ���µ�ʵ��������Ҫ��������һ���Ա����
		//������ÿһ��ʵ�����Լ�����������ֵ����
		//��ɴ��������󣬲����Ͷ����ظ���
		//2.��������˼·
		//�Ż����죬����ʵ��ʱ��ͨ������ֱ�Ӱ�����
		Person702 baiLongMa =new 
				Person702("������",99,true,"С����");
		baiLongMa.displayInfo();
	}

}

class Person702 {
	public String name = "";// �ǻ������ͣ�string�������ʼΪ""
	public int age; // 0
	public boolean gender;// false
	public String nick = "";

	// ����
	public void speak() {
		System.out.println("��Ҳ��֪��˵ɶ������");
		System.out.println("���������");
	}

	public void run() {
		System.out.println("Ԥ��");
		System.out.println("��");
		System.out.println("ֹͣ");
	}

	public void displayInfo() {
		System.out.println("����:" + name + ",����:" + age + ",�Ա�:" + (gender ? "��" : "Ů") + ",�ǳ�:" + nick);
	}
	public Person702(){
		
	}
	//���һ���µ��вι��죬�ⲿ���ù���ʱ��ֱ�Ӱ�ֵ���ݹ�����
	//public Person702("��˽�",150,true,"������"){}=��
	//ֵ�����б���������=��
	//public Person702(name,age,gender,nick){}=��
	// ���Ǽ�������ϣ�����ָ������������=�����ǳ�������ĸ�ʽ
	public Person702(String name1,int age1,
			boolean gender1,String nick1){
		//��������ֵ������=����ֵ����Ա����=��
		name=name1;//�ѱ���name1��ֵ������Ա����name,��Ա����nameԭ����Ĭ��ֵ���滻
		age=age1;
		gender=gender1;
		nick=nick1;
		
		
			
	}
}
