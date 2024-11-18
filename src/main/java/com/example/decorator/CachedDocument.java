package com.example.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CachedDocument implements Document {
    private Document document;
    @Override
    public String parse() {
        return document.parse();
    }
 
    
}
