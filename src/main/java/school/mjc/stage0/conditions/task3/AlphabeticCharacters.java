package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            char ch = Character.toLowerCase(character);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
