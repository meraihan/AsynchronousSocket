package com.asynchronous.SocketServer;

/**
 * Created by rayhan on 10/18/16.
 */

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8001);
        while (true) {
            Socket soc = ss.accept();
            RequestHandler rh = new RequestHandler(soc);
            rh.start();
        }
    }
}
