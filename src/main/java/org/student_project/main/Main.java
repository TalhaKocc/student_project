package org.student_project.main;

import org.student_project.model.DataBase;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        DataBase.getConnection();

    }
}