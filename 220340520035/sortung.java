
import java.util.*;
class sortung {
	static void InsertionSort(int a, int []b1){
		for (int i=1;i<a;++i){
			int key=  b1[i];
			int j= i-1;
			while (j>=0 && b1[j]>key){
				b1[j+1]=b1[j];
				j=j-1;
				printArr(b1);
			}
			b1[j+1]=key;
		}		
	}
	static void printArr(int arr[]){
		int a = arr.length;
		for (int i=0;i<a;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[]= new int[a];
		for (int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		InsertionSort(a,arr);
		printArr(arr);
	}
}