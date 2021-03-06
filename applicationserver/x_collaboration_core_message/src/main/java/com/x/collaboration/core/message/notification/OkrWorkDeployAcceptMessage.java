package com.x.collaboration.core.message.notification;


public class OkrWorkDeployAcceptMessage extends NotificationMessage {

	public OkrWorkDeployAcceptMessage( String person, String workId, String workTitle, String messageContent ) {
		super( NotificationType.okrWorkDeployAccept, person );
		this.workId = workId;
		this.workTitle = workTitle;
		this.messageContent = messageContent;
	}

	private String workId;
	private String workTitle;
	private String messageContent;	
	
	public String getWorkId() {
		return workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}
	public String getWorkTitle() {
		return workTitle;
	}
	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
}
