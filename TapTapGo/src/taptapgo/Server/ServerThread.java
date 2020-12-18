/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taptapgo.Server;

import java.util.concurrent.Callable;


public class ServerThread extends Thread{
    int port;
    EchoMultiServer server;

    public ServerThread(int port) {
        this.port = port;
    }
    
    @Override
    public void run(){
        server = new EchoMultiServer();
        server.start(port);
    }
    
    public void stopServer(){
        server.stop();
    }
    
}
