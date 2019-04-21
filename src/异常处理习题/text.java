package 异常处理习题;

public class text {
	
	public static int P(String s) {
		
		int f=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				f=f*10+f-'0';
			}
		}
		
		return f;		
	}
	
	public static void main(String[] args) {
		
	}

}
