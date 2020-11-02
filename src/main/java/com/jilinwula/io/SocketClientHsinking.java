package com.jilinwula.io;

import java.io.*;
import java.net.Socket;

public class SocketClientHsinking {

    private static final String IP = "127.0.0.1";
    private static final Integer PORT = 9293;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(IP, PORT);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader userBufferedWriter = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String input = userBufferedWriter.readLine();
                bufferedWriter.write(input + "\n");
                bufferedWriter.flush();

                String message = bufferedReader.readLine();
                System.out.println(message);

                if (input == null) {
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
