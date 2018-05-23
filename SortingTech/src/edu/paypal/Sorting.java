package edu.paypal;

import java.util.Arrays;

public class Sorting {

	public static int[] bubleSort(int arry[]){
		//int n=0;
		for(int i=0; i<arry.length; i++){
			//n++;
			boolean flage=false;
			for(int j=0;j<arry.length-1-i; j++){
				//n++;
				if(arry[j]> arry[j+1]){
					int t=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=t;
					flage=true;
				}
			}
			if(!flage){
				break;
			}
		}
		//System.out.println("N == "+n);
		return arry;
	}


	public static int[] selection(int[] arry){
		//int n=0;
		for(int i=0; i<3; i++){
		//	n++;
			int k=i;
			for(int j=i+1; j< arry.length; j++){
			//	n++;
				if(arry[k] < arry[j]){
					k=j;
				}
			}
			if(k!=i){
				int t=arry[i];
				arry[i]=arry[k];
				arry[k]=t;
			}	else{
				//break;
			}		
		}
		//System.out.println(n);
		return arry;
	}


	public static int[] insertionSort(int[] arry){

		for(int i=1; i< arry.length; i++){
			
			for(int j=i; j>0; j--){
				if(arry[j-1] > arry[j]){
					int t=arry[j];
					arry[j]=arry[j-1];
					arry[j-1]=t;
				}
				//System.out.println(Arrays.toString(arry));
			}
		}
		return arry;

	}


	public static void main(String[] args) {
		//int[] array={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		//System.out.println(Arrays.toString(bubleSort(array)));
		System.out.println(Arrays.toString(selection(array)));
		//System.out.println(Arrays.toString(insertionSort(array)));


	}

}
