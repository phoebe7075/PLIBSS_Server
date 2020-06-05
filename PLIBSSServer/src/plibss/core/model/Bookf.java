package plibss.core.model;
import java.io.Serializable;
public class Bookf implements Serializable{
	private String userid;
	private String Lid;
	private String Bname;
	public Bookf(String ui,String lid,String bn)
	{
		this.userid=ui; this.Lid=lid;this.Bname=bn;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getLid() {
		return Lid;
	}
	public void setLid(String lid) {
		Lid = lid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
}
