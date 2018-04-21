/**
 * 
 */
package com.parkway.facility.common.util;

/**
 * @author nandita
 *
 */
public class FacilityDetailCommonJson extends FacilityDetailJson {
	
	
	String city;
	String state;
	String zipcode;
	String fax;
	String networkid;
	String npi;
	Boolean is24Hours;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getNetworkid() {
		return networkid;
	}
	public void setNetworkid(String networkid) {
		this.networkid = networkid;
	}
	public String getNpi() {
		return npi;
	}
	public void setNpi(String npi) {
		this.npi = npi;
	}
	public Boolean getIs24Hours() {
		return is24Hours;
	}
	public void setIs24Hours(Boolean is24Hours) {
		this.is24Hours = is24Hours;
	}
	@Override
	public String toString() {
		return "FacilityDetailCommonJson [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", fax=" + fax
				+ ", networkid=" + networkid + ", npi=" + npi + ", is24Hours=" + is24Hours + "]";
	}
	
}
