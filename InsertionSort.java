


import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		int []a = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("enter a element");

			a[i] = scan.nextInt();
		}
		InsertionSort ins = new InsertionSort();
		ins.insertionSort(a);
	}

}
public class InsertionSort {
		void insertionSort(int[] arr) {
			
			int item,j;
			for(int i=1; i<=arr.length-1;i++) {
				item = arr[i];
				j=i-1;
				
				while(j>=0 && arr[j]>item) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
			for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
			}
		}

}
