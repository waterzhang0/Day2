
public class Day0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.类的概念
		// 2.类的定义
		// 2.1 格式 【修饰 public 】 类名 {类体}
		// 2.2 类的3类常用成员
		// 2.2.1 (1)成员变量
		// 2.2.1.1 位置，在类的{}内；
		// 2.2.1.2 格式，[修饰符 public] 变量类型 变量名 [=初始值];
		// 2.2.2 (2)方法
		// 2.2.2.1 位置，在类的{}内；
		// 2.2.2.2 格式，[修饰符 public] 返回值类型 方法名（参数列表 目前无）{方法体，返回值};
		// 2.2.3 (3)构造
		// 2.2.2.1 位置，在类的{}内；
		// 2.2.2.2 构造是一个特殊的方法
		// 2.2.2.2.1格式特殊 [修饰符] 方法名必须跟类类名完全一致（参数列表 目前无）{方法体，无返回值};
		// 2.2.2.2.2用途特殊;
		// (用途1):构造根new结合，便于根据类描述创建（克隆）实例；
		// (用途2):在构造内，便于系统底层自动调用，给成员变量2次赋初始值；

		// 3.根据类创建类的实例
		// 3.1定义一个Person类型的变量

		Person tangSeng;
		// 3.2创建变量的数据部分并赋值给变量名，类类型的变量，它的数据就是实例
		tangSeng = new Person();
		// 3.3让唐僧做一下自我介绍
		// 3.3.1通过变量tangSeng=》
		// 3.3.2找变量名在内存中对应的值（实例）
		// 3.3.3然后执行实例的方法
		// .表示的的意思
		tangSeng.displayInfo();

		Person sunWuKong = new Person();
		sunWuKong.displayInfo();
		Person zuBaJie=new Person();
		Person shaHeShang=new Person();

		// 4.问题
		// 通过执行。发现了两个的自我介绍完全一样，无法区别

		// 5.解决问题
		// 原理：tangSeng和sunWuKong虽然是同一个模板克隆出来的
		// 但是在内存中是两个完全不相关的实例；
		// 具体实现:修改各自的名字 年龄
		// 5.1修改tangSeng；
		tangSeng.name = "唐僧";
		tangSeng.age = 29;
		tangSeng.gender = true;
		tangSeng.nick = "唐三藏";
		// 5.2修改sunWuKong;
		sunWuKong.name = "孙悟空";
		sunWuKong.age = 550;
		sunWuKong.gender = true;
		sunWuKong.nick = "弼马温";
		//5.3修改zuBaJie
		// 5.3修改完毕重新介绍一下自己
		System.out.println("=========");
		tangSeng.displayInfo();
		sunWuKong.displayInfo();
		//1.问题产生
		//没生成一个新的实例，都需要重新设置一遍成员变量
		//才能让每一个实例跟自己的真正属性值配套
		//造成代码量过大，并且劳动是重复的
		//2.解决问题的思路
		//优化构造，生成实例时，通过构造直接把属性
		Person702 baiLongMa =new 
				Person702("白龙马",99,true,"小白龙");
		baiLongMa.displayInfo();
	}

}

class Person702 {
	public String name = "";// 非基本类型，string，建议初始为""
	public int age; // 0
	public boolean gender;// false
	public String nick = "";

	// 方法
	public void speak() {
		System.out.println("我也不知道说啥，无语");
		System.out.println("无语。。。。");
	}

	public void run() {
		System.out.println("预备");
		System.out.println("跑");
		System.out.println("停止");
	}

	public void displayInfo() {
		System.out.println("姓名:" + name + ",年龄:" + age + ",性别:" + (gender ? "男" : "女") + ",昵称:" + nick);
	}
	public Person702(){
		
	}
	//添加一个新的有参构造，外部调用构造时，直接把值传递过来；
	//public Person702("猪八戒",150,true,"猪悟能"){}=》
	//值必须有变量名传递=》
	//public Person702(name,age,gender,nick){}=》
	// 但是计算机不认，必须指明参数的类型=》于是成了下面的格式
	public Person702(String name1,int age1,
			boolean gender1,String nick1){
		//传进来的值，干嘛=》赋值给成员变量=》
		name=name1;//把变量name1的值赋给成员变量name,成员变量name原来的默认值被替换
		age=age1;
		gender=gender1;
		nick=nick1;
		
		
			
	}
}
