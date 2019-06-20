package com.kh.ti.travel.model.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Travel implements java.io.Serializable {
	
	private int trvId;
	private String trvTitle;
	private Date startDate;
	private Date endDate;
	private int compNumber;
	private Date openDate;
	private Date modifyDate;
	private Date completeDate;
	private String status;
	private int memberId;
	private ArrayList trvCities;
	private ArrayList trvComps;
	private ArrayList trvTags;
	private int trvRef;
	
	public Travel() {}

	public Travel(int trvId, String trvTitle, Date startDate, Date endDate, int compNumber, Date openDate,
			Date modifyDate, Date completeDate, String status, int memberId, ArrayList trvCities, ArrayList trvComps,
			ArrayList trvTags, int trvRef) {
		super();
		this.trvId = trvId;
		this.trvTitle = trvTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.compNumber = compNumber;
		this.openDate = openDate;
		this.modifyDate = modifyDate;
		this.completeDate = completeDate;
		this.status = status;
		this.memberId = memberId;
		this.trvCities = trvCities;
		this.trvComps = trvComps;
		this.trvTags = trvTags;
		this.trvRef = trvRef;
	}

	public int getTrvId() {
		return trvId;
	}

	public void setTrvId(int trvId) {
		this.trvId = trvId;
	}

	public String getTrvTitle() {
		return trvTitle;
	}

	public void setTrvTitle(String trvTitle) {
		this.trvTitle = trvTitle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public void setCompNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public ArrayList getTrvCities() {
		return trvCities;
	}

	public void setTrvCities(ArrayList trvCities) {
		this.trvCities = trvCities;
	}

	public ArrayList getTrvComps() {
		return trvComps;
	}

	public void setTrvComps(ArrayList trvComps) {
		this.trvComps = trvComps;
	}

	public ArrayList getTrvTags() {
		return trvTags;
	}

	public void setTrvTags(ArrayList trvTags) {
		this.trvTags = trvTags;
	}

	public int getTrvRef() {
		return trvRef;
	}

	public void setTrvRef(int trvRef) {
		this.trvRef = trvRef;
	}

	@Override
	public String toString() {
		return "Travel [trvId=" + trvId + ", trvTitle=" + trvTitle + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", compNumber=" + compNumber + ", openDate=" + openDate + ", modifyDate=" + modifyDate
				+ ", completeDate=" + completeDate + ", status=" + status + ", memberId=" + memberId + ", trvCities="
				+ trvCities + ", trvComps=" + trvComps + ", trvTags=" + trvTags + ", trvRef=" + trvRef + "]";
	}

	
	
	
	

}