package homework;
//Создание объектов UserReporter и Persister для выполнения соответствующих задач.
//DIP: В будущем можно легко изменять поведение сохранения и отчетов, не изменяя класс User
public class Main {
    public static void main(String[] args){
        User user = new User("Bob");
        UserReporter reporter = new UserReporter(user);
        Persister persister = new Persister(user);

        // Теперь обязанности разделены между разными классами
        reporter.report();
        persister.save();
    }
}