package aboutString;

public class FindStringLastIndex {
	/**
	 * �����ַ������һ�γ��ֵ�λ��
	 */
	public static void main(String[]args) {
		 String strOrig = "Hello world ,Hello Runoob";
		 int lastIndex = strOrig.lastIndexOf("Runoob");
		 if(lastIndex == - 1){
			 System.out.println("û���ҵ��ַ��� Runoob");
		 }else{
			 System.out.println("Runoob �ַ��������ֵ�λ�ã� "+ lastIndex);
		 }
	}

}
