import java.util.*;

/**
 * Represents a message with a Vigenere cipher. Essentially a nicer way to use the Vigenere class.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */
public class Message {
    
    /*
     * Instance fields.
     */
    
    private String text;
    private boolean encrypted;
    private boolean repeat;
    private int timesRepeated;
    
    
    /*
     * Constructors.
     */
    
    /**
     * Default constructor. For testing purposes.
     */
    public Message() {
        text = "Prepare yourself, winter is coming.";
        encrypted = this.isEncrypted();
    }
    
    /**
     * The only constructor you'll need.
     */
    public Message(String message) {
        text = message;
        encrypted = this.isEncrypted();
    }
    
    /**
     * Multiple encryption. Will do encrypt (or decrypt) multiple times.
     */
    public Message(String message, int times) {
        text = message;
        encrypted = this.isEncrypted();
        repeat = true;
        timesRepeated = times;
    }
    
    /*
     * Public methods.
     */
    
    /**
     * Converts a plain text message into cipher text and vice versa. It instantiates a new cipher, converts it, and destroys it.
     * 
     * @param   key  The key you want to use.
     * @return       Plain or cipher text.
     */
    public String convert(String key) {
        Vigenere cipher = new Vigenere(key);
        String result = "nil";
        
        if (encrypted) {
            if (repeat) {
                int counter = 0;
                
                while (counter <= timesRepeated) {
                    result = cipher.decrypt(text);
                    counter++;
                }
            }
            
            else {
                result = cipher.decrypt(text);
            }
        }
        
        else {
            if (repeat) {
                int counter = 0;
                
                while (counter <= timesRepeated) {
                    result = cipher.encrypt(text);
                    counter++;
                }
            }
            
            else {
                result = cipher.encrypt(text);
            }
        }
        
        return result;
    }
    
    /**
     * Converts a plain text message into cipher text and vice versa using existing cipher.
     * 
     * @param   key     The key you want to use.
     * @param   cipher  The Vigenere object you want to use.
     * @return          Plain or cipher text.
     */
    public String convert(Vigenere cipher) {
        String result = "nil";
        
        if (encrypted) {
            if (repeat) {
                int counter = 0;
                
                while (counter <= timesRepeated) {
                    result = cipher.decrypt(text);
                    counter++;
                }
            }
            
            else {
                result = cipher.decrypt(text);
                result = result.trim();
            }
        }
        
        else {
            if (repeat) {
                int counter = 0;
                
                while (counter <= timesRepeated) {
                    result = cipher.encrypt(text);
                    counter++;
                }
            }
            
            else {
                result = cipher.encrypt(text);
            }
        }
        
        return result;
    }

    
    /*
     * Helper methods.
     */
    
    /**
     * Checks if encrypted or not by seeing if there are spaces or not.
     * 
     * @return  True or false.
     */
    private boolean isEncrypted() {
        // Has no spaces.
        if (text.matches("\\w+")) {
            return true;
        }
        
        // Has spaces.
        else {
            return false;
        }
    }
}
