package task.oop;

public class OOP {
    public static void main(String[] args) {
       // Parent.Manager man =new Parent.Manager("Коля",36,"продаж.");
       // man.job();
      // Parent.Child1 den = new Parent.Child1();
       //den.sum(10,5);
//Проверка github

    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
    //  1. Метод, принимающий 2 числа и возвращающий их сумму.
    //  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
    //  3. Метод, принимающий строку и возвращающий ее.
    //  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
    //  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.
    public static class Parent {
        public int sum(int a, int b) {
            return a + b;
        }

        public int summ(String a, int b) {
            int chislo = Integer.parseInt(a);
            return chislo + b;
        }

        public String strings(String str) {
            return str;
        }

        public void message() {
            System.out.println("I am Parent");
        }

        public String summa(String str, String str1) {
            return str + str1;
        }

        // TODO: Создайте класс Child1 и переопределите все 5 методов.
        //  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
        //  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
        //  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
        //  4. Четвертый метод выводит на экран "I am Child1".
        //  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.
        public  static class Child1 extends Parent {
            public int sum(int a, int b) {
                return b * a;
            }

            @Override
            public int summ(String a, int b) {
                int chislo = Integer.parseInt(a);
                return (chislo + b) * 2;
            }

            public String strings(String str) {
                return str.substring(0, 1);
            }

            @Override
            public void message() {
                System.out.println("I am Child1");
            }

            @Override
            public String summa(String str, String str1) {
                return (str1 + str).substring((str1 + str).length() / 2);
            }
        }

        // TODO: Создайте класс Child2 и перегрузите методы.
        //  1. Первый метод примет 3 числа и сложит их.
        //  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
        //  3. Третий метод примет две строки и вернет их конкатенацию.
        //  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
        //  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.
        public  static class Child2 extends Parent {
            public int sum(int a, int b, int c) {
                return a + b + c;
            }

            public int summ(String str1, String str, String str2) {
                int chislo = Integer.parseInt(str);
                int chislo1 = Integer.parseInt(str1);
                int chislo2 = Integer.parseInt(str2);
                return chislo + chislo1 + chislo2;
            }

            public String strings(String str, String str2) {
                return str + str2;
            }


            public void message(String str) {
                System.out.println(str + "I am Child2");

            }


            public String summa(String str, String str1, String str2) {
                return str1 + str + str2;
            }
        }

        // TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
        //  (например, метод для расчета площади).
        //  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.
        public static abstract class figure {
            public abstract double square();
        }

        public static class circule extends figure {
            private double rad;

            public circule(double rad) {
                this.rad = rad;
            }

            @Override
            public double square() {
                return rad * Math.PI * rad;
            }

            public class rectangle extends figure {
                private double s;
                private double v;

                public rectangle(double s ,double v) {
                    this.s = s;
                    this.v = v;
                }

                @Override
                public double square() {
                    return s * v;
                }
            }

            public class triangle extends figure {
                private double s;
                private double v;
                private double d;

                public triangle(double s, double v, double d) {
                    this.s = s;
                    this.v = v;
                    this.d = d;
                }

                @Override
                public double square() {
                    return Math.abs((s - v) * (v - s) - (s - d) * (d - s));
                }
            }
        }

        // TODO: Создайте абстрактный класс "Сотрудник", в котором определены общие характеристики для всех сотрудников (например, имя, возраст).
        //  Создайте подклассы для различных типов сотрудников (например, "Менеджер", "Работник склада"),
        //  в которых можно описать специфичные методы и свойства.
        public  static abstract class Employee {
            private String name;
            private int age;


            public Employee(String name, int age) {
                this.name = name;
                this.age = age;

            }

            public String getName() {
                return name;

            }

            public int getAge() {
                return age;
            }


            public abstract void job();
        }

        public static   class  Manager extends Employee{
            private String departement;
            public Manager(String name, int age, String departement) {
                super(name, age);
                this.departement = departement;
            }

            public String getDepartement() {
                return departement;
            }


            @Override
            public void job() {
                System.out.println("Менджер: "+getName()+ ", в возраст лет "+ getAge()+ " работает в отделе " +getDepartement());
            }
        }
        public  static  class Worker extends Employee{
private String classification;
            public Worker(String name, int age,String classification) {
                super(name, age);
                this.classification =classification;
            }

            public String getClassification() {
                return classification;
            }

            @Override
            public void job() {
                System.out.println("Работник склада "+ getName()+",в возраст "+ getAge()+ "в"+getClassification());
            }
        }
    }
}
