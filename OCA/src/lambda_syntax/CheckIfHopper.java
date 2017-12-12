package lambda_syntax;

public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
return a.CanHop();
    }
    
}
