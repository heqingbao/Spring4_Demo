package com.hqb.spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by heqingbao on 2017/6/3.
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
