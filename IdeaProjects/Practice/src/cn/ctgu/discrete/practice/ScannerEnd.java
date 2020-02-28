package cn.ctgu.discrete.practice;

import java.util.Scanner;
/*
 *   按"Enter"，读取每行输入的有效数据及最后自动结束
 */
public class ScannerEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (str.isEmpty()) {
				break;
			}
			System.out.println(str);
		}
		// sc.close();
	}		
}
