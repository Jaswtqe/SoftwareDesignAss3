package H;

public class Main {
    public static void main(String[] args) {
        // Создаем компьютер
        ComputerCase computerCase;
        computerCase = new ComputerCase();

        // Создаем адаптер и передаем компьютер
        Monitor adapter;
        adapter = new Monitor(computerCase);

        // Клиентский код может использовать монитор с HDMI
        Monitor monitor;
        monitor = adapter;
        monitor.display();
    }
}