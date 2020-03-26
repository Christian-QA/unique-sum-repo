package unique.sum.exercise;

public class UniqueSum {

	public String input(int num1, int num2, int num3) {

		int answer = 0;
		String answerString = "";

		if (num1 != num2 && num2 != num3 && num1 != num3) {
			answerString = num1 + " + " + num2 + " + " + num3 + " = ";
			return (answerString + answer);
		}
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			num1 = 0;
			num2 = 0;
			num3 = 0;
			answerString = "All the same. Nothin' to see here, folks";
			return (answerString);
		}
		if (num2 == num3) {
			num2 = 0;
			num3 = 0;
			answerString = "Only one number's unique: " + num1;
		}
		if (num1 == num2) {
			num1 = 0;
			num2 = 0;
			answerString = "Only one number's unique: " + num3;
		}
		if (num1 == num3) {
			num1 = 0;
			num3 = 0;
			answerString = "Only one number's unique: " + num2;
		}

		return (answerString);
	}

}