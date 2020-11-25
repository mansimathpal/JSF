package grantuniversity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class CourseDetailsBean {

	private String courseName;
	private HtmlOutputText courseId, courseDuration, courseEligibility, courseFee;
	public CourseDetailsBean() { }
	public void CourseDetailsAction(ValueChangeEvent vce)
	{
		String id = vce.getNewValue().toString();
		String cId ="", cDuration="", cEligibility= "", cFee="";
		if (id.compareTo("Science")==0) {
			cId ="A-101";
			cDuration = "4 years";
			cEligibility ="70% in high school";
			cFee="$5000 p.a. ";
		}
		else if(id.compareTo("Law")== 0)
		{
			cId ="A-105";
			cDuration="5 year";
			cEligibility="60% in high school";
			cFee="$3000 p.a. ";
		}
		else if(id.compareTo("Medical")== 0)
		{
			cId ="A-115";
			cDuration="2 year";
			cEligibility="50% in high school";
			cFee="$5000 p.a. ";
		}
		getCourseId().setValue(cId);
		getCourseDuration().setValue(cDuration);
		getCourseEligibility().setValue(cEligibility);
		getCourseFee().setValue(cFee);
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public HtmlOutputText getCourseId() {
		return courseId;
	}
	public void setCourseId(HtmlOutputText courseId) {
		this.courseId = courseId;
	}
	public HtmlOutputText getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(HtmlOutputText courseDuration) {
		this.courseDuration = courseDuration;
	}
	public HtmlOutputText getCourseEligibility() {
		return courseEligibility;
	}
	public void setCourseEligibility(HtmlOutputText courseEligibility) {
		this.courseEligibility = courseEligibility;
	}
	public HtmlOutputText getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(HtmlOutputText courseFee) {
		this.courseFee = courseFee;
	}
}

