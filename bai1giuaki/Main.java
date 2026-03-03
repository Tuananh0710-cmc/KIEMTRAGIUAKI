/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bai1giuaki;

/**
 *
 * @author panhh
 */

public class Main {

    public static void main(String[] args) {

        // Khởi tạo StudentManager<Student>
        studentmanager<student> manager = new studentmanager<>();

        // Thêm ít nhất 3 sinh viên
        manager.add(new student("S01", "An", 3.5));
        manager.add(new student("S02", "Binh", 3.8));
        manager.add(new student("S03", "Chi", 3.2));

        // Duyệt danh sách và in ra toàn bộ sinh viên
        System.out.println("Danh sách sinh viên:");

        for (student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}

