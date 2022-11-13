package CustomTrignometricFunctions;

import CustomCommonFunctions.CommonFunctions;

/*
 * Reference
 * 
 * https://stackoverflow.com/questions/45333694/implement-sine-in-java-without-
 * math-sin-function
 */

public class Sin {
	
	public static double getSin(double radianValue) {
		
		double pi = 3.14159265358979323846;
		int sign = 1;
		if(radianValue < 0)
			sign = -1;
		
		double currVal = 0;

		if (radianValue == Double.NEGATIVE_INFINITY || !(radianValue < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
		}
		
		radianValue %= 2 * pi;

		if (radianValue > pi) {
			radianValue -= pi;
			sign = -(sign);
		}
		if (radianValue < 0) {
			radianValue = 2 * pi - radianValue;
		}

		for (int i = 0; i <= 50; i++) {
			currVal += CommonFunctions.pow(-1, i) * (CommonFunctions.pow(radianValue, 2 * i + 1) / CommonFunctions.fact(2 * i + 1));
		}
		
		return currVal * sign;
	}
	
	public static double getSinDegree(double value) {
		double radians = CommonFunctions.toRadian(value);
		return CommonFunctions.toDegree(getSin(radians));
	}

}
