package com.mifan.guessingapi.request.callback;

import java.io.Serializable;

public class CallbackRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String messageId;

    private String type;

    private String content;

    private String pushTime;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }
}
