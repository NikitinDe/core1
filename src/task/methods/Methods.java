package task.methods;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String str = "АААААа";
        String string1 = "5";
        int[] massiv = {2, 2, 2, 4};
        boolean boolean2 = true;
        boolean boolean1 = true;
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        int a = 350;
        int max = 1000;
        int b = 2;
        //   System.out.println(booleanGo(string,a));
        System.out.println(exeption(boolean1,boolean2));
        // System.out.println(Arrays.toString(sumArray(massiv)));
        //System.out.println(vozrast(a)+ " Месяцев");
        //System.out.println(arrays(massiv));
    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int sumInteger(int a, int b) {
        return a + b;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String sumString(String string, String string1) {
        return string + string1;
    }

    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой
    public static String sumToString(String string, String string1) {
        int pervoe = Integer.parseInt(string);
        int vtoroe = Integer.parseInt(string1);
        return String.valueOf(pervoe + vtoroe);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean booleanGo(String string, int a) {
        int one = Integer.parseInt(string);
        boolean b = one < a;
        return b;
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
    public static boolean exeption(boolean boolean1, boolean boolean2) {
       return (boolean1 == false || boolean2 == false) ;


    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean chetnoe(int num) {
        return num % 2 == 0 ;


    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
//  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String array(int[] massiv) {
        boolean god = true;
        boolean goodbay = true;
        for (int num:massiv) {
            if (num % 2 != 0) {
                god = false;
            } else {
                goodbay = false;
            }

        }
        if (goodbay) {
            return "Массив четных чисел";
        } else if (god) {
            return "Массив  не четных чисел";
        } else {

        }
        return "Массив четных и не четных чисел";
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] arrayNumbers(int[] massiv) {
        int[] arrays = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = arrays[i];
        }
        return arrays;
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int[] sumArray(int[] massiv) {
        int sum = 0;
        for (int num : massiv) {
            sum += num;
        }
        return new int[]{sum};

    }


    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцев так же сделайте перевод возраста в минуты и метод который расчитает возраст в часах
    public static int ageInMonths(int age) {
        return age * 12;
    }

    public static long minutes(int age) {
        return age * 365 * 24 * 60;
    }

    public static long hours(int age) {
        return age * 365 * 24;
    }

    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static String name(String string, String string1) {
        return String.valueOf(string.equalsIgnoreCase(string1));
    }

    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int arrays(int[] massiv) {
        return massiv[massiv.length - 1];
    }

    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int schetcik(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'А' || str.charAt(i) == 'а') {
                sum++;
            }
        }
        return sum;
    }


    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
     public static int money = 100;
     public static int value=0;

    public static int wallet( int value,int money) {
        while (money > 0 && value<=100){
            money-=20;
            value++;
        }
        return money;
    }
}