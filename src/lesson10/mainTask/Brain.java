package lesson10.mainTask;

public class Brain {
    public static void firstForNumber(StringBuilder documentNumberBuilder) {
        for (int i = 0; i < 13; i++) {
            if (Character.isDigit(documentNumberBuilder.charAt(i))) {
                System.out.print(documentNumberBuilder.charAt(i));
            }
        }
        System.out.println();
    }

    public static void star(StringBuilder doc) {
        for (int i = 0; i < doc.length(); i++) {
            if (!Character.isDigit(doc.charAt(i)) && doc.charAt(i) != '-' && 17 > i) {
                System.out.print("*");
            } else {
                System.out.print(doc.charAt(i));
            }
        }
        System.out.println();
    }

    public static void onlyLetter(StringBuilder doc) {
        StringBuilder output = new StringBuilder("Letters:");
        for (int i = 0; i < doc.length(); i++) {
            if (!Character.isDigit(doc.charAt(i)) && doc.charAt(i) != '-') {
                output.append(Character.toUpperCase(doc.charAt(i)));
            }
        }
        output.insert(11, '/');
        output.insert(15, '/');
        output.insert(17, '/');
        System.out.println(output.toString());
    }

    public static void checkABC(StringBuilder doc) {
        String sequenceToCheck = "abc";
        if (doc.indexOf(sequenceToCheck) != -1) {
            System.out.println("Номер документа содержит последовательность 'abc' или 'ABC'.");
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc' или 'ABC'.");
        }
    }

    public static void checkBegin555(StringBuilder doc) {
        String sequenceToCheck = "555";
        if (doc.indexOf(sequenceToCheck) == 0) {
            System.out.println("Номер документа начинается с последовательности '555'.");
        } else {
            System.out.println("Номер документа не начинается с последовательности '555'.");
        }
    }

    public static void checkEnd(StringBuilder doc) {
        String sequenceToCheck = "1a2b";
        int documentLength = doc.length();
        int sequenceLength = sequenceToCheck.length();
        if (documentLength >= sequenceLength) {
            StringBuilder endOfString = new StringBuilder(doc.substring(documentLength - sequenceLength));
            if (endOfString.toString().equals(sequenceToCheck)) {
                System.out.println("Номер документа заканчивается последовательностью '1a2b'.");
            } else {
                System.out.println("Номер документа не заканчивается последовательностью '1a2b'.");
            }
        } else {
            System.out.println("Номер документа короче, чем последовательность '1a2b', поэтому не может заканчиваться ей.");
        }
    }
}
