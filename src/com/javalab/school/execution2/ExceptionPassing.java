package com.javalab.school.execution2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionPassing {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
            // FileNotFoundException을 여기서 처리합니다.
        }
    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // 파일 내용을 읽습니다...
    }
}