import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("There are 10 main genres of movies Action, Horror, Sci-Fi, \n" +
                "Romance, DocuDrama (Movies based on a true story, ex: Wolf of Wall Street), " +
                "Crime, " +
                "Mystery, " +
                "War, " +
                "Fantasy, and " +
                "Comedy");
        System.out.println("What genre of Movie would you like to watch?");
        String genre = s.next();
        if (genre.equalsIgnoreCase("Comedy"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomFunnyMovieTitle() +
                    "! Your stomach will hurt from laughing!");
        }
        else if (genre.equalsIgnoreCase("Action"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomActionMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("Horror"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomHorrorMovieTitle() +
                    "! Don't get too scared!");
        }
        else if (genre.equalsIgnoreCase("Sci-Fi"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomSciFiMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("scifi"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomSciFiMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("Romance"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomRomanceMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("DocuDrama"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomDocuDramaMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("Crime"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomCrimeMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("Mystery"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomMysteryMovieTitle() +
                    "! Good luck figuring this one out.");
        }
        else if (genre.equalsIgnoreCase("Fantasy"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomFantasyMovieTitle() + "!");
        }
        else if (genre.equalsIgnoreCase("War"))
        {
            System.out.println("Ale Recommends " + MovieTitleGenerator.getRandomWarMovieTitle() + "!");
        }


    }
}