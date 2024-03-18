package cs151exercise;

import javafx.scene.image.Image;

public class Student {
    private String name;
    private Image studentPhoto;
    private int studentId;

    public Student(String name, Image studentPhoto, int studentId) {
        this.name = name;
        this.studentPhoto = studentPhoto;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(Image studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
