package com.example;

import com.example.decorator.MockedDocument;
import com.example.decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MockedDocument mockedDocument = new MockedDocument();
        TimedDocument timedDocument = new TimedDocument(mockedDocument);
        System.out.println(timedDocument.parse());

    }
}