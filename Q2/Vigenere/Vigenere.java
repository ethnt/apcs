import java.io.*;
import java.util.*;

/**
 * A simple Vigenere encryptor and decryptor. A Cipher, if you will.
 * 
 * @author Jake Schwartz, and not this eturk character.
 * @version 0.1.0
 */
public class Vigenere {
    
    /*
     * Instance fields.
     */
    
    private String plaintext;
    private String ciphertext;
    private char[] plain;
    private char[] crypted;
    private String key;
    
    
    /*
     * Constructors.
     */
    
    /**
     * Use English.
     */
    public Vigenere(String code) {
        key = this.cleanse(code);
        
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        plain = english;
        
        this.generateAlphabet();
    }
    
    /**
     * Another language.
     */
    public Vigenere(String code, char[] alphabet) {
        // TO-DO: check if key is secure enough.
        key = code;
        plain = alphabet;
        
        this.generateAlphabet();
    }
    
    /*
     * Public methods.
     */
    
    /**
     * Encrypts plain text.
     * 
     * @param  text   Plain text. The message you want to encrypt.
     * @return        Cipher text.
     */
    public String encrypt(String text) {
        text = text.replaceAll(" ", "");
        char[] textArray = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        
        // For each letter, convert to cipher and add to char array.
        for (char c : textArray) {
            builder.append(transform(c, false));
        }
        
        return builder.toString();
    }
    
    /**
     * Decrypts cipher text.
     * 
     * @param  text   Cipher text. The message you want to decrypt.
     * @return        Plain text.
     */
    public String decrypt(String text) {   
        char[] textArray = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        
        // For each letter, convert to plain and add to char array.
        for (char c : textArray) {
            builder.append(transform(c, true));
        }
        
        return builder.toString();
    }
    
    /**
     * Compares two ciphers.
     * 
     * @param  other  The other cipher.
     * @return        True or false.
     */
    public boolean compare(Vigenere other) {
       return true;
    }
    
    
    /*
     * Helper methods.
     */
    
    /**
     * Generates the cipher alphabet.
     * 
     * @return  Character array. The cipher alphabet.
     */
    private void generateAlphabet() {
        // Create new string with the key then the plain text alphabet.
        String plainalpha = new StringBuilder().append(key.toCharArray()).append(plain).toString();
        
        // Remove the repeated letters from the String.
        plainalpha = cleanse(plainalpha);
        
        // Set the cipher alphabet to the plainalpha string, converted to a char array.
        crypted = plainalpha.toCharArray();
    }
    
    /**
     * Transforms a single character and converts it into the cipher alphabet (or vice versa).
     * 
     * @param  letter     The letter to convert.
     * @param  encrypted  If true, will convert to plain. If false, will convert to cipher.
     * @return            The transformed character.
     */
    private char transform(char letter, boolean encrypted) {
        // encode or decode a letter
        // find location of letter in plain or crypted alphabet, get the letter at that location in other alphabet.
        char transformed;
        
        // Transform to plain text.
        if (encrypted) {
            int location = this.locate(crypted, letter);
            
            transformed = plain[location];
        }

        // Transform to crypted.
        else {
            int location = this.locate(plain, letter);
                
            transformed = crypted[location];
        }
        
        
        return transformed;
    }
    
    /**
     * Cleanses a String. Removes white space, punctuation, and repeats.
     * 
     * @param  text  The text you want to cleanse.
     * @return       Your String, sans white space, punctuation, and repeats;
     */
    private String cleanse(String text) {
        // Remove white space.
        //text = text.trim();
        
        // Change to lowercase.
        text = text.toLowerCase();
        
        // Replaces all letters that are not alpha.
        text = text.replaceAll("[^A-Za-z]", "");
        
        // Removes excess letters using formatter and returns.
        return text.replaceAll((String.format("(.)(?<=(?:(?=\\1).).{0,%d}(?:(?=\\1).))", text.length())), "");
    }
    
    /**
     * Searches the specified array of chars for the specified value without sorting.
     * 
     * @param  char[]  The array you are searching.
     * @param  char    The value you are searching for.
     * @return         The int location of the value in the array.
     */
    private int locate(char[] array, char value) {
        int result = 0;
        
        // Loop through every character in array.
        for (int i = 0; i < array.length; i++) { // TO-DO: Use foreach looping.
            
            // If it's a match, set result to the index.
            if (array[i] == value) {
                result = i;
            }
        }
        
        return result;
    }

}
