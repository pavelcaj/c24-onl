package lesson6.ATM;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        boolean b = true;

        while (b) {

            System.out.println("Здравствуйту, что бы вы хотели сделать?");
            System.out.println("1: Внесни средства");
            System.out.println("2: Снять средства");
            System.out.println("3: Получить информацию о банкомате");
            System.out.println("4: Покинуть банкомат");

            System.out.println("Введите число что-бы выполнить действие ");
            int x = Logic.logic();

            if (x > 5 && x < 0) {

                System.out.println("Введите число что-бы выполнить действие ");

            } else {

                switch (x) {

                    case 1:
                        atm.addMoney();
                        break;

                    case 2:
                        atm.widrawMoney();
                        break;

                    case 3:
                        atm.info();
                        break;

                    case 4:
                        b = false;
                        break;
                }
            }
        }
    }
}
