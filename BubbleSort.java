//U10416005ªL«Ø¦t

public class BubbleSort{
	//Data field
	int[] array;
	int quantity;
	
	//Constructor
	public BubbleSort(int[] array,int quantity){
		this.array = array;
		this.quantity = quantity;
	}
	
	//The bubble sort method
	public void bubArray(){
		int hold;
		for(int i = 0;i<quantity;i++){
			for(int j = 0;j<quantity-1;j++){
				if(array[j]>array[j+1]){
					hold = array[j];
					array[j] = array[j+1];
					array[j+1] = hold;
				}
			}
		}
		//print the number after bubble sort
		System.out.println("After BubbleSort:");
		for(int i = 0;i<quantity;i++){
			System.out.print(array[i]+",");
		}
	}
}