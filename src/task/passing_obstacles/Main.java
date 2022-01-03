package task.passing_obstacles;

class Main {
    public static void main(String[] args) {

    // * 1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
    // * 2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    // * 3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
    // * 4.У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    // * 5*.Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

    Actions[] actions = new Actions[3];
        actions [0] = new Human("Vika", 10000, 1);
        actions [1] = new Cat ("Kosta", 1000, 1);
        actions [2] = new Robot ("Sasha", 10, 0);

        Barrier [] barriers = new Barrier[2];
        barriers[0] = new Road("беговая дорожка ", 10000);
        barriers[1] = new Wall("стена ", 1);

        start(actions, barriers);

    }

    static void start (Actions [] actions, Barrier [] barriers) {
        for (int i = 0; i < actions.length; i++) {

            for (int j = 0; j < barriers.length; j++) {


                if (barriers[j].moving(actions[i])) {
                    System.out.println("Участник " + actions[i].getName() + " успешно проходит препятствие " + barriers[j].getName());
                }
                if (!(barriers[j].moving(actions[i]))) {
                    System.out.println("Участник " + actions[i].getName() + " не смог пройти препятствие " + barriers[j].getName() + " и выбывает из гонки");
                    break;}


            }
        }
    }



}
