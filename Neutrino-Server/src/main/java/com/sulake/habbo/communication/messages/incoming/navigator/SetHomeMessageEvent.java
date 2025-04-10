package com.sulake.habbo.communication.messages.incoming.navigator;

import java.util.concurrent.FutureTask;

import neutrino.Environment;
import neutrino.MessageEvents.MessageEvent;
import neutrino.Network.ServerHandler;
import neutrino.UserManager.Habbo;

import com.sulake.habbo.communication.messages.outgoing.navigator.CanCreateNewRoomMessageComposer;
import com.sulake.habbo.communication.messages.outgoing.navigator.SetHomeMessageComposer;

public class SetHomeMessageEvent extends MessageEvent implements Runnable {
	private ServerHandler Client;
    private Environment Server;
    private FutureTask T;
    @Override
    public void Load(ServerHandler Client, Environment Server, FutureTask T) throws Exception
    {
        this.Client = Client;
        this.Server = Server;
        this.T = T;
    }
    
    public void run()
    {
    	try {
    		//Server.WriteLine("Hello world! We are on release " + Client.inreader.readUTF());
    		Habbo User = Client.GetSession();
    		SetHomeMessageComposer.Compose(Client, User);
    	} catch (Exception e)
    	{
    		Server.WriteLine(e);
    	}
    }
}