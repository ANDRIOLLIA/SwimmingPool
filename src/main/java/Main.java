public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int floodSpeed = 30;// литр/мин
        int noDrain = 10;// литр/мин
        int currentVolume = 0;
        int volumeTime = 0;
        while(currentVolume != volume){
            volumeTime++;
            currentVolume += floodSpeed;
            currentVolume -= noDrain;
        }
        System.out.println("Бассейн набрался за " + volumeTime + " мин.");
    }
}
