package com.javatimetrial.app;

import org.junit.Test;
import static org.junit.Assert.*;
public class MiddleEarthTest {
    @Test
    public void testReverseString() {
        assertEquals("odorF", MiddleEarth.reverseString("Frodo"));
        assertEquals("mulloG", MiddleEarth.reverseString("Gollum"));
        assertEquals("", MiddleEarth.reverseString(""));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, MiddleEarth.countVowels("Frodo"));
        assertEquals(2, MiddleEarth.countVowels("Gollum"));
        assertEquals(5, MiddleEarth.countVowels("aeiou"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(MiddleEarth.isPalindrome("sagas"));
        assertFalse(MiddleEarth.isPalindrome("Frodo"));
        assertTrue(MiddleEarth.isPalindrome(""));
    }

    @Test
    public void testCapitalizeWords() {
        assertEquals("Frodo Baggins", MiddleEarth.capitalizeWords("frodo baggins"));
        assertEquals("Samwise Gamgee", MiddleEarth.capitalizeWords("samwise gamgee"));
        assertEquals("Middle Earth", MiddleEarth.capitalizeWords("middle earth"));
    }

    @Test
    public void testReplaceSpacesWithUnderscores() {
        assertEquals("frodo_baggins", MiddleEarth.replaceSpacesWithUnderscores("frodo baggins"));
        assertEquals("samwise_gamgee", MiddleEarth.replaceSpacesWithUnderscores("samwise gamgee"));
        assertEquals("middle_earth", MiddleEarth.replaceSpacesWithUnderscores("middle earth"));
    }

    @Test
    public void testRemoveVowels() {
        assertEquals("Frd", MiddleEarth.removeVowels("Frodo"));
        assertEquals("Gllm", MiddleEarth.removeVowels("Gollum"));
        assertEquals("", MiddleEarth.removeVowels("aeiou"));
    }

    @Test
    public void testSortCharacters() {
        assertEquals("Fdoor", MiddleEarth.sortCharacters("Frodo"));
        assertEquals("Gllmou", MiddleEarth.sortCharacters("Gollum"));
        assertEquals("EMaddehilrt", MiddleEarth.sortCharacters("Middle Earth"));
    }
}
