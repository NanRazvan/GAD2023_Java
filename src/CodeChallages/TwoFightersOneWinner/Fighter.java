package CodeChallages.TwoFightersOneWinner;

public class Fighter {
    private String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name,int health, int damagePerAttack) {

        this.name=name;
        if(health>0)
            this.health = health;
        else
            this.health = 100;
        this.damagePerAttack = damagePerAttack;

    }

    public void attack( Fighter opponent)
    {
        opponent.health = opponent.health - damagePerAttack;
    }
    @Override
    public String toString() {

        return this.name;
    }


    public int getHealth() {
        return this.health;
    }
}
