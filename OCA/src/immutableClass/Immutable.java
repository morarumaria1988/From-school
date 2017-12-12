
package immutableClass;

//pag 208 mijloc

//public class NotImmutable {
public class Immutable {
   private StringBuilder builder; 

   public Immutable (StringBuilder b){
       builder=new StringBuilder(b);
   }
//    public NotImmutable(StringBuilder b) {
//        builder =b;
//    }
   
//    public StringBuilder getBuilder() {
//        return builder;
//    }
    
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }
    //also for immutable:
//    public String getValue() {
//        return builder.toString();
//    }
    public static void main(String[] args) {
StringBuilder sb=new StringBuilder("initial");
Immutable problem=new Immutable(sb);
//NotImmutable problem=new NotImmutable(sb);
sb.append(" added");
StringBuilder gotBuilder=problem.getBuilder();
gotBuilder.append(" more");
System.out.println(problem.getBuilder());
        
    }

    
}
