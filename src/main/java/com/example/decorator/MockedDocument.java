package com.example.decorator;

public class MockedDocument implements Document {
    @Override
    public String parse() {
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Mocked Document Parse";
    }
    
    
}
