package OrientedObjectLanguage;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum=" + sumArr(arr));

	}
	//메소드들의 매개변수 타입이 참조형이므로 원래의 배열의 값에 영향을 미친다.
	static void printArr(int[] arr){
		System.out.print("[");
		
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr){
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	static void sortArr(int[] arr){ 
		for(int i=0; i<arr.length; i++)	
		for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
	}

}
