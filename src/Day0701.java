
public class Day0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.类的
		
		
		
		Person tangSeng;
		//3.2创建变量的数据部分并赋值给变量名，类类型的变量，它的数据就是实例
		tangSeng = new Person();
		//3.3让唐僧做一下自我介绍
		//3.3.1通过变量tangSeng=》
		//3.3.2找变量名在内存中对应的值（实例）
		//3.3.3然后执行实例的方法
		//.表示的的意思
		tangSeng.displayInfo();
		
		Person sunWuKong=new Person();
		sunWuKong.displayInfo();
		
		//4.问题
		//通过执行。发现了两个的自我介绍完全一样，无法区别
		
		//5.解决问题
		//原理：tangSeng和sunWuKong虽然是同一个模板克隆出来的
		//但是在内存中是两个完全不相关的实例；
		//具体实现:修改各自的名字 年龄
		//5.1修改tangSeng；
		tangSeng.name="唐僧";
		tangSeng.age=29;
		tangSeng.gender=true;
		tangSeng.nick="唐三藏";
		//5.2修改sunWuKong;
		sunWuKong.name="孙悟空";
		sunWuKong.age=550;
		sunWuKong.gender=true;
		sunWuKong.nick="弼马温";
		//5.3修改完毕重新介绍一下自己
		System.out.println("=========");
		tangSeng.displayInfo();
		sunWuKong.displayInfo();
	}

}
class Person{
	public String name="";//非基本类型，string，建议初始为""
	public int age;       //0
	public boolean gender;//false
	public String nick="";
	
	//方法
	public void speak(){
		System.out.println("我也不知道说啥，无语");
		System.out.println("无语。。。。");
	}
	public void run(){
		System.out.println("预备");
		System.out.println("跑");
		System.out.println("停止");
	}
	public void displayInfo(){
		System.out.println("姓名:"+name+",年龄:"+age+",性别:"+(gender?"男":"女")+",昵称:"+nick);
	}
}
