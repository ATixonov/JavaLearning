package ru.synergy.javalearning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException

    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        /*{
        System.out.println("input 2 numbers and summary");
        System.out.println("---------------------------");

        int a=0, b=0;

        Scanner in = new Scanner(System.in);

        System.out.println("input first number: ");
        a = in.nextInt();

        System.out.println("input second number");
        b = in.nextInt();

        System.out.println("summary: " + (a + b));
    }*/


        Scanner in = new Scanner(System.in);
        double value = in.nextDouble();

        if( value%2 == 0){

            System.out.println("chetnoe");
        } else System.out.println("nechet");

    }
    }