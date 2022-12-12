package LabAssignment4;

public class EnglishToMetricConverter implements ScaleConverter{

	@Override
	public double convertTemperature(double tempIn) {
			double temperatureInCelsius = (tempIn*5/9)-32;
			return temperatureInCelsius;
	}

	@Override
	public double convertDistance(double distanceIn) {
		double distanceInKm=distanceIn*1.609;
		return distanceInKm;
	}

	@Override
	public double convertWeight(double weightIn) {
		double weightInKg=weightIn/2.2;
		return weightInKg;
	}
}