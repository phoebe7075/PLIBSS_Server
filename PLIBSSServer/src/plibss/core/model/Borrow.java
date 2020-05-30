package plibss.core.model;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Borrow implements Serializable{
	private String userid;
	private String Bname;
	private String Lid;
	private LocalDateTime startTime;
	private LocalDateTime returnTime;
	private String state;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getLid() {
		return Lid;
	}
	public void setLid(String lid) {
		Lid = lid;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(LocalDateTime returnTime) {
		this.returnTime = returnTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
