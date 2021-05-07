package com.sameer.algo;

public class RotationalCipher {

	public static void main(String[] args) {
		RotationalCipher rc =  new RotationalCipher();
		String inputVal = "All-convoYs-9-be:Alert1.";
		String expectedVal =  "Epp-gsrzsCw-3-fi:Epivx5.";
		int rotationalFactor = 4;
		
		//Calling function
		String output = rc.rotationalCipher(inputVal, rotationalFactor);
		
		if(expectedVal.equals(output)) {
			System.out.println("Cipher Success!");
		}else{
			System.out.println("Cipher Failed!");
		}
	}
	
	String rotationalCipher(String input, int rotationFactor) {
		
		
		return "";
	}

}
