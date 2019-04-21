package 异常处理习题;

public class text_nomal {
public static void main(String[] sadawdasd) {
	int R = 0;
	String s="564654a";
	try {
		int f=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				f=f*10+(s.charAt(i)-'0');
			}else {
				throw new A(s);
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

	System.out.print(R);
}
}
//对比自带的报错，是一样的