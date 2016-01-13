package random;

import java.util.function.IntBinaryOperator;

public class LinearReverse {
	public static void main(String[] args) {
		int[] myarray = {1,2,3};
		LinearReverse mLinear = new LinearReverse();
		mLinear.printArray(myarray);
		myarray = mLinear.reverseArray(myarray);
		mLinear.printArray(myarray);
		System.out.println(mLinear.sum(myarray));
		System.out.println(mLinear.product(myarray));
		System.out.println("Funktional Rechnen: add 12,34 = " + functCalc(12,34,add));
	}
	
	static IntBinaryOperator add = (a,b) -> a+b;
	static IntBinaryOperator sub = (a,b) -> a-b;
	static IntBinaryOperator mul = (a,b) -> a*b;
	static IntBinaryOperator div = (a,b) -> a/b;
	
	public static int functCalc(int i, int j, IntBinaryOperator op){
		return op.applyAsInt(i,j);
	}
	
	public int[] reverseArray(int[] iarray){
		int[] revArr = new int[iarray.length];
		for(int i = 0;i < iarray.length;i++){
			revArr[i] = iarray[iarray.length-(i+1)];
		}
		return revArr;
	}
	
	public void printArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public int sum(int[] arr){
		if(arr.length < 1){
			return 0;
		}else{
			for(int i = 1;i < arr.length;i++){
				arr[0] += arr[i];
			}
			return arr[0];
		}
	}
	public int product(int[] arr){
		if(arr.length < 1){
			return 0;
		}else{
			for(int i = 1;i < arr.length;i++){
				arr[0] *= arr[i];
			}
			return arr[0];
		}
	}
	

}
