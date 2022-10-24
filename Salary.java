public class Salary {
    public static void main(String[] args) {
        /*Напишите код который будет осуществлять следующую логику.
         Если сотрудник проработал от 1 до 3х лет в компании, его зарплата увеличивается на 10%,
          если от 3x и выше то 20%. Если в результате увеличения полученная ЗП меньше 4000 тысяч,
           сотруднику прибавляется бонус в размере 1000 ,
           а если 4000 и больше плюс 500.*/
        float time = 5;
        double salary = 4000;
       // salary = salary + 0.1 * salary;
        //System.out.println("Your salary is " + salary);
        if (time<1){System.out.println(" Your salary is " + salary);
    }
        else if (time>=1 && time<3){ salary= salary+0.1*salary;
            System.out.println("Your salary is " + salary);}
        else { salary= salary+0.2*salary;
            System.out.println("Your salary is " + salary);}
        if (salary<4000){salary= salary+1000;
            System.out.println("Your have a bonus " + 1000);
            System.out.println("Total " + salary+1000);}
        else {salary= salary+500;
            System.out.println("Your have a bonus " + 500);
            System.out.println("Total " + salary+500);}
}

    }