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
public abstract class EmailObserver<T> implements IObserver<T> {
    public abstract void sendEmail();
}
