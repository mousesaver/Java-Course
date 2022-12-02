package encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthyPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int healthyPercentage, String weapon) {
        this.fullName = fullName;
        if (healthyPercentage <= 0) {
            this.healthyPercentage = 1;
        } else if (healthyPercentage > 100) {
            this.healthyPercentage = 100;
        } else {
            this.healthyPercentage = healthyPercentage;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        healthyPercentage -= damage;
        if (healthyPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthyPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthyPercentage += extraHealth;
        if (healthyPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthyPercentage = 100;
        }
    }
}
