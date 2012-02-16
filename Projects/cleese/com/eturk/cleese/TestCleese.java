package com.eturk.cleese;

/**
 * Write a description of class TestCleese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCleese {

    public static void main(String[] args) {
        
        // What I would like Cleese to be.
        
        Map options = new HashMap();
        options.put("layout", "application");
        
        Cleese application = Cleese.new(options);
        
        application.get("/") {
            render = "index";
        }
        
        application.post("/create") {
            System.out.println(params.name);
            redirect = "/";
        }
        
    }

}
