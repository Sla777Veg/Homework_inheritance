public class Main {
    public static void main(String[] args) {
        //Задание 1
        Car Lada = new Car("Lada","Granta",1.7,"желтый",2015, "Россия", 150);
        System.out.println(Lada);

        Car Audi = new Car("Audi","A8 50 L TDI quattro", 3.0,"черный",2020,"Германия", 260);
        System.out.println(Audi);

        Car BMW = new Car("BMW","Z8,",3.0,"черный",2021, "Германия", 270);
        System.out.println(BMW);

        Car Kia = new Car("Kia","Sportage", 2.4,"красный",2018,"Южная Корея", 180);
        System.out.println(Kia);

        Car Hyundai  = new Car("Hyundai ","Avante", 1.6,"оранжевый",2016,"Южная Корея", 190);
        System.out.println(Hyundai );
        Lada.refill();
        Audi.refill();
        BMW.refill();
        Kia.refill();

        // Задание2
        Train Swallow = new Train("Ласточка", "B-901", null, 2011, null, 301, 3500, 0,
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        System.out.println(Swallow);
        Train Leningrad = new Train("Ленинград", "D-125",  null,  2019,
                null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(Leningrad);
        Swallow.refill();
        Leningrad.refill();

        //Задание 3
        Bus Mercedes = new Bus("Mercedes", "SCLK", "BLack", 2024, "Germany", 200);
        System.out.println(Mercedes);
        Bus Ferrari = new Bus("Ferrari", "F-500", "Red", 2023, "Italy", 210);
        System.out.println(Ferrari);
        Bus VAZ = new Bus("VAZ", "21-3000", "Yellow", 2050, "Russia", 400);
        System.out.println(VAZ);
        Mercedes.refill();
        Ferrari.refill();
        VAZ.refill();

        //Задание 4
        Herbivor herbivor1 = new Herbivor("Газель", 1, "Австралия", 25, "трава");
        System.out.println(herbivor1);
        Herbivor herbivor2 = new Herbivor("Жираф", 5, "Африка", 20, "трава");
        System.out.println(herbivor2);
        Herbivor herbivor3 = new Herbivor("Лошадь", 2, "Россия", 40, "трава");
        System.out.println(herbivor3);
        herbivor1.graze();
        herbivor2.graze();
        herbivor3.graze();

        System.out.println(herbivor1.equals(herbivor1));
        System.out.println(herbivor1.equals(herbivor2));

        Predator predator1 = new Predator("Гиена", 1, "Африка", 25, "почти все млекопитающие");
        System.out.println(predator1);
        Predator predator2 = new Predator("Тигр", 2, "Австралия", 35, "все травоядные");
        System.out.println(predator2);
        Predator predator3 = new Predator("Медведь", 3, "Россия", 15, "все травоядные");
        System.out.println(predator3);
        predator1.Hunt();
        predator2.Hunt();
        predator3.Hunt();

        System.out.println(predator1.equals(predator1));
        System.out.println(predator1.equals(predator2));


        Amphibian amphibian1 = new Amphibian("Лягушка", 1, "Россия");
        System.out.println(amphibian1);
        Amphibian amphibian2 = new Amphibian("Уж пресноводный", 2, "Белорусия");
        System.out.println(amphibian2);
        amphibian1.eat();
        amphibian2.eat();
        amphibian1.sleep();
        amphibian2.sleep();
        amphibian1.move();
        amphibian2.move();
        amphibian1.Hunt();
        amphibian2.Hunt();

        System.out.println(amphibian1.equals(amphibian1));
        System.out.println(amphibian1.equals(amphibian2));

        NotFlying notFlying1 = new NotFlying("Павлин", 6, "Африка", "по траве");
        System.out.println(notFlying1);
        NotFlying notFlying2 = new NotFlying("Пингвин", 3, "Антарктида", "по снегу");
        System.out.println(notFlying2);
        NotFlying notFlying3 = new NotFlying("Птица До-До", 4, "Австралия", "по траве");
        System.out.println(notFlying3);
        notFlying1.eat();
        notFlying2.eat();
        notFlying3.eat();
        notFlying1.sleep();
        notFlying2.sleep();
        notFlying3.sleep();
        notFlying1.move();
        notFlying2.move();
        notFlying3.move();
        notFlying1.Hunt();
        notFlying2.Hunt();
        notFlying3.Hunt();

        System.out.println(notFlying1.equals(notFlying1));
        System.out.println(notFlying1.equals(notFlying2));

        Flying flying1 = new Flying("Чайка", 2, "США", "по небу");
        System.out.println(flying1);
        Flying flying2 = new Flying("Альбатрос", 3, "Австралия", "по небу");
        System.out.println(flying2);
        Flying flying3 = new Flying("Сокол", 4, "Россия", "по небу");
        System.out.println(flying3);
        flying1.eat();
        flying2.eat();
        flying3.eat();
        flying1.sleep();
        flying2.sleep();
        flying3.sleep();
        flying1.move();
        flying2.move();
        flying3.move();
        flying1.Hunt();
        flying2.Hunt();
        flying3.Hunt();

        System.out.println(flying1.equals(flying1));
        System.out.println(flying1.equals(flying2));

    }
}