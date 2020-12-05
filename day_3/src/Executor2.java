public class Executor2 {
	public void run() {
		char[][] myMap = InputLoader.getInput();
		for(int x = 0; x< myMap.length; x++){
			for(int y = 0; y < myMap[x].length; y++){
				System.out.print(myMap[x][y]);
			}
			System.out.println("");
		}
	}

	private boolean checkValidityOfPassword(String password) {
		int firstPos;
		int secondPos;

		char checkedChar;
		String checkedPassword;
		String[] str = password.split(" ");

		firstPos = Integer.parseInt(str[0].split("-")[0]) - 1;
		secondPos = Integer.parseInt(str[0].split("-")[1]) - 1;

		checkedChar = str[1].charAt(0);
		checkedPassword = str[2];

		System.out.println(firstPos);
		System.out.println(secondPos);
		System.out.println(checkedChar);
		System.out.println(checkedPassword);


		return checkedChar == checkedPassword.charAt(firstPos) ^ checkedChar == checkedPassword.charAt(secondPos);
	}
}
