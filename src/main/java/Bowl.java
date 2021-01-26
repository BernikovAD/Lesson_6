public class Bowl {
    public int fullness;

    public int getFullness() {
        return fullness;
    }
    public boolean FullnessBoolean() {
         return fullness>0;
    }
    public void setFullness(int fullness) {
        this.fullness += fullness;
        if (fullness>0){
            System.out.println("Миску пополнили на " + this.fullness);
        }
        else  System.out.println("Миска опустела.Теперь в ней " + this.fullness);
    }
}
