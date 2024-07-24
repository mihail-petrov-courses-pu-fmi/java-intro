# Среща 7 - Тернарен оператор, условни конструкции (switch-case), методи printf() и String.format()
 
#### 💡 Какво разгледахме днес
- Тернарен оператор: BooleanExpression ? Value1: Value2; 
- Пример: String examResult = score < 60 ? "Fail" : "Pass"; 
- Условна конструкция switch-case 
- Оператор break 
- Форматиране на изход в конзолата чрез System.out.printf(FormatString, ArgumentList) и String.format(FormatString, ArgumentList) 
- Структура на спецификаторите за форматиране: %[flags][width][.precision]conversion 
- % — всички спецификатори започват със знак % 
- flags — след символа % може да има един или повече незадължителни флагове (те карат стойността да бъде форматирана по различни начини - показване на числа със запетая, допълване на числа с водещи нули, ляво/дясно подравняване) 
- width — след всички флагове можете да посочите минимално поле 
- .precision — ако стойността е число с плаваща запетая можете да посочите точността. Това е броя на десетичните знаци, до които трябва да се закръгли числото 
- conversation — всички спецификатори на формат трябва да завършват с преобразуване знак, като f за плаваща запетая или d за десетично цяло число 
- Форматиране на числа с плаваща запетая чрез: %f 
- Форматиране на целочислени чрез: %d 
- Форматиране на низове чрез: %s 
- Пример: double sales = 12345.67; System.out.printf("Our sales are %f for the day.\n", sales); 
- Пример: double temp = 78.42819; System.out.printf("The temperature is %.2f degrees.\n", temp); 
- Пример: int hours = 40; System.out.printf("I worked %d hours this week.\n", hours); 
- Пример: int number = 200; System.out.printf("The number is:%6d", number); 
- Пример: System.out.printf("%-10s", name); 
- работа с клас Random 
- Пример: Random random = new Random(); random.nextInt(4);

<!-- #### 🔗 Полезни линкове -->

#### 🕹️ Ресурси и материали
- [Сорс код от срещата](./cw/)
- [Домашна работа](./hw/)