package aboutString;

public class DeleteStringOneChar {
	/**
	 * ɾ���ַ����е�һ���ַ�
	 * @param args
	 */
	public static void main(String[]args) {
		String str = "hello world";
		System.out.println(removeCharAt(str,5));	
	}
	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	}
}
