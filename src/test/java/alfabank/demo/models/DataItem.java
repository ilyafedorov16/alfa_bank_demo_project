package alfabank.demo.models;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("ajsonId")
	private int ajsonId;

	@SerializedName("fiasName")
	private String fiasName;

	@SerializedName("cityNameRus")
	private String cityNameRus;

	@SerializedName("regionName")
	private String regionName;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("cityDepartment")
	private String cityDepartment;

	@SerializedName("parentCityId")
	private int parentCityId;

	@SerializedName("prepositionalName")
	private String prepositionalName;

	@SerializedName("path")
	private String path;

	@SerializedName("genitiveName")
	private String genitiveName;

	@SerializedName("fiasId")
	private String fiasId;

	@SerializedName("regionId")
	private int regionId;

	@SerializedName("regionType")
	private String regionType;

	@SerializedName("regionTypeFull")
	private String regionTypeFull;

	@SerializedName("cityTimezone")
	private String cityTimezone;

	@SerializedName("cityNameNorm")
	private String cityNameNorm;

	@SerializedName("regionIsoCode")
	private String regionIsoCode;

	@SerializedName("longitude")
	private double longitude;

	public void setAjsonId(int ajsonId){
		this.ajsonId = ajsonId;
	}

	public int getAjsonId(){
		return ajsonId;
	}

	public void setFiasName(String fiasName){
		this.fiasName = fiasName;
	}

	public String getFiasName(){
		return fiasName;
	}

	public void setCityNameRus(String cityNameRus){
		this.cityNameRus = cityNameRus;
	}

	public String getCityNameRus(){
		return cityNameRus;
	}

	public void setRegionName(String regionName){
		this.regionName = regionName;
	}

	public String getRegionName(){
		return regionName;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setCityDepartment(String cityDepartment){
		this.cityDepartment = cityDepartment;
	}

	public String getCityDepartment(){
		return cityDepartment;
	}

	public void setParentCityId(int parentCityId){
		this.parentCityId = parentCityId;
	}

	public int getParentCityId(){
		return parentCityId;
	}

	public void setPrepositionalName(String prepositionalName){
		this.prepositionalName = prepositionalName;
	}

	public String getPrepositionalName(){
		return prepositionalName;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setGenitiveName(String genitiveName){
		this.genitiveName = genitiveName;
	}

	public String getGenitiveName(){
		return genitiveName;
	}

	public void setFiasId(String fiasId){
		this.fiasId = fiasId;
	}

	public String getFiasId(){
		return fiasId;
	}

	public void setRegionId(int regionId){
		this.regionId = regionId;
	}

	public int getRegionId(){
		return regionId;
	}

	public void setRegionType(String regionType){
		this.regionType = regionType;
	}

	public String getRegionType(){
		return regionType;
	}

	public void setRegionTypeFull(String regionTypeFull){
		this.regionTypeFull = regionTypeFull;
	}

	public String getRegionTypeFull(){
		return regionTypeFull;
	}

	public void setCityTimezone(String cityTimezone){
		this.cityTimezone = cityTimezone;
	}

	public String getCityTimezone(){
		return cityTimezone;
	}

	public void setCityNameNorm(String cityNameNorm){
		this.cityNameNorm = cityNameNorm;
	}

	public String getCityNameNorm(){
		return cityNameNorm;
	}

	public void setRegionIsoCode(String regionIsoCode){
		this.regionIsoCode = regionIsoCode;
	}

	public String getRegionIsoCode(){
		return regionIsoCode;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}



	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"ajsonId = '" + ajsonId + '\'' + 
			",fiasName = '" + fiasName + '\'' + 
			",cityNameRus = '" + cityNameRus + '\'' + 
			",regionName = '" + regionName + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",cityDepartment = '" + cityDepartment + '\'' + 
			",parentCityId = '" + parentCityId + '\'' + 
			",prepositionalName = '" + prepositionalName + '\'' + 
			",path = '" + path + '\'' + 
			",genitiveName = '" + genitiveName + '\'' + 
			",fiasId = '" + fiasId + '\'' + 
			",regionId = '" + regionId + '\'' + 
			",regionType = '" + regionType + '\'' + 
			",regionTypeFull = '" + regionTypeFull + '\'' + 
			",cityTimezone = '" + cityTimezone + '\'' + 
			",cityNameNorm = '" + cityNameNorm + '\'' + 
			",regionIsoCode = '" + regionIsoCode + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}