package day7;

public class Player {
    int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina -= 1;
            if (this.stamina == MIN_STAMINA) {
                countPlayers -= 1;
            }
        }
    }

     public static void info() {
        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }

    public static int getCountPlayers(){
        return countPlayers;
    }
}
