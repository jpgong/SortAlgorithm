
/**
 * ֱ�Ӳ�������
 * ����˼�룺��n��n>=2�����������Ԫ�ؿ���һ��������һ���������ʼʱ�������ֻ��һ��Ԫ�أ�������а���n-1��Ԫ�أ�
 * ���������ÿ�δ��������ȡ����һ��Ԫ�أ��������뵽������е��ʵ�λ�ã�ʹ֮��Ϊ�µ�������ظ�n-1�ο��������
 * @author jpgong
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] array = new int[] {20,40,90,30,80,70,50};
		System.out.println("����ǰ�� ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int temp;     //����һ����ʱ����
		int j;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];   //���������ȡ��һ��Ԫ�غ�����Ԫ�ؽ��бȽ�
			for (j = i-1; j>0 && array[j] > temp; j--) {   
				array[j+1] = array[j];    //��������Ԫ�أ����temp֮ǰ��Ԫ�ر��������Ԫ��������
			} 
			array[j+1] = temp;   //ѭ��������û�б�temp��С��Ԫ�أ���temp��������ʵ���λ��
		}
		System.out.println("����� ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
