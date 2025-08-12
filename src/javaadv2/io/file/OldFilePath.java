package javaadv2.io.file;

import java.io.File;
import java.io.IOException;

public class OldFilePath {

    public static void main(String[] args) throws IOException {
        File file = new File("temp/..");
        System.out.println("path = " + file.getPath());

        // 절대 경로
        System.out.println("Absolute path = " + file.getAbsolutePath());
        // 정규 경로
        System.out.println("Canonical path = " + file.getCanonicalPath());

        // 현재 경로에 있는 모든 파일 또는 디렉토리를 반환한다.
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println((f.isFile() ? "F" : "D") + " | " + f.getName());
        }
    }
}
