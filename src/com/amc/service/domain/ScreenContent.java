package com.amc.service.domain;

public class ScreenContent {

	private int screenContentNo;
	// 스크린이 삭제되고 movie가 생김
	private Movie movie;
	private String screenDate;
	private String screenOpenTime;
	private String scrrenEndTime;
	private int ticketPrice;
	private String previewFlag;
	private String previewTitle;
	private String ticketOpenDate;
	private String ticketOpenTime;
	private String inviteActor;
	private String screenContentRegDate;

	public int getScreenContentNo() {
		return screenContentNo;
	}

	public void setScreenContentNo(int screenContentNo) {
		this.screenContentNo = screenContentNo;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getScreenDate() {
		return screenDate;
	}

	public void setScreenDate(String screenDate) {
		this.screenDate = screenDate;
	}

	public String getScreenOpenTime() {
		return screenOpenTime;
	}

	public void setScreenOpenTime(String screenOpenTime) {
		this.screenOpenTime = screenOpenTime;
	}

	public String getScrrenEndTime() {
		return scrrenEndTime;
	}

	public void setScrrenEndTime(String scrrenEndTime) {
		this.scrrenEndTime = scrrenEndTime;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getPreviewFlag() {
		return previewFlag;
	}

	public void setPreviewFlag(String previewFlag) {
		this.previewFlag = previewFlag;
	}

	public String getPreviewTitle() {
		return previewTitle;
	}

	public void setPreviewTitle(String previewTitle) {
		this.previewTitle = previewTitle;
	}

	public String getTicketOpenDate() {
		return ticketOpenDate;
	}

	public void setTicketOpenDate(String ticketOpenDate) {
		this.ticketOpenDate = ticketOpenDate;
	}

	public String getTicketOpenTime() {
		return ticketOpenTime;
	}

	public void setTicketOpenTime(String ticketOpenTime) {
		this.ticketOpenTime = ticketOpenTime;
	}

	public String getInviteActor() {
		return inviteActor;
	}

	public void setInviteActor(String inviteActor) {
		this.inviteActor = inviteActor;
	}

	public String getScreenContentRegDate() {
		return screenContentRegDate;
	}

	public void setScreenContentRegDate(String screenContentRegDate) {
		this.screenContentRegDate = screenContentRegDate;
	}

	@Override
	public String toString() {
		return "ScreenContent [screenContentNo=" + screenContentNo + ", movie=" + movie + ", screenDate=" + screenDate
				+ ", screenOpenTime=" + screenOpenTime + ", scrrenEndTime=" + scrrenEndTime + ", ticketPrice="
				+ ticketPrice + ", previewFlag=" + previewFlag + ", previewTitle=" + previewTitle + ", ticketOpenDate="
				+ ticketOpenDate + ", ticketOpenTime=" + ticketOpenTime + ", inviteActor=" + inviteActor
				+ ", screenContentRegDate=" + screenContentRegDate + "]";
	}

}
