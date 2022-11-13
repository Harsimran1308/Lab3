package CustomCommonFunctions;

public class CommonFunctions {
	public static double pi = 3.14159265358979323846;
	
	public static double toRadian(double value) {

		return (value * pi)/180;
	}

	public static double toDegree(double value) {

		return (value * 180)/pi;
	}
	
	public static double pow(double value, int pow) {

		if (pow == 0) {
			return 1;
		}
		if (pow == 1) {
			return value;
		}

		return value * pow(value, pow - 1);
	}

	public static double fact(int value) {

		if (value == 1 || value == 0) {
			return 1;
		}

		return value * fact(value-1);
	}
}
