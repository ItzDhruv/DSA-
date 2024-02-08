public class Q_6_MOVIE_RATING {
    public static void main(String[] args) {
        Movie m1 = new Movie("kgf", "r m");
        Movie m2 = new Movie("abc", "r m", "5 Star");
        Movie m3 = new Movie("xyz", "r m", "3 Star");
        Movie m4 = new Movie("owj", "r m");
        Movie m5 = new Movie("kjc", "r m", "5 Star");
        Movie[] movies = new Movie[5];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        movies[3] = m4;
        movies[4] = m5;
        Movie ans[]=getmovies(movies);
        for(Movie m:ans){
            if(m==null){
                return;
            }
            System.out.println(m.title+" ");
        }
    }
    public static Movie[] getmovies(Movie[] movies) {
Movie ans[]=new Movie[movies.length];
int k=0;
for(Movie i : movies )
{

    if(i.rating == "5 Star")
    {
        ans[k]=i;
        k++;
    }
}
return  ans;
    }

}
class Movie {
    public String title;
    private String studio;
    public String rating;
    public  Movie(String title,String  studio,String rat)
    {
        this.title=title;
        this.studio=studio;
        rating=rat;
    }
    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        rating="5 Star";
    }

}