package model;

public class Kotik {
    private static int count = 0;

    private String name;
    private String meow;
    private int prettiness;
    private int weight;
    private int satiety;

    public Kotik(){
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow){
        this.prettiness=prettiness;
        this.name=name;
        this.weight=weight;
        this.meow=meow;
        this.satiety=10;
        count++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness=prettiness;
        this.name=name;
        this.weight=weight;
        this.meow=meow;
        this.satiety=10;
    }

    public boolean play(){
        if (isHungry()){
            askForFood();
            return false;
        }
        System.out.println(name + " играет");
        satiety--;
        return true;
    }

    public boolean sleep(){
        if (isHungry()){
            askForFood();
            return false;
        }
        System.out.println(name + " спит");
        satiety--;
        return true;
    }

    public boolean chaseMouse(){
        if (isHungry()){
            askForFood();
            return false;
        }
        System.out.println(name + " преследует мышь");
        satiety-=2;
        return true;
    }

    public boolean wash(){
        if (isHungry()){
            askForFood();
            return false;
        }
        System.out.println(name + " умывается");
        satiety--;
        return true;
    }

    public boolean scratching(){
        if (isHungry()){
            askForFood();
            return false;
        }
        System.out.println(name + " царапает мебель");
        satiety--;
        return true;
    }

    private void askForFood(){
        System.out.println(name + " хочет есть, необходимо покормить");
    }

    private boolean isHungry(){
        return satiety<1;
    }

    public void eat(int foodUnits){
        System.out.println(name + " кушает");
        System.out.println("Сытость восстановлена на " + foodUnits + "единиц");
        satiety+=foodUnits;
    }

    public void eat(int foodUnits, String foodName){
        System.out.println(name + " съел " + foodName );
        System.out.println("Сытость восстановлена на " + foodUnits + " единиц");
        satiety+=foodUnits;
    }

    public void eat(){
        eat(5, "корм");
    }

    public void liveAnotherDay(){
        for (int i=1; i<=24; i++){
            System.out.println("Час " + i + ": ");
            int randomAction = (int) (Math.random()*5)+1;
            boolean actionPerfomed=false;

            switch (randomAction){
                case 1:
                    actionPerfomed=play();
                    break;
                case 2:
                    actionPerfomed=sleep();
                    break;
                case 3:
                    actionPerfomed=chaseMouse();
                    break;
                case 4:
                    actionPerfomed=wash();
                    break;
                case 5:
                    actionPerfomed=scratching();
                    break;
                default:
                    System.out.println(name + "ничего не делает");
                    break;
            }
            if (!actionPerfomed){
                eat();
            }
        }
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String getMeow(){
        return meow;
    }

    public int getPrettiness(){
        return prettiness;
    }

    public int getSatiety(){
        return satiety;
    }

    public static int getCount() {
        return count;
    }
}
