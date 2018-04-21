package com.parkway.facility.common.util;

public class OperatingTime {

	String urlName;
	String title;
	String startTime;
	String endTime;

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperatingTime [urlName=" + urlName + ", title=" + title + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

}
