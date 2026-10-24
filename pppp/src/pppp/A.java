package pppp;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		int myAry[] = {100,200,300,400};
		myAry = Arrays.copyOf(myAry, 4);
		System.out.println(myAry[4]);
	}

}
