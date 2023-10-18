import java.util.Random;

public class MovieTitleGenerator {
    // Define an array containing all the movie titles

    private static final String[] actionMovieTitles = {
            "John Wick","John Wick 2"
    };
    private static final String[] horrorMovieTitles = {
            "Hereditary","It",
    };
    private static final String[] romanceMovieTitles = {
            "Titanic","John Wick 2"
    };
    private static final String[] sciFiMovieTitles = {
         "Interstellar", "Arrival"
    };
    private static final String[] docuDramaMovieTitles = {
            "Wolf of Wall Street","Just Go With It"
    };
    private static final String[] crimeMovieTitles = {
            "No Hard Feelings","Just Go With It"
    };
    private static final String[] mysteryMovieTitles = {
            "Inception","Shutter Island"
    };
    private static final String[] warMovieTitles = {
            "War Dogs","American Sniper"
    };
    private static final String[] fantasyMovieTitles = {
            "No Hard Feelings","Just Go With It"
    };
    private static final String[] funnyMovieTitles = {
            "The 40-Year-Old Virgin","Friday", "Rush Hour", "Rush Hour 2", "Rush Hour 3",
        "Pineapple Express","Superbad", "Ride Along", "Ride Along 2", "Get Hard", "Grown Ups",
        "This Is the End", "Grown Ups 2", "21 Jump Street", "22 Jump Street", "Hall Pass",
        "The Hangover", "Napoleon Dynamite", "Why Him?", "Neighbors", "Let’s Be Cops",
        "Daddy’s Home", "Scary Movie", "Big Time Adolescence", "Kick-Ass", "Paul Blart: Mall Cop"
    };

    public static String getRandomFunnyMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(funnyMovieTitles.length);

        // Return the random movie title
        return funnyMovieTitles[randomIndex];
    }
    public static String getRandomActionMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(actionMovieTitles.length);

        // Return the random movie title
        return actionMovieTitles[randomIndex];
    }
    public static String getRandomHorrorMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(horrorMovieTitles.length);

        // Return the random movie title
        return horrorMovieTitles[randomIndex];
    }
    public static String getRandomRomanceMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(romanceMovieTitles.length);

        // Return the random movie title
        return romanceMovieTitles[randomIndex];
    }
    public static String getRandomSciFiMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(sciFiMovieTitles.length);

        // Return the random movie title
        return sciFiMovieTitles[randomIndex];
    }
    public static String getRandomDocuDramaMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(docuDramaMovieTitles.length);

        // Return the random movie title
        return docuDramaMovieTitles[randomIndex];
    }
    public static String getRandomCrimeMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(crimeMovieTitles.length);

        // Return the random movie title
        return crimeMovieTitles[randomIndex];
    }
    public static String getRandomMysteryMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(mysteryMovieTitles.length);

        // Return the random movie title
        return mysteryMovieTitles[randomIndex];
    }
    public static String getRandomWarMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(warMovieTitles.length);

        // Return the random movie title
        return warMovieTitles[randomIndex];
    }
    public static String getRandomFantasyMovieTitle() {
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the movieTitles array
        int randomIndex = random.nextInt(fantasyMovieTitles.length);

        // Return the random movie title
        return fantasyMovieTitles[randomIndex];
    }


}
