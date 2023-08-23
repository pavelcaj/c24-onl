package lesson7.hospital;

public class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Cлушает и думает");
    }

    public void planHeal(Patient patient) {
        if (patient.getPlanHeal() == 1) {
            System.out.println("Терапевт, назначаю вам хирурга");
        }
        if (patient.getPlanHeal() == 2){
            System.out.println("Терапевт, назначаю вам дантиста");
        }
        if (patient.getPlanHeal() >= 3){
            System.out.println("Я ваш врач мне нужно подумать");
        }
    }
}
