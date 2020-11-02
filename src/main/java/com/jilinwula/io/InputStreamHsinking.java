package com.jilinwula.io;

import java.io.*;

public class InputStreamHsinking {

    private static final String PATH = "/Users/jilinwula/IdeaProjects/jilinwula-linlangmall/jilinwula-hsinking-nio/src/main/resources";

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(PATH + "/txt.txt");
        byte [] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
    }
}
