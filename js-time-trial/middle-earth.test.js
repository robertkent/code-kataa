import {
  reverseString,
  countVowels,
  isPalindrome,
  capitalizeWords,
  replaceSpacesWithUnderscores,
  removeVowels,
  sortCharacters,
} from "./middle-earth";
describe("Middle Earth", () => {
  test("reverseString", () => {
    expect(reverseString("Frodo")).toBe("odorF");
    expect(reverseString("Gollum")).toBe("mulloG");
    expect(reverseString("")).toBe("");
  });

  test("countVowels", () => {
    expect(countVowels("Frodo")).toBe(2);
    expect(countVowels("Gollum")).toBe(2);
    expect(countVowels("aeiou")).toBe(5);
  });

  test("isPalindrome", () => {
    expect(isPalindrome("sagas")).toBe(true);
    expect(isPalindrome("Frodo")).toBe(false);
    expect(isPalindrome("")).toBe(true);
  });

  test("capitalizeWords", () => {
    expect(capitalizeWords("frodo baggins")).toBe("Frodo Baggins");
    expect(capitalizeWords("samwise gamgee")).toBe("Samwise Gamgee");
    expect(capitalizeWords("middle earth")).toBe("Middle Earth");
  });

  test("replaceSpacesWithUnderscores", () => {
    expect(replaceSpacesWithUnderscores("frodo baggins")).toBe("frodo_baggins");
    expect(replaceSpacesWithUnderscores("samwise gamgee")).toBe(
      "samwise_gamgee"
    );
    expect(replaceSpacesWithUnderscores("middle earth")).toBe("middle_earth");
  });

  test("removeVowels", () => {
    expect(removeVowels("Frodo")).toBe("Frd");
    expect(removeVowels("Gollum")).toBe("Gllm");
    expect(removeVowels("aeiou")).toBe("");
  });

  test("sortCharacters", () => {
    expect(sortCharacters("Frodo")).toBe("Fdoor");
    expect(sortCharacters("Gollum")).toBe("Gllmou");
    expect(sortCharacters("Middle Earth")).toBe("EMaddehilrt");
  });
});
