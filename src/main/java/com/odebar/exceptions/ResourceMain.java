package com.odebar.exceptions;

public class ResourceMain {
    public static void main(String[] args) throws ResourceException {
        Resource resource = new Resource();
        try {
            ResourceAction.load(resource);
        } catch (ResourceException e) {
            e.printStackTrace();
        }
    }
}
