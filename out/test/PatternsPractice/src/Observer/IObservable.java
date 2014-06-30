/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Jonathan
 * @param <T>
 */
public interface IObservable<T> {
    public void register(IObserver<T> observer);
    public void notifyObservers();
    public void remove(IObserver<T> observer);
}
