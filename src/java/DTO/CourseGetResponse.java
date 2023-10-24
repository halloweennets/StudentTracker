/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author aefilms
 */
public class CourseGetResponse {

    private String courseId;
    private String instructorId;
    private String courseName;
    private int unit;

    public CourseGetResponse() {
    }

    public CourseGetResponse(String courseId, String instructorId, String courseName, int unit) {
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.unit = unit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "CourseGetResponse{" + "courseId=" + courseId + ", instructorId=" + instructorId + ", courseName=" + courseName + ", unit=" + unit + '}';
    }

}
