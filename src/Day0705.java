
public class Day0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.方法的返回值
		//1.1没有返回值的例子
		Person705 wo =new Person705();
		wo.eat1(10);
		Person705 xiaobo=new Person705();
		xiaobo.eat1(12);
		//1.2有返回值的例子
		//把实例中xiaobo中方法eat2中返回值保存赋值给变量rice
		String rice=xiaobo.eat2(12);
		System.out.println("rice="+rice);
		

	}

}


class Person705{
	public void eat1(int money){
		System.out.println("老板，来一份"+money+"块钱");
		System.out.println("吃饭");
		System.out.println("结束战斗");
		
	}
	//public void eat2(int money){//error,因为void表示没有返回值
	// 因为void表示没有返回值，但是方法最后通过return返回一个字符串
	//相互矛盾。于是void替换为String
	public String eat2(int money){
		System.out.println("===自己吃饭===");
		System.out.println("老板，来一份"+money+"块钱");
		System.out.println("吃饭");
		System.out.println("结束战斗");
		String rice="老板来一份鸡腿饭，打包带走";
		return rice;//return 表示返回的意思，返回什么？
		 			//返回return后面的值
					//值返回给谁
					//谁调用返回给谁
	}
}