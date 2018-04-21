/**
 * 
 */
package com.parkway.facility.common.util;

import java.sql.Timestamp;
import java.util.List;



/**
 * @author nandita
 *
 */
public class FacilityDetailJson {
	
	String id;
	Timestamp lastModified;
	Timestamp publicationDate;
	Timestamp dateCreated;
	String urlName;
	String name;
	String address;
	Double latitude;
	Double longitude;
	String contactNo;
	String nearestMrt;
	String nearestBusStop;
	String clinicScheduleSummary;
	List<String> clinicOperatingSchedules;
	List<String> clinicAccreditations;
	List<ClinicServices> clinicServices;
	String clinicTypes;
	String announcements;
	String shortDescription;
	List<String> webImage;
	List<String> mobileImage;
	String operatingHours;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the lastModified
	 */
	public Timestamp getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified
	 *            the lastModified to set
	 */
	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the publicationDate
	 */
	public Timestamp getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate
	 *            the publicationDate to set
	 */
	public void setPublicationDate(Timestamp publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @return the dateCreated
	 */
	public Timestamp getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the urlName
	 */
	public String getUrlName() {
		return urlName;
	}

	/**
	 * @param urlName
	 *            the urlName to set
	 */
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo
	 *            the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the nearestMrt
	 */
	public String getNearestMrt() {
		return nearestMrt;
	}

	/**
	 * @param nearestMrt
	 *            the nearestMrt to set
	 */
	public void setNearestMrt(String nearestMrt) {
		this.nearestMrt = nearestMrt;
	}

	/**
	 * @return the nearestBusStop
	 */
	public String getNearestBusStop() {
		return nearestBusStop;
	}

	/**
	 * @param nearestBusStop
	 *            the nearestBusStop to set
	 */
	public void setNearestBusStop(String nearestBusStop) {
		this.nearestBusStop = nearestBusStop;
	}

	/**
	 * @return the clinicScheduleSummary
	 */
	public String getClinicScheduleSummary() {
		return clinicScheduleSummary;
	}

	/**
	 * @param clinicScheduleSummary
	 *            the clinicScheduleSummary to set
	 */
	public void setClinicScheduleSummary(String clinicScheduleSummary) {
		this.clinicScheduleSummary = clinicScheduleSummary;
	}

	/**
	 * @return the clinicOperatingSchedules
	 */
	public List<String> getClinicOperatingSchedules() {
		return clinicOperatingSchedules;
	}

	/**
	 * @param clinicOperatingSchedules
	 *            the clinicOperatingSchedules to set
	 */
	public void setClinicOperatingSchedules(List<String> clinicOperatingSchedules) {
		this.clinicOperatingSchedules = clinicOperatingSchedules;
	}

	/**
	 * @return the clinicAccreditations
	 */
	public List<String> getClinicAccreditations() {
		return clinicAccreditations;
	}

	/**
	 * @param clinicAccreditations
	 *            the clinicAccreditations to set
	 */
	public void setClinicAccreditations(List<String> clinicAccreditations) {
		this.clinicAccreditations = clinicAccreditations;
	}

	/**
	 * @return the clinicServices
	 */
	public List<ClinicServices> getClinicServices() {
		return clinicServices;
	}

	/**
	 * @param clinicServices
	 *            the clinicServices to set
	 */
	public void setClinicServices(List<ClinicServices> clinicServices) {
		this.clinicServices = clinicServices;
	}

	/**
	 * @return the clinicTypes
	 */
	public String getClinicTypes() {
		return clinicTypes;
	}

	/**
	 * @param clinicTypes
	 *            the clinicTypes to set
	 */
	public void setClinicTypes(String clinicTypes) {
		this.clinicTypes = clinicTypes;
	}

	/**
	 * @return the announcements
	 */
	public String getAnnouncements() {
		return announcements;
	}

	/**
	 * @param announcements
	 *            the announcements to set
	 */
	public void setAnnouncements(String announcements) {
		this.announcements = announcements;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the webImage
	 */
	public List<String> getWebImage() {
		return webImage;
	}

	/**
	 * @param webImage
	 *            the webImage to set
	 */
	public void setWebImage(List<String> webImage) {
		this.webImage = webImage;
	}

	/**
	 * @return the mobileImage
	 */
	public List<String> getMobileImage() {
		return mobileImage;
	}

	/**
	 * @param mobileImage
	 *            the mobileImage to set
	 */
	public void setMobileImage(List<String> mobileImage) {
		this.mobileImage = mobileImage;
	}

	/**
	 * @return the operatingHours
	 */
	public String getOperatingHours() {
		return operatingHours;
	}

	/**
	 * @param operatingHours
	 *            the operatingHours to set
	 */
	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FacilityDetailJson [id=" + id + ", lastModified=" + lastModified + ", publicationDate="
				+ publicationDate + ", dateCreated=" + dateCreated + ", urlName=" + urlName + ", name=" + name
				+ ", address=" + address + ", latitude=" + latitude + ", longitude=" + longitude + ", contactNo="
				+ contactNo + ", nearestMrt=" + nearestMrt + ", nearestBusStop=" + nearestBusStop
				+ ", clinicScheduleSummary=" + clinicScheduleSummary + ", clinicOperatingSchedules="
				+ clinicOperatingSchedules + ", clinicAccreditations=" + clinicAccreditations + ", clinicServices="
				+ clinicServices + ", clinicTypes=" + clinicTypes + ", announcements=" + announcements
				+ ", shortDescription=" + shortDescription + ", webImage=" + webImage + ", mobileImage=" + mobileImage
				+ ", operatingHours=" + operatingHours + "]";
	}
	
	

}
