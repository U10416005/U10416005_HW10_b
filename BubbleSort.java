//U10416005ªL«Ø¦t

public class BubbleSort{
	int[] array;
	int quantity;
	public BubbleSort(int[] array,int quantity){
		this.array = array;
		this.quantity = quantity;
	}
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
		System.out.println("After BubbleSort:");
		for(int i = 0;i<quantity;i++){
			System.out.print(array[i]+",");
		}
	}
}