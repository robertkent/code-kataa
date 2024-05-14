import unittest
from middle_earth_story import (
    reverse_string,
    count_vowels,
    is_palindrome,
    capitalize_words,
    replace_spaces_with_underscores,
    remove_vowels,
    sort_characters
)

class TestLotrStory(unittest.TestCase):
    def test_reverse_string(self):
        self.assertEqual(reverse_string("Frodo"), "odorF")
        self.assertEqual(reverse_string("Gollum"), "mulloG")
        self.assertEqual(reverse_string(""), "")

    def test_count_vowels(self):
        self.assertEqual(count_vowels("Frodo"), 2)
        self.assertEqual(count_vowels("Gollum"), 2)
        self.assertEqual(count_vowels("aeiou"), 5)

    def test_is_palindrome(self):
        self.assertTrue(is_palindrome("sagas"))
        self.assertFalse(is_palindrome("Frodo"))
        self.assertTrue(is_palindrome(""))

    def test_capitalize_words(self):
        self.assertEqual(capitalize_words("frodo baggins"), "Frodo Baggins")
        self.assertEqual(capitalize_words("samwise gamgee"), "Samwise Gamgee")
        self.assertEqual(capitalize_words("middle earth"), "Middle Earth")

    def test_replace_spaces_with_underscores(self):
        self.assertEqual(replace_spaces_with_underscores("frodo baggins"), "frodo_baggins")
        self.assertEqual(replace_spaces_with_underscores("samwise gamgee"), "samwise_gamgee")
        self.assertEqual(replace_spaces_with_underscores("middle earth"), "middle_earth")

    def test_remove_vowels(self):
        self.assertEqual(remove_vowels("Frodo"), "Frd")
        self.assertEqual(remove_vowels("Gollum"), "Gllm")
        self.assertEqual(remove_vowels("aeiou"), "")

    def test_sort_characters(self):
        self.assertEqual(sort_characters("Frodo"), "Fdoor")
        self.assertEqual(sort_characters("Gollum"), "Gllmou")
        self.assertEqual(sort_characters("Middle Earth"), "EMaddehilrt")

if __name__ == "__main__":
    unittest.main()
