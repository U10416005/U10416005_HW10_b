//U10416005ªL«Ø¦t

import java.util.Scanner;

public class TestBubbleSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many number you will enter(must more than two)");
		int quantity = input.nextInt();
		while(quantity<2){
			System.out.println("The quantity must more than two!");
			System.out.println("Please enter again");
			quantity = input.nextInt();
		}
		int bub[] = new int[quantity];
		System.out.println("Enter the number");
		for(int i = 0;i<quantity;++i) {
			bub[i] = input.nextInt();
		}
		System.out.println("The number your enter is");
		for(int i = 0;i<quantity;++i){
			System.out.print(bub[i] + ",");
		}
	}
}