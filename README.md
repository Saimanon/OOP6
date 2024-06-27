# принципы SOLID
### 1. Single Responsibility Principle (SRP)
Принцип единственной ответственности гласит, что каждый класс должен иметь только одну причину для изменения, т.е. класс должен отвечать только за одну задачу.
В данном проекте класс User нарушает SRP, так как он отвечает не только за представление пользователя, но и за его сохранение и отчет. Разделим эти обязанности между классами.

### 2. Open/Closed Principle (OCP)
Принцип открытости/закрытости гласит, что классы должны быть открыты для расширения, но закрыты для модификации. Это означает, что поведение класса можно изменять, не изменяя его исходный код.

### 3. Liskov Substitution Principle (LSP)
Принцип подстановки Лисков гласит, что объекты базового класса должны быть заменяемы объектами его подклассов без изменения корректности программы. В данном проекте нет наследования, поэтому этот принцип не применим.

### 4. Interface Segregation Principle (ISP)
Принцип разделения интерфейсов гласит, что клиенты не должны зависеть от интерфейсов, которые они не используют. Это значит, что лучше иметь несколько специализированных интерфейсов, чем один общий.

### 5. Dependency Inversion Principle (DIP)
Принцип инверсии зависимостей гласит, что модули верхнего уровня не должны зависеть от модулей нижнего уровня. Оба должны зависеть от абстракций. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
