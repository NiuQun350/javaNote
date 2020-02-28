package cn.ctgu.test4;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
 * @author NiuQun
 * @2019/11/8
 */
public class TestException1 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一位同学的姓名：");
			String name =  scanner.nextLine();
			System.out.println("请继续输入该同学的学号：");
			String id = scanner.nextLine();
			
			try {
				Student1 student1 = new Student1(id, name);
			} catch (Exception e) {
				e.printStackTrace();
			}
			scanner.close();
	}
}

class Student1 {
		String id;
		String name;
		public Student1() {}
		public Student1(String id, String name){
			setId(id);
			setName(name);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setId(String id){
			if (id.length() > 6) {
				throw new IdLengthMoreSixException1("学号长度大于6！");
			} else if(id.length() < 6) {
				throw new IdLengthLessSixException1("学号长度小于6！");
			} else {
				if (id != null && !"".equals(id.trim())) {
					if (!id.matches("^[0-9]*$")) {
						throw new IdIncludeNonNumberException1("学号中包含非数字字符！");
					}
					this.id = id;
				}
			}
		}
}
/**
 * 因为以下三个异常类均继承自Exception(checked Exception)
 * 因此在调用这三个类的方法的后边必须用throws声明
 * 如果这三个异常类继承至RuntimeException,则不需要用throws声明
 */
class IdLengthMoreSixException1 extends RuntimeException{
	private String message;
	public IdLengthMoreSixException1() {}
	public IdLengthMoreSixException1(String message) {
			super(message);
			}
	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
}

class IdLengthLessSixException1 extends RuntimeException{
	private String message;
	public IdLengthLessSixException1() {}
	public IdLengthLessSixException1(String message) { super(message); }

	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
}

class IdIncludeNonNumberException1 extends RuntimeException{
	String message;
	public IdIncludeNonNumberException1() {}
	public IdIncludeNonNumberException1(String message) {
			super(message);
		}

	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
}
