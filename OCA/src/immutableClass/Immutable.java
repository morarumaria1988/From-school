
package immutableClass;

public class Immutable {
    
private StringBuilder builder;
public Immutable(StringBuilder b) {
builder = new StringBuilder(b);
}
public StringBuilder getBuilder() {
return new StringBuilder (builder);
} 

/*public NotImmutable(StringBuilder b) {
builder = b;
}
public String getBuilder() {
return builder;
}*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
Immutable problem = new Immutable(sb);
sb.append(" added");
StringBuilder gotBuilder = problem.getBuilder();
gotBuilder.append(" more");
System.out.println(problem.getBuilder());
    }
}
