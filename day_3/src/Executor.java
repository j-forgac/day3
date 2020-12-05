public class Executor {
	public void run() {
		char[][] myMap = InputLoader.getInput();
		int counter = 0;
		int column = 0;
		for (int row = 0; row < myMap.length; row++) {
			if (myMap[row][column] == '#') {
				counter++;
			}
			if (column + 3 < myMap[row].length) {
				column = column + 3;
			} else {
				column = column + 3 - myMap[row].length;
			}
			System.out.println(row + " : " + counter);
		}
	}
}
