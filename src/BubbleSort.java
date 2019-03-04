
/**
 * 冒泡排序法
 * 基本思想：对比相邻的两个元素，如果满足条件就交换元素值，把较小的元素值移到数组前面，把大的元素移到数组后面，
 * 这样数组元素就像气泡一样从底部升到顶部
 * @author jpgong
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] {63,4,24,1,3,13};
		System.out.println("冒泡排序法的过程是：");
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {  //比较相邻的两个元素，较大的元素往后冒泡
				if (array[j] > array[j+1]) {   
					int temp = array[j];       
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				System.out.print(array[j] + " ");    //输出数组元素
			}
			System.out.print("【");
			for (int j = array.length-i; j < array.length; j++) {   //把排序后的数组元素显示到文本区域，排完序后最大的i个元素都往数组后冒泡了
				System.out.print(array[j] + " ");
			}
			System.out.println("】");
		}
	}
}
