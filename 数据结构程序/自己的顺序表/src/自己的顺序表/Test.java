package �Լ���˳���;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���Ȳ���һЩԪ��");
		Data a = new Data("2001","����Ұ",18);
		Data b = new Data("2002","����Ұ",18);
		Data c = new Data("2003","����Ұ",18);
		Data d = new Data("2004","����Ұ",18);
		List_Init lit = new List_Init();
		lit.add(a);
		lit.add(b);
		lit.add(c);
		lit.add(d);
		lit.add(a);
		lit.inner(6, c);
		lit.delete(1);
		lit.showAll();
		lit.showOne(2);
	}	

}
