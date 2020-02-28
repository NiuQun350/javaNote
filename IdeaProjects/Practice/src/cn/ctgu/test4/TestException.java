package cn.ctgu.test4;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/11/8
 */
public class TestException {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入一位同学的姓名：");
			String name =  scanner.nextLine();
			System.out.println("请继续输入该同学的学号：");
			String id = scanner.nextLine();
			
			try {
				Student student1 = new Student(id, name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
}

class Student {
		String id;
		String name;
		public Student() {}
		public Student(String id, String name) throws Exception{
			setId(id);
			setName(name);
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setId(String id) throws Exception{
			if (id.length() > 6) {
				throw new IdLengthMoreSixException("学号长度大于6！");
			} else if(id.length() < 6) {
				throw new IdLengthLessSixException("学号长度小于6！");
			} else {
				if (id != null && !"".equals(id.trim())) {
					if (!id.matches("^[0-9]*$")) {
						throw new IdIncludeNonNumberException("学号中包含非数字字符！");
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
class IdLengthMoreSixException extends Exception{
		private String message;
		public IdLengthMoreSixException() {}
		public IdLengthMoreSixException(String message) {
			this.message = message;
			}
		@Override
		public void printStackTrace() {
			System.out.println(message);
		}
}

class IdLengthLessSixException extends Exception{
		private String message;
		public IdLengthLessSixException() {}
		public IdLengthLessSixException(String message) {
			this.message = message;
		}
		@Override
		public void printStackTrace() {
			System.out.println(message);
		}
}

class IdIncludeNonNumberException extends Exception{
		String message;
		public IdIncludeNonNumberException() {}
		public IdIncludeNonNumberException(String message) {
			this.message = message;
		}
		@Override
		public void printStackTrace() {
			System.out.println(message);		
		}
}
