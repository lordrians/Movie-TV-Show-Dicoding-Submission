package com.example.submision2.object;

import java.util.ArrayList;

public class dtTvShow {
    private static String[] judul = {
            "The Filthy Frank Show",
            "Breaking Bad",
            "Game of Thrones",
            "Rick and Morty",
            "Cosmos",
            "The Wire",
            "Sherlock",
            "Avatar: The Last Airbender",
            "The Sopranos",
            "The Mandalorian"
    };

    private static String[] episode = {
            "177 Eps",
            "62 Eps",
            "73 Eps",
            "41 Eps",
            "26 Eps",
            "60 Eps",
            "15 Eps",
            "66 Eps",
            "86 Eps",
            "9 Eps"
    };

    private static String[] genre = {
            "Short, Comedy, Fantasy",
            "Crime, Drama, Thriller",
            "Action, Adventure, Drama",
            "Animation, Adventure, Comedy",
            "Documentary",
            "Crime, Drama, Thriller",
            "Crime, Drama, Mystery",
            "Animation, Action, Adventure",
            "Crime, Drama",
            "Action, Adventure, Sci-Fi"
    };

    private static String[] rilis = {
            "5 August 2011",
            "20 January 2008",
            "17 April 2011",
            "2 December 2013",
            "9 March 2014",
            "2 June 2002",
            "25 July 2010",
            "21 February 2005",
            "10 January 1999",
            "12 November 2019"
    };

    private static String[] rate = {
            "9,5",
            "9,5",
            "9,4",
            "9,3",
            "9,3",
            "9,3",
            "9,1",
            "9,2",
            "9,2",
            "9,1"
    };

    private static String[] ratecount = {
            "31.297",
            "1.282.858",
            "1.608.565",
            "302.505",
            "100.925",
            "255.824",
            "734.850",
            "202.134",
            "264.761",
            "32.934"
    };

    private static String[] shortdesc = {
            "Filthy Frank and his disease ridden friends talk about various topics and take part in multiple life-threatening shenanigans.",
            "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.",
            "Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.",
            "An animated series that follows the exploits of a super scientist and his not-so-bright grandson.",
            "An exploration of our discovery of the laws of nature and coordinates in space and time.",
            "The Baltimore drug scene, as seen through the eyes of drug dealers and law enforcement.",
            "A modern update finds the famous sleuth and his doctor partner solving crime in 21st century London.",
            "In a war-torn world of elemental magic, a young boy reawakens to undertake a dangerous mystic quest to fulfill his destiny as the Avatar, and bring peace to the world.",
            "New Jersey mob boss Tony Soprano deals with personal and professional issues in his home and business life that affect his mental state, leading him to seek professional psychiatric counseling.",
            "The travails of a lone bounty hunter in the outer reaches of the galaxy, far from the authority of the New Republic."
    };

    private static String[] sinopsis = {
            "There was once a time where universe had galaxies. Now the Omniverse has universes. Where time and genetics have become currency and a source of power, and only the strongest deities can hope to survive the vast emptiness. And as time and space progressively expands, we have no choice but to stick together. One of few remaining humans attempts to survive the dangers of the Omniverse and its ruler Chin Chin with his Lycra-infested allies.",
            "When chemistry teacher Walter White is diagnosed with Stage III cancer and given only two years to live, he decides he has nothing to lose. He lives with his teenage son, who has cerebral palsy, and his wife, in New Mexico. Determined to ensure that his family will have a secure future, Walt embarks on a career of drugs and crime. He proves to be remarkably proficient in this new world as he begins manufacturing and selling methamphetamine with one of his former students. The series tracks the impacts of a fatal diagnosis on a regular, hard working man, and explores how a fatal diagnosis affects his morality and transforms him into a major player of the drug trade. Written by WellardRockard, jackenyon",
            "In the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea. Written by Sam Gray",
            "An animated series on adult-swim about the infinite adventures of Rick, a genius alcoholic and careless scientist, with his grandson Morty, a 14 year-old anxious boy who is not so smart. Together, they explore the infinite universes; causing mayhem and running into trouble. Written by Ruben Galaviz",
            "Join the heroic quest for knowledge as we set course for the stars with the twenty-first century reboot of Cosmos. Hosted by world-renowned astrophysicist Neil deGrasse Tyson, this thirteen-part ground-breaking series will venture to new worlds, trace our roots back to the hearts of ancient stars, and travel across the universe for a vision of the cosmos on the grandest scale. Written by Agustín Garden",
            "Set in Baltimore, this show centers around the city's inner-city drug scene. It starts as mid-level drug dealer, D'Angelo Barksdale beats a murder rap. After a conversation with a judge, Det. James McNulty has been assigned to lead a joint homicide and narcotics team, in order to bring down drug kingpin Avon Barksdale. Avon Barksdale, accompanied by his right-hand man Stringer Bell, enforcer Wee-Bey and many lieutenants (including his own nephew, D'Angelo Barksdale), has to deal with law enforcement, informants in his own camp, and competition with a local rival, Omar, who's been robbing Barksdale's dealers and reselling the drugs. The supervisor of the investigation, Lt. Cedric Daniels, has to deal with his own problems, such as a corrupt bureaucracy, some of his detectives beating suspects, hard-headed but determined Det. McNulty, and a blackmailing deputy. The show depicts the lives of every part of the drug \"food chain\", from junkies to dealers, and from cops to politicians. Written by ahmetkozan",
            "In this modernized version of the Conan Doyle characters, using his detective plots, Sherlock Holmes lives in early 21st century London and acts more cocky towards Scotland Yard's detective inspector Lestrade because he's actually less confident. Doctor Watson is now a fairly young veteran of the Afghan war, less adoring and more active. Written by KGF Vissers",
            "The world is divided into four elemental nations: The Northern and Southern Water Tribes, the Earth Kingdom, the Fire Nation, and the Air Nomads. The Avatar upholds the balance between the nations, but everything changed when the Fire Nation invaded. Only the Avatar, master of all four elements, can stop them. But when the world needs him most, he vanishes. A hundred years later Katara and Sokka discover the new Avatar, an airbender named Aang. Together they must help Aang master the elements and save the world. Written by Kevin Jeremiah Gaona",
            "An innovative look at the life of fictional Mafia Capo Tony Soprano, this serial is presented largely first person, but additional perspective is conveyed by the intimate conversations Tony has with his psychotherapist. We see Tony at work, at home, and in therapy. Moments of black comedy intersperse this aggressive, adult drama, with adult language, and extreme violence. Written by ahmetkozan",
            "After the stories of Jango and Boba Fett, another warrior emerges in the Star Wars universe. The Mandalorian is set after the fall of the Empire and before the emergence of the First Order. We follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic."
    };

    private static String[] poster = {
            "https://m.media-amazon.com/images/M/MV5BODcwZTA1MjUtZGE4Ny00NGFkLWI1ZWQtNmEzMjY4YzIyZGM0XkEyXkFqcGdeQXVyNjk1MTE5Mzk@._V1_SY1000_SX675_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,718,1000_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjRiNDRhNGUtMzRkZi00MThlLTg0ZDMtNjc5YzFjYmFjMmM4XkEyXkFqcGdeQXVyNzQ1ODk3MTQ@._V1_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZTk5OTQyZjYtMDk3Yy00YjhmLWE2MTYtZmY4NTg1YWUzZTQ0XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNjc1NzYwODEyMV5BMl5BanBnXkFtZTcwNTcxMzU1MQ@@._V1_SY1000_CR0,0,735,1000_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMWY3NTljMjEtYzRiMi00NWM2LTkzNjItZTVmZjE0MTdjMjJhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTQ4NTc5OTU@._V1_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzZlZmQyYTgtOWNmMy00NTNhLTgyOTYtNjhiOTllOGU2MDg5XkEyXkFqcGdeQXVyMjYxMzY2NDk@._V1_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZGJjYzhjYTYtMDBjYy00OWU1LTg5OTYtNmYwOTZmZjE3ZDdhXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UY268_CR3,0,182,268_AL_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMWI0OTJlYTItNzMwZi00YzRiLWJhMjItMWRlMDNhZjNiMzJkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SY1000_CR0,0,675,1000_AL_.jpg"
    };

    private static String[] trailer = {
            "kvYzA8rvfOw",
            "1JLUn2DFW4w",
            "70V1aWbmlwo",
            "WNhH00OIPP0",
            "4j-PzuxcKcc",
            "9qK-VGjMr8g",
            "xK7S9mrFWL4",
            "Wo85qZm-Zuk",
            "u9qpFgAa52U",
            "_YMh_SLnNIg"
    };

    public static ArrayList<TvShow> getData(){
        ArrayList<TvShow> list = new ArrayList<>();
        for (int i = 0; i < judul.length; i++){
            TvShow tvShow = new TvShow();
            tvShow.setJudul(judul[i]);
            tvShow.setEpisode(episode[i]);
            tvShow.setGenre(genre[i]);
            tvShow.setRilis(rilis[i]);
            tvShow.setRate(rate[i]);
            tvShow.setRatecount(ratecount[i]);
            tvShow.setShortdesc(shortdesc[i]);
            tvShow.setSinopsis(sinopsis[i]);
            tvShow.setPoster(poster[i]);
            tvShow.setTrailer(trailer[i]);
            list.add(tvShow);
        }
        return list;
    }
}
