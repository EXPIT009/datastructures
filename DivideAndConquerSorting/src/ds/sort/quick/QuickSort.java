package ds.sort.quick;

public class QuickSort {
	public static void quicksort(int arry[],int low,int high){
		int pivot=arry[(low+high)/2];
		int i=low, j=high;
		while(i<=j){
			while(arry[i]<pivot){
				i++;
			}
			while(arry[i]>pivot){
				j--;
			}
		}
		  /* if (low < j)
	            quickSort(arr, low, j);
	        *//** recursively sort upper half **//*
	        if (i < high)
	            quickSort(arr, i, high);
	    }*/
	}

	public static void main(String[] args) {
		int[] arry={22,17,44,10,56,77,76,23,99,101};
		quicksort(arry, 0, arry.length-1);
	}
}
