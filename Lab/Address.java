package University;

public abstract class Address {
	private int streetNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private String countryName;
	public void setStreetNumber(int streetNumber)
	{
		this.streetNumber=streetNumber;
	}
	public void setStreetName(String streetName)
	{
		this.streetName=streetName;
	}
	public void setCityName(String cityName)
	{
		this.cityName=cityName;
	}
	public void setStateName(String stateName)
	{
		this.stateName=stateName;
	}
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	//getters
	public int getStreetNumber()
	{
		return streetNumber;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public String getCityName()
	{
		return cityName;
	}
	public String getStateName()
	{
		return stateName;
	}
	public String getCountryName()
	{
		return countryName;
	}

}
