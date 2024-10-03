package in.ashokit.DSA;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array is ::");
		ob.printArray(arr);
	}

	public void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + 1];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		} //while
			// copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		//copy remaining element sof R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid-1);
			sort(arr, mid +1, right);
			//merge the sorted values
			merge(arr, left, mid, right);
		}
	}

	public  void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
