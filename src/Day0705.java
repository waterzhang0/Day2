
public class Day0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�����ķ���ֵ
		//1.1û�з���ֵ������
		Person705 wo =new Person705();
		wo.eat1(10);
		Person705 xiaobo=new Person705();
		xiaobo.eat1(12);
		//1.2�з���ֵ������
		//��ʵ����xiaobo�з���eat2�з���ֵ���渳ֵ������rice
		String rice=xiaobo.eat2(12);
		System.out.println("rice="+rice);
		

	}

}


class Person705{
	public void eat1(int money){
		System.out.println("�ϰ壬��һ��"+money+"��Ǯ");
		System.out.println("�Է�");
		System.out.println("����ս��");
		
	}
	//public void eat2(int money){//error,��Ϊvoid��ʾû�з���ֵ
	// ��Ϊvoid��ʾû�з���ֵ�����Ƿ������ͨ��return����һ���ַ���
	//�໥ì�ܡ�����void�滻ΪString
	public String eat2(int money){
		System.out.println("===�Լ��Է�===");
		System.out.println("�ϰ壬��һ��"+money+"��Ǯ");
		System.out.println("�Է�");
		System.out.println("����ս��");
		String rice="�ϰ���һ�ݼ��ȷ����������";
		return rice;//return ��ʾ���ص���˼������ʲô��
		 			//����return�����ֵ
					//ֵ���ظ�˭
					//˭���÷��ظ�˭
	}
}