package cat.flx.plataformes;

class Score {
    private static int score;

    public static int increaseScore() {
        return score += 10;
    }

    public static int getFinalScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int reduceScore() {return score -= 10;}
}
