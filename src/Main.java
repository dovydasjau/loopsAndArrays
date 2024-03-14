import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        System.out.println("----------------1.------------------");

        String name = "Bryan";
        String surname = "Cranston";

        if (name.length() > surname.length()) {
            System.out.println(surname);

        } else if (surname.length() > name.length()) {
            System.out.println(name);
        } else {
            System.out.println("both names are the same length");
        }


        System.out.println("----------------2.------------------");

        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        System.out.println("----------------3.------------------");

        String Initials = name.substring(0, 1) + surname.substring(0, 1);
        System.out.println(Initials);

        System.out.println("----------------4.------------------");

        int a = name.length();
        int b = surname.length();


        String l3 = name.substring(a - 3, a) + surname.substring(b - 3, b);

        System.out.println(l3);

        System.out.println("----------------5.------------------");

        String movieTitle = "Breaking Bad";
        String sTitle = movieTitle.replaceAll("[aA]", "*");
        System.out.println(sTitle);

        System.out.println("----------------6.------------------");

        String aaa = movieTitle.replaceAll("[aeiouAEIOU]", "");
        String movie2 = "Breakfast at Tiffany's";
        String movie3 = "2001: A Space Odyssey";
        String movie4 = "It's a Wonderful Life";

        System.out.println(aaa + "\n" + movie2.replaceAll("[aeiouAEIOU]", "") + "\n" + movie3.replaceAll("[aeiouAEIOU]", "") + "\n" + movie4.replaceAll("[aeiouAEIOU]", ""));

        System.out.println("----------------7.------------------");

        String starWars = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";

        System.out.println(starWars);
        starWars = starWars.replaceAll("[^0-9]+", " ");
        starWars = starWars.trim();
        System.out.println("Number: " + starWars);

        System.out.println("----------------8.------------------");

        String idk = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";

        String[] words = idk.split(" ");
        int countwords = 0;
        for (String word : words) {
            if (word.length() <= 5) {
                countwords++;
            }
        }
        System.out.println("Number of words with 5 letters or less: " + countwords);

        String idk2 = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
        words = idk2.split(" ");
        countwords = 0;
        for (String word : words) {
            if (word.length() <= 5) {
                countwords++;
            }
        }
        System.out.println("Number of words with 5 letters or less: " + countwords);

        System.out.println("----------------9.------------------");

        String randomString = "";
        for (int i = 0; i < 3; i++) {
            char randomChar = (char) ('a' + Math.random() * 26);
            randomString += randomChar;
        }
        System.out.println("Random string: " + randomString);

        System.out.println("----------------10.------------------");

        String[] words1 = idk.split(" ");
        String[] words2 = idk2.split(" ");

        //sujungiami zodziai is abieju sakiniu
        String[] combinedWords = new String[words1.length + words2.length];
        System.arraycopy(words1, 0, combinedWords, 0, words1.length);
        System.arraycopy(words2, 0, combinedWords, words1.length, words2.length);

        //shuffling sentences
        for (int i = combinedWords.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temp = combinedWords[i];
            combinedWords[i] = combinedWords[j];
            combinedWords[j] = temp;
        }

        //selecting 10 words (no repetition)
        String[] selectedWords = new String[10];
        Arrays.fill(selectedWords, "");
        int count = 0;
        for (String word : combinedWords) {
            if (!Arrays.asList(selectedWords).contains(word) && count < 10) {
                selectedWords[count++] = word;
            }
        }

        for (String word : selectedWords) {
            System.out.print(word + " ");
        }


    }
}