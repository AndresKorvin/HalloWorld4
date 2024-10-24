package examples;//    класс Монстр: количество рук количество ног количество глаз
//            конструктор без парметров - по 2 глаза
//            второй конструктор 1 параметр - количество
//            3 - все три параметра
//    метод войс

public class Monster {
    int numberOfEyes;
    int numberOfHands;
    int numberOfLegs;

    Monster (int numberOfEyes, int numberOfHands, int numberOfLegs) {
        this.numberOfEyes = numberOfEyes;
        this.numberOfHands = numberOfHands;
        this.numberOfLegs = numberOfLegs;
    }

    Monster (int number) {
        this(number, number, number);
    }

    Monster () {
        this(2, 2, 2);
    }

    void voice() {
        voice(1);    }

    void voice(int count) {
        voice(count, "Grrrrrrrr...");
    }

    void  voice(int count, String roar) {
        for (int i = 0; i < count; i++) {
            System.out.println(roar);
        }
    }
}
