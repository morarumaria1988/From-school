package lambda_syntax;

public class Animal {

  
private String species;
private boolean canHop;
private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

@Override
    public String toString () {
        return species;
    }

    public boolean CanHop() {
        return canHop;
    }

    public boolean CanSwim() {
        return canSwim;
    }}
