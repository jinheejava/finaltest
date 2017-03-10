package jinh.bbs.model;

import java.util.Date;

public class BbsDTO {
	
	private int idx;
	private String writer;
	private String pwd;
	private String subject;
	private String content;
	private java.util.Date joindate;
	private int readnum;
	private int ref;
	private int lev;
	private int sunbun;
	
	public BbsDTO() {
		super();
	}

	public BbsDTO(int idx, String writer, String pwd, String subject, String content, Date joindate, int readnum,
			int ref, int lev, int sunbun) {
		super();
		this.idx = idx;
		this.writer = writer;
		this.pwd = pwd;
		this.subject = subject;
		this.content = content;
		this.joindate = joindate;
		this.readnum = readnum;
		this.ref = ref;
		this.lev = lev;
		this.sunbun = sunbun;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public java.util.Date getJoindate() {
		return joindate;
	}

	public void setJoindate(java.util.Date joindate) {
		this.joindate = joindate;
	}

	public int getReadnum() {
		return readnum;
	}

	public void setReadnum(int readnum) {
		this.readnum = readnum;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

	public int getSunbun() {
		return sunbun;
	}

	public void setSunbun(int sunbun) {
		this.sunbun = sunbun;
	}
	
	
	

}
