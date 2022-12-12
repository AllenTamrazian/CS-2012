package LabAssignment4;

import java.util.Scanner;

public class ScaleConverterDriver {
	public static void main(String[] args)
	{
		try
		{
			EnglishToMetricConverter em = new EnglishToMetricConverter();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the English to Metric Converter \n");
			System.out.println("Input the measurements you would like to convert in a listed order: temperature, distance, weight");
			System.out.println("Temperature converted: "+em.convertTemperature(sc.nextDouble()));
			System.out.println("Distance converted: "+em.convertDistance(sc.nextDouble()));
			System.out.println("weight converted: "+em.convertWeight(sc.nextDouble())+"\n");
			
			MetricToEnglishConverter me = new MetricToEnglishConverter();
			System.out.println("Welcome to the Metric to English Converter \n");
			System.out.println("Input the measurements you would like to convert in a listed order: temperature, distance, weight");
			System.out.println("Temperature converted: "+me.convertTemperature(sc.nextDouble()));
			System.out.println("Distance converted: "+me.convertDistance(sc.nextDouble()));
			System.out.println("weight converted: "+me.convertWeight(sc.nextDouble()));
			
			System.out.println("Welcome to the English to Metric Converter \n");
			System.out.println("Input the measurements you would like to convert in a listed order: temperature, distance, weight");
			System.out.println("Temperature converted: "+em.convertTemperature(sc.nextDouble()));
			System.out.println("Distance converted: "+em.convertDistance(sc.nextDouble()));
			System.out.println("weight converted: "+em.convertWeight(sc.nextDouble())+"\n");
			sc.close();
		}
		catch(Exception ex)
		{
			System.out.print("Something went wrong here.");
		}
		
	}

}
