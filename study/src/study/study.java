package study;

public class study {
	 public static void  main(String[] args) {
		         String num1 = "2333";
		          String num2 = "414.0";
		          //�����ַ�������ʹ�����·���ֱ��תΪint
		          int intNum1 = Integer.parseInt(num1);
		          int intNum3 = Integer.valueOf(num1);
		         //�������ַ�������ʹ�����·���ֱ��תΪ����int
		         //int intNum1 = Integer.parseInt(num2);
		         //int intNum3 = Integer.valueOf(num2);
		         //���Ҫת����Ҫ��תΪ"double"�ͣ���תΪint
		         Double douNum1 = Double.valueOf(num1);
		         Double douNum2 = Double.valueOf(num2);
		         
		         int intNum5 = douNum1.intValue();
		         int intNum6 = douNum2.intValue();
		         System.out.println("-----------"+intNum1);
		         System.out.println("-----------"+intNum3);
		         System.out.println("-----------"+douNum1 +", "+douNum2);
		         System.out.println("-----------"+intNum5 +", "+intNum6);    
		     }
}
