package ds.searching.binery;
/*
 * complexty O(n)
 * */
public class BinarySearch {

	public static void binerySearch(int arry[] , int element){
		int first=0;
		int last=arry.length-1;
		for(int i=0; i<=arry.length/2; i++){
			int mid=(first+last)/2;
			if(element > arry[mid]){
				first=mid+1;
			}else if(element < arry[mid]){
				last=mid-1;
			}else{
				System.out.println(arry[mid]);
				break;
			}
		}
	}	
	
	public static void main(String[] args) {
		int[] arry={10, 17, 22, 23, 44, 56, 76, 77, 99, 101};
		binerySearch(arry, 101);
	}

}
