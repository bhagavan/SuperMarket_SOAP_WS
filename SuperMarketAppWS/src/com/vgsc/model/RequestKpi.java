package com.vgsc.model;
/**
 *This class is a Plain Old Java Object(POJO) having getters and setters.
 */
public class RequestKpi {
	private String Time;
	private String NetworkCategory;
	private String NetworkDevice;
	private String OriginatingNetwork;
	private String TerminatingNetwork;
	private String FromNumber;
	private String ToNumber;
	private String Status;
	private String SER;
	private String SEER;
	private String SDF;
	private String CNAR;
	private String MOS;
	private String MOU;
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getNetworkCategory() {
		return NetworkCategory;
	}
	public void setNetworkCategory(String networkCategory) {
		NetworkCategory = networkCategory;
	}
	public String getNetworkDevice() {
		return NetworkDevice;
	}
	public void setNetworkDevice(String networkDevice) {
		NetworkDevice = networkDevice;
	}
	public String getOriginatingNetwork() {
		return OriginatingNetwork;
	}
	public void setOriginatingNetwork(String originatingNetwork) {
		OriginatingNetwork = originatingNetwork;
	}
	public String getTerminatingNetwork() {
		return TerminatingNetwork;
	}
	public void setTerminatingNetwork(String terminatingNetwork) {
		TerminatingNetwork = terminatingNetwork;
	}
	public String getFromNumber() {
		return FromNumber;
	}
	public void setFromNumber(String fromNumber) {
		FromNumber = fromNumber;
	}
	public String getToNumber() {
		return ToNumber;
	}
	public void setToNumber(String toNumber) {
		ToNumber = toNumber;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getSER() {
		return SER;
	}
	public void setSER(String sER) {
		SER = sER;
	}
	public String getSEER() {
		return SEER;
	}
	public void setSEER(String sEER) {
		SEER = sEER;
	}
	public String getSDF() {
		return SDF;
	}
	public void setSDF(String sDF) {
		SDF = sDF;
	}
	public String getCNAR() {
		return CNAR;
	}
	public void setCNAR(String cNAR) {
		CNAR = cNAR;
	}
	public String getMOS() {
		return MOS;
	}
	public void setMOS(String mOS) {
		MOS = mOS;
	}
	public String getMOU() {
		return MOU;
	}
	public void setMOU(String mOU) {
		MOU = mOU;
	}
}