package CustomTrignometricFunctions;

import CustomCommonFunctions.CommonFunctions;

public class Tan {

	public static double getTan(double val) {
		return (Sin.getSin(val) / Cos.getCos(val));
	}
	
	public static double getTanDegree(double val) {
		double radians = CommonFunctions.toRadian(val);
		return CommonFunctions.toDegree(getTan(radians));
	}
}
