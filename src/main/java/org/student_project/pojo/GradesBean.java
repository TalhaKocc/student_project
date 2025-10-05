package org.student_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GradesBean {
    private int id;
    private StudentBean student;
    private CoursesBean courses;
    private double grade;
}
