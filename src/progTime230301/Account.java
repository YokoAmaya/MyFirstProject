package progTime230301;

//Представь, что ты разрабатываешь банковское приложение. Объяви класс Account: в нём будет храниться логика работы банковского счёта.
//Добавь поля класса: название счёта accountName со значением "Текущий" и баланс balance со значением 880.75.
//Напиши метод refill, чтобы пользователи могли пополнить баланс. Метод должен принимать в качестве параметра сумму в рублях double sum и увеличивать баланс на эту сумму.

public class Account {
    private String accountName = "Текущий";
    private double balance = 880.75;

    private void refill(double sum) {
        balance += sum;
    }

}
