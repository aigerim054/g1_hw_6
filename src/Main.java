public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(40);
        boss.setDamage(35);
        System.out.println("Boss health : " + boss.getHp() + "\nboss damage : " + boss.getDamage());
        System.out.println(boss.printinfo());
        Skeleton skeleton = new Skeleton();
        skeleton.setArrow(20);
        Skeleton s1 = new Skeleton();
        s1.setArrow(17);
        System.out.println(skeleton.printInfo());
        System.out.println(s1.printInfo());
    }
}