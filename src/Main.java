public class Main {
    public static void main(String[] args) {
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = secondBoxer + firstBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе между бойцами " + differenceWeight + " кг");
        var difference = secondBoxer % firstBoxer;
        System.out.println("Разница в весе между бойцами " + difference + " кг");
        var totalHours = 640;
        var timeWorker = 8;
        var totalWorker = totalHours / timeWorker;
        System.out.println("Всего работников в компании " + totalWorker + " чел");
        var newWorker = totalWorker + 94;
        var timeWorkerNew = totalHours / newWorker;
        System.out.println("Если в компании работает " + newWorker + " человек, то всего " + timeWorkerNew + " часов работы может быть поделено между сотрудниками");



    }
}
