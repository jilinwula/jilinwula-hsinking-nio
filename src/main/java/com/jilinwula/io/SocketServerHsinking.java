package com.jilinwula.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerHsinking {

    private static final Integer PORT = 9293;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(String.format("收到客户端连接：%s", socket.getRemoteSocketAddress()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String message = null;

                while ((message = bufferedReader.readLine()) != null) {
                    // 读取客户端发送的消息
                    System.out.println("客户端[" + socket.getPort() + "]: " + message);

                    bufferedWriter.write("服务器: " + message + "\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
