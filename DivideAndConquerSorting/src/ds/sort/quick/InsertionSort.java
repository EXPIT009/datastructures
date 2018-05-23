package ds.sort.quick;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] sort(int array[]){
		for(int i=0; i<array.length; i++){
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j] >key){
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		return array;
				
	}
	
	
	
	
	public static void main(String[] args) {
	int arry[]={4,2,3,1,5};
	System.out.println(Arrays.toString(sort(arry)));
	}

}
