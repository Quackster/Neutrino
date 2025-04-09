/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutrino.Requests;

import neutrino.Environment;
import neutrino.Network.ServerHandler;

import java.util.concurrent.FutureTask;

public abstract class Handler {
    public abstract void Load(ServerHandler Main, Environment Server, FutureTask T) throws Exception;
}
