package chTest;

public class Player {

    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    PlayerLevel getLevel(){
        return level;
    }

    void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    void play(int count){
        level.go(count);
    }
}
