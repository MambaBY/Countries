/*
Задача 21. Коллекции. Ключи, значения, вхождения. Данные о странах.
Нужно:
а. создать коллекцию countryMap типа HashMap, куда как "ключи-значения" добавить 4 пары "страна-столица";
б. создать метод, который выводит ключи коллекции в целом и по одному через итератор;
в. создать метод, который выводит значения коллекции в целом и по одному через итератор;
г. создать метод, который выводит вхождения коллекции в целом и по одному через итератор;
д. создать метод, который выводит вхождения коллекции по парам "ключ-значение".
 */
public class Main {
    public static void main(String[] args) {
        Contries contries =new Contries();
        contries.printAllKeys();

        System.out.println();
        contries.printAllValues();

        System.out.println();
        contries.printCollectionEntries();

        System.out.println();
        contries.printCollectionEntriesKeyValue();








    }
}