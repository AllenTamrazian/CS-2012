package LabAssignment4;

public class MetricToEnglishConverter implements ScaleConverter{

	@Override
	public double convertTemperature(double tempIn) {
			double temperatureInFahrenheit = (tempIn* 9/5)+32;
			return temperatureInFahrenheit;
	}

	@Override
	public double convertDistance(double distanceIn) {
		double distanceInMiles=distanceIn/1.609;
		return distanceInMiles;
	}

	@Override
	public double convertWeight(double weightIn) {
		double weightInPounds=weightIn*2.2;
		return weightInPounds;
	}
}