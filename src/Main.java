public class Main {
    public static void main(String[] args) {


        System.out.println("----------------1.------------------");

        String name = "Bryan";
        String surname = "Cranston";

        if (name.length() > surname.length()){
            System.out.println(surname);

        }else if (surname.length() > name.length()) {
            System.out.println(name);
        }else {
            System.out.println("both names are the same length");
        }


        System.out.println("----------------2.------------------");

        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        System.out.println("----------------3.------------------");

        String Initials = name.substring(0,1) + surname.substring(0,1);
        System.out.println(Initials);

        System.out.println("----------------4.------------------");

        int a = name.length();
        int b = surname.length();


        String l3 = name.substring(a-3,a) + surname.substring(b-3,b);

        System.out.println(l3);

        System.out.println("----------------5.------------------");

        String movieTitle = "Breaking Bad";
        String sTitle = movieTitle.replaceAll("[aA]","*");
        System.out.println(sTitle);

        System.out.println("----------------6.------------------");

        String aaa = movieTitle.replaceAll("[aeiouAEIOU]","");
        String movie2 = "Breakfast at Tiffany's";
        String movie3 = "2001: A Space Odyssey";
        String movie4 = "It's a Wonderful Life";

        System.out.println(aaa + "\n" + movie2.replaceAll("[aeiouAEIOU]","") + "\n" + movie3.replaceAll("[aeiouAEIOU]","") + "\n" + movie4.replaceAll("[aeiouAEIOU]",""));

        System.out.println("----------------7.------------------");

        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";

        System.out.println(starWars);

        //System.out.println("Number: " + number);

//        System.out.println(name.contains("a"));
//        System.out.println(name.contains("h"));
//        System.out.println(name.toLowerCase());
//        System.out.println(name);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(5));
//        System.out.println(name.length());
//        System.out.println(name.repeat(10));
//        System.out.println(name.equals("naglis"));
//        System.out.println(name.trim());
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(1,5));
//        System.out.println(name.replace("a","i"));
//        System.out.println(name.replaceFirst("a","i"));
//        System.out.println(name.replace("a","O").replace("i","U"));
//
//
//        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(episode);

    }
}