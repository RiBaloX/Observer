/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author kant2
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}
