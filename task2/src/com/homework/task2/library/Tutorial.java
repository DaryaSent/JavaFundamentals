package com.homework.task2.library;

import java.util.Objects;

public class Tutorial extends Book {
    int schoolClass;
    String subject;

    public void Tutorial(){
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutorial tutorial = (Tutorial) o;
        return schoolClass == tutorial.schoolClass &&
                subject.equals(tutorial.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolClass, subject);
    }

    @Override
    public String toString() {
        return super.toString() + "schoolClass= " + schoolClass+ "\t"+ " subject= " + subject;

    }
}
