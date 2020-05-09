package com.box.model;

import org.springframework.stereotype.Component;

@Component
public class Take {
	private int pick_id;
    private String pick_userTel;//收件方tel
    private int box_id;
    private String send_userTel;//寄件方tel
    private String pick_time;
	public int getPick_id() {
		return pick_id;
	}
	public void setPick_id(int pick_id) {
		this.pick_id = pick_id;
	}
	public String getPick_userTel() {
		return pick_userTel;
	}
	public void setPick_userTel(String pick_userTel) {
		this.pick_userTel = pick_userTel;
	}
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public String getSend_userTel() {
		return send_userTel;
	}
	public void setSend_userTel(String send_userTel) {
		this.send_userTel = send_userTel;
	}
	public String getPick_time() {
		return pick_time;
	}
	public void setPick_time(String pick_time) {
		this.pick_time = pick_time;
	}
}
