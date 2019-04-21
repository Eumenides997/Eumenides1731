package 异常处理习题;

class A extends Exception{
	public A(String s) {
		super(s);
	}
	public String getMessage() {
		return String.format("\"%s\"",Thread.currentThread().getName())
				+"For input string:"+super.getMessage();
	}
}


class B{
public static int P(String s) throws A {
		
		int f=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				f=f*10+(s.charAt(i)-'0');
			}else {
				throw new A(s);
			}
		}
		
		return f;		
	}
}

public class text {
	
	
	
	public static void main(String[] args) {
		try {
			System.out.print(B.P("12345a"));
		}catch(A e){
			e.printStackTrace();
		}
	}

}
