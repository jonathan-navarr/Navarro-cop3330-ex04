package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class Madlib
{
        public static void main(String[] args)
        {
                Scanner scnr = new Scanner(System.in);
                System.out.print("Enter a noun: ");
                        String noun = scnr.nextLine();
                System.out.print("Enter a verb: ");
                        String verb = scnr.nextLine();
                System.out.print("Enter a adjective: ");
                        String adjective = scnr.nextLine();
                System.out.print("Enter a adverb: ");
                        String adverb = scnr.nextLine();
                System.out.println("Do you " + verb+ " your "+ adjective + " " + noun + " " + adverb +"? That's hilarious!");
        }
        }
