package ee.itcollege.headlines;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Headline {

	@Id
	@GeneratedValue
	private long id;
	
	private Date firstSeen;
	
	private String title;
	
	private String foundOnUrl;
	
	private String pointsToUrl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFirstSeen() {
		return firstSeen;
	}

	public void setFirstSeen(Date firstSeen) {
		this.firstSeen = firstSeen;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFoundOnUrl() {
		return foundOnUrl;
	}

	public void setFoundOnUrl(String foundOnUrl) {
		this.foundOnUrl = foundOnUrl;
	}

	public String getPointsToUrl() {
		return pointsToUrl;
	}

	public void setPointsToUrl(String pointsToUrl) {
		this.pointsToUrl = pointsToUrl;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", getFirstSeen(), getTitle());
	}
	
}
