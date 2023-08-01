package by.pvt.hw3.repository;

import by.pvt.hw3.domain.Good;
import by.pvt.hw3.domain.User;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GoodRepository extends FileWorker {
    public static List<Good> goodList = new ArrayList<>();
    public static String way = "C:\\Project Java\\by.pvt.hw3\\by.pvt.core\\src\\main\\java\\by\\pvt\\hw3\\data\\Good.txt";

    public GoodRepository() {
    }
    public Good addGood(Good good) {
        goodList = update();
        goodList.add(good);
        serializeObject(goodList, way);
        return good;
    }

    public void deleteGood(Good good) {
        goodList = update();
        goodList.remove(good);
        saveUser();
    }



    public List<Good> showAllGood() {
        System.out.println(deserializeObject(way));
        return goodList;
    }


    public Good findIDGood(int id) {
        List<Good> users = update();
        Optional<Good> good1 = goodList.stream().filter(good -> good.getId() == id).findFirst();
        try {
            if (good1.isEmpty()) {
                System.out.println("Такого id не существует");
            } else {
                System.out.println(good1.get());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return good1.get();
    }


    public void saveUser() {
        serializeObject(goodList, way);
        update();

    }

    public List<Good> update() {
        Object object = deserializeObject(way);
        List<Good> good = new ArrayList<>();
        if (object instanceof List<?>) {
            good = (List<Good>) object;
        }
        return good;
    }
}
