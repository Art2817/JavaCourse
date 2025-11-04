package Encapsulation;

public class Car
{
    public void start()
    {
        System.out.println("Починаємо  запуск");
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Успішно запущено");
    }

    private void startElectricity()
    {
        System.out.println("Електросистема запущена");
    }

    private void startCommand()
    {
        System.out.println("Командна система запущена");
    }

    private void startFuelSystem()
    {
        System.out.println("Паливна система запущена");
    }
}
