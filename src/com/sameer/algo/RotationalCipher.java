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
			System.out.println("Cipher Success! --> "+ output);
		}else{
			System.out.println("Cipher Failed! --> "+ output);
		}
	}

	String rotationalCipher(String input, int rotationFactor) {
		char[] inputArr = input.toCharArray();
		char[] outputArr = new char[inputArr.length];
		for(int i=0;i< inputArr.length;i++) {
			if(inputArr[i]>='a' && inputArr[i]<='z') {
				outputArr[i] = addChar(inputArr[i],4,false);
			}else if(inputArr[i]>='A' && inputArr[i]<='Z'){
				outputArr[i] = addChar(inputArr[i],4,true);
			}else if(inputArr[i]>='0' && inputArr[i]<='9'){
				outputArr[i] = addNumeric(inputArr[i],4);
			}else {
				outputArr[i] = inputArr[i]; 
			}

		}		
		return outputArr.toString();
	}

	char addChar(char ch, int rotationFactor, boolean toUpperCase) {
		String alphStr = "abcdefghijklmnopqrstuvwxyz";
		if(toUpperCase) {
			alphStr = alphStr.toUpperCase();
		}
		int chIndex = alphStr.indexOf(ch);
		int newIndex = 0;
		if(chIndex+rotationFactor>26) {
			newIndex = (rotationFactor - (26-chIndex))-1;
		}
		return alphStr.charAt(newIndex);
	}
	
	char addNumeric(char ch, int rotationFactor) {
		String numStr = "0123456789";

		int chIndex = numStr.indexOf(ch);
		int newIndex = 0;
		if(chIndex+rotationFactor>10) {
			newIndex = (rotationFactor - (10-chIndex))-1;
		}
		return numStr.charAt(newIndex);
	}

}
