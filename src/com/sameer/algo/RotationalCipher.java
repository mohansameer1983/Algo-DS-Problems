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
				outputArr[i] = addChar(inputArr[i],rotationFactor,false);
			}else if(inputArr[i]>='A' && inputArr[i]<='Z'){
				outputArr[i] = addChar(inputArr[i],rotationFactor,true);
			}else if(inputArr[i]>='0' && inputArr[i]<='9'){
				outputArr[i] = addNumeric(inputArr[i],rotationFactor);
			}else {
				outputArr[i] = inputArr[i]; 
			}
			System.out.println(outputArr[i]);
		}		
		return String.valueOf(outputArr);
	}

	char addChar(char ch, int rotationFactor, boolean toUpperCase) {
		String alphStr = "abcdefghijklmnopqrstuvwxyz";

		
		if(rotationFactor>25) {
			rotationFactor = rotationFactor%26;
		}
		if(toUpperCase) {
			alphStr = alphStr.toUpperCase();
			System.out.println("alphStr - "+ alphStr);
		}
		int chIndex = alphStr.indexOf(ch);
		System.out.println("chIndex - "+ chIndex);
		int newIndex = 0;
		if(chIndex+rotationFactor>25) {
			newIndex = (rotationFactor - (25-chIndex))-1;
		}else {
			newIndex = chIndex+rotationFactor;
		}
		return alphStr.charAt(newIndex);
	}

	char addNumeric(char ch, int rotationFactor) {
		String numStr = "0123456789";
		if(rotationFactor>9) {
			rotationFactor = rotationFactor%10;
		}
		int chIndex = numStr.indexOf(ch);
		int newIndex = 0;
		if(chIndex+rotationFactor>9) {
			newIndex = (rotationFactor - (9-chIndex))-1;
		}else {
			newIndex = chIndex+rotationFactor;
		}
		return numStr.charAt(newIndex);
	}

}
