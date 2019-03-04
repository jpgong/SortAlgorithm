
/**
 * 直接插入排序
 * 基本思想：把n（n>=2）个待排序的元素看做一个有序表和一个无序表，开始时有序表中只有一个元素，无序表中包含n-1个元素，
 * 排序过程中每次从无序表中取出第一个元素，将他插入到有序表中的适当位置，使之成为新的有序表，重复n-1次可完成排序
 * @author jpgong
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] array = new int[] {20,40,90,30,80,70,50};
		System.out.println("排序前： ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int temp;     //定义一个临时变量
		int j;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];   //从无序表中取出一个元素和其他元素进行比较
			for (j = i-1; j>0 && array[j] > temp; j--) {   
				array[j+1] = array[j];    //交换数组元素，如果temp之前的元素比他大，则该元素往后移
			} 
			array[j+1] = temp;   //循环结束，没有比temp更小的元素，则将temp放在这个适当的位置
		}
		System.out.println("排序后： ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
