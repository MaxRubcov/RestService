import ru.netology.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int income = 100000; // заработал
        int expenses = 60000; // потратил
        int threshold = 150000; // сумма на счете для отдыха
                int count = service.calculate(income, expenses, threshold);
        System.out.println(count);
    }
}

