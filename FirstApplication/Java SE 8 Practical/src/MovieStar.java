
public class MovieStar implements Comparable<MovieStar> {

    private String name;
    private int topTenList;

    public MovieStar(String name, int topTenList) {
        this.name = name;
        this.topTenList = topTenList;

    }

    @Override
    public String toString() {
        return "MovieStar{" + "name=" + name + ", topTenList=" + topTenList + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gettopTenList() {
        return topTenList;
    }

    public void settopTenList(int topTenList) {
        this.topTenList = topTenList;
    }

    @Override
    public int compareTo(MovieStar o) {
//        return o.gettopTenList() - this.gettopTenList();
   
       return (this.name).compareTo(o.getName());

    }
}
