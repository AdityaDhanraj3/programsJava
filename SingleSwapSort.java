
public class SingleSwapSort {
	public static void sort(int[] arr,int n) {
	int x =-1;
	int y= -1;
	int prev = arr[0];
	
	for(int i=1;i<arr.length;i++) {
		if(prev>arr[i]) {
			if(x==-1) {
				x=i-1;
				y=i;
			}else {
				y=i;
			}
				
			}
		prev = arr[i];
		}
	int temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5,6,4,8};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
		sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
	}
}
