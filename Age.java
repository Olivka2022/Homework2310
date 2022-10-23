public class Age {
    public static void main (String[] args) {
//Используя конструкцию if..else, напишите код, который получает число(возраст),
// если число меньше 0 - выводить неверный возрас, от 0 - 18 вы еще не совершеннолетний,
// 18 и выше вы стали взрослым
// 0 - неверно
// 0-18 - несовершеннолетний
// 18+ - взрослый
           int age=-2;
        if (age<0)
        {System.out.println(" Attention! Incorrectly entered age");}
        else if (age >= 0 && age < 18) {
            System.out.print(" You are still a minor");}
        else {System.out.print(" You have become an adult");}
}
}
