package com.example.receiveactivemqmessages;

import java.io.Serializable;

public class Message1 implements Serializable {
    private String title;
    private String msgBody;
    //private LocalDate localDate;

    public Message1(final String title, final String msgBody) {
        this.title = title;
        this.msgBody = msgBody;
        //this.localDate = localDate;
    }

    public Message1() {

    }

    @Override
    public String toString() {
        return "Message1{" + "title='" + title + '\'' + ", msgBody='" + msgBody + '\'' + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(final String msgBody) {
        this.msgBody = msgBody;
    }

    //public LocalDate getLocalDate() {
    //    return localDate;
    //}

    //public void setLocalDate(final LocalDate localDate) {
    //    this.localDate = localDate;
    //}
}
