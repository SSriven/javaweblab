package com.box.model;

import org.springframework.stereotype.Component;

@Component
public class Save {
	private int send_id;
    private String send_userTel;//寄件方tel
    private int box_id;
    private String pick_userTel;//收件方tel
    private int random_code;
    private String send_time;
	public int getSend_id() {
		return send_id;
	}
	public void setSend_id(int send_id) {
		this.send_id = send_id;
	}
	public String getSend_userTel() {
		return send_userTel;
	}
	public void setSend_userTel(String send_userTel) {
		this.send_userTel = send_userTel;
	}
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public String getPick_userTel() {
		return pick_userTel;
	}
	public void setPick_userTel(String pick_userTel) {
		this.pick_userTel = pick_userTel;
	}
	public int getRandom_code() {
		return random_code;
	}
	public void setRandom_code(int random_code) {
		this.random_code = random_code;
	}
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
}
