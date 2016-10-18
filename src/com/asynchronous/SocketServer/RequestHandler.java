package com.asynchronous.SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by rayhan on 10/18/16.
 */
public class RequestHandler extends Thread {
    Socket soc;
    public RequestHandler(Socket soc){
        this.soc=soc;
    }
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            double a = dis.readDouble();
            double b = dis.readDouble();
            double c = a+b;

            dos.writeDouble(c);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
