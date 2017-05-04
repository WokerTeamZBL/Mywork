package modle;

import java.util.Date;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books implements java.io.Serializable {

	// Fields

	private Integer id;
	private String author;
	private Integer status;
	private Date borrowdate;
	private Date backdate;
	private String name;
	private String bsn;
	private String reader;

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** full constructor */
	public Books(String author, Integer status, Date borrowdate, Date backdate,
			String name, String bsn, String reader) {
		this.author = author;
		this.status = status;
		this.borrowdate = borrowdate;
		this.backdate = backdate;
		this.name = name;
		this.bsn = bsn;
		this.reader = reader;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getBorrowdate() {
		return this.borrowdate;
	}

	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}

	public Date getBackdate() {
		return this.backdate;
	}

	public void setBackdate(Date backdate) {
		this.backdate = backdate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBsn() {
		return this.bsn;
	}

	public void setBsn(String bsn) {
		this.bsn = bsn;
	}

	public String getReader() {
		return this.reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

}