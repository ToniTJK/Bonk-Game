package cat.flx.plataformes;

public class Lifes {
    private static int life = 3;

    public static int getLife() {
        return life;
    }

    public static int recudeLifes(){
        return life -= 1;
    }
}
