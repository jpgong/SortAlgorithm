
/**
 * ð������
 * ����˼�룺�Ա����ڵ�����Ԫ�أ�������������ͽ���Ԫ��ֵ���ѽ�С��Ԫ��ֵ�Ƶ�����ǰ�棬�Ѵ��Ԫ���Ƶ�������棬
 * ��������Ԫ�ؾ�������һ���ӵײ���������
 * @author jpgong
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] {63,4,24,1,3,13};
		System.out.println("ð�����򷨵Ĺ����ǣ�");
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {  //�Ƚ����ڵ�����Ԫ�أ��ϴ��Ԫ������ð��
				if (array[j] > array[j+1]) {   
					int temp = array[j];       
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				System.out.print(array[j] + " ");    //�������Ԫ��
			}
			System.out.print("��");
			for (int j = array.length-i; j < array.length; j++) {   //������������Ԫ����ʾ���ı����������������i��Ԫ�ض��������ð����
				System.out.print(array[j] + " ");
			}
			System.out.println("��");
		}
	}
}
