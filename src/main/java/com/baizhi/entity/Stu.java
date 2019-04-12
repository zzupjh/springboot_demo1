package com.baizhi.entity;

public class Stu {

    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private Integer stuGender;

    public Stu() {
    }

    public Stu(Integer stuId, String stuName, Integer stuAge, Integer stuGender) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuGender() {
        return stuGender;
    }

    public void setStuGender(Integer stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender=" + stuGender +
                '}';
    }
}
