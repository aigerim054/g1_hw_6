public class Boss extends GameEntity {
    private weapen BossWeapen;

    public weapen getBossWeapen() {
        return BossWeapen;
    }

    public void setBossWeapen(weapen bossWeapen) {
        BossWeapen = bossWeapen;
    }
    public String printinfo(){
        return "Boss health : " + this.getHp() + "\nboss damage : " + this.getDamage();
    }
}
