
import java.util.List;

/*Задание 1
 Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
•	добавления
•	удаления
•	поиска элемента по значению
•	поиска элемента по индексу
•	поиска максимального элемента
•	поиска минимального элемента
•	поиска среднего арифметического всех элементов
При этом:
•	при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
•	при удалении - уменьшают своё значение на удаляемый элемент
Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.
*/
public  class IncrementalCollection {
   public static void addElement(List list){
        for (int i = 0; i < list.size(); i++) {
            list.add(i, new Object());
        }
    }
    public static void removeElement(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(new Integer(5));
        }
    }

    public static void getElement(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void setElement(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, new Object());
        }
    }
}

