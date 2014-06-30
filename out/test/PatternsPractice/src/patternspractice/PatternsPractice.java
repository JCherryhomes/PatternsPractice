/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patternspractice;

import Decorator.*;
import Observer.*;
import Strategy.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class PatternsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Decorator Practice");
        runDecoratorPractice();

//        System.out.println();
//
//        System.out.println("Observable Practice");
//        runObservablePractice();
//
//        System.out.println();
//
//        System.out.println("Strategy Practice");
//        runStrategyPractice();
    }
    
    /**
     * Runs code that exercises the decorator classes
     */
    public static void runDecoratorPractice(){
//        IBeverage coffee = new HouseBlend();
//        coffee = new MochaDecorator(coffee);
//        coffee = new WhippedDecorator(coffee);
//
//        System.out.println(coffee.getDescription());
//        System.out.printf("Cost: %s%n", coffee.getCost());

        String text = "This Is A Test";
        InputStream stream = new LowerCaseDecorator(new ByteArrayInputStream( text.getBytes() ));
        Scanner scanner = new Scanner(stream);

        System.out.println("Original: " + text);
        System.out.print("Converted: ");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
    }
    
    /**
     * Runs code that exercises the observer/observable classes
     */
    public static void runObservablePractice(){
        ObservableTicket ticket = new ObservableTicket();
        TicketEmailer emailer = new TicketEmailer();
        ticket.register(emailer);
        
        ticket.setTicketNumber(5);
        ticket.setTicketName("Ticket One");
        
        ticket.saveTicket();
    }

    /**
     * Runs code that exercises the strategy classes
     */
    public static void runStrategyPractice(){
        IWeapon sword = new Sword();
        IWeapon axe = new Axe();

        Strategy.Character hero = new Fighter(50, sword, "Fred");
        Strategy.Character target = new Fighter(8, axe, "Sam");

        hero.Attack(target);
        target.Attack(hero);

        System.out.println("Fred equips an axe.");
        hero.changeWeapon(axe);

        hero.Attack(target);
        target.Attack(hero);
    }
}
