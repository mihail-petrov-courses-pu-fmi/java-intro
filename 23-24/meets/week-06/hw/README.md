🟦 **домашна работа 6**
# Майстор Шеф

## ВЪВЕДЕНИЕ

В селото на предприемчивите комари царял социален мир. Всички прослойки на обществото, от презрените бълхи до аристократичните мухи, добрували успешно. Старата буржоа, отдавна загърбила търканията си с политическите си опоненти, стоножките, които дълго време отказвали да се събуват, когато отивали на гости в домовете на своите смъртни врагове и цапали, ръчнотъканите им килими, без капка свян. Но както става в приказките, един ден всичко се променило. Инженерните умове на калинките създали изкуствен интелект, който бързо си проправил път до нископлатените, социално презрени и обществено важни професии, доминирани от мравки и търтеи. Бюрото по торта се напълнило с безделници, което заплашвало да застраши крехката икономика на селото. Заплахата създала напрежение сред бедните и бурно одобрение сред заможните собственици на едър капитал.

Прогресивна фирма от млади молци решили да върнат спокойствието в региона. Създали некомпетентен робот, помощник-готвач, който за сметка на своя интелигентен конкурент, можел да извършва полу-успешно много малък набор от задачи за твърде дълго време. Целта на начинанието било да се срине авторитетът на робо-помощниците, като се залее пазара с нереалистично скъпи и безполезни алтернативи на висшия разум, с цел заблуда на врага.

Последното болтче било сложено. Оставало само да се напише софтуерът. Верни на своята природа, младите буболечки изпратили SMS на свои състуденти от невидимия университет, вярвайки че само те могат да напълнят програмата им с бъгове. Връчили спецификацията и започнали да потриват доволно антени в очакване на бъдещия провал.

## СПЕЦИФИКАЦИЯ

Инструкциите на робота са дефинирани като набор от функционалности, които съдържат определени насоки и изисквания при реализацията на софтуерния ъпдейт. Функционалностите са основни и допълнителни.
- основни функционалности - трябва да се изпълнят, за да работи програмата;
- допълнителни функционалности - зависят от основната.

### **ФУНКЦИОНАЛНОСТ 1**

За да бъде приведен в експлоатация, роботът трябва да получи детайлна информация за състоянието на кухненското оборудване, финансовото състояние на ресторанта и купища информация, която без никакво съмнение е кражба на лична информация. 

Роботът изисква от нас да въведем информация за кухнята и персонала. Компанията, производител на софтуера, ни е дала въпросник с 10 задължителни и 5 опционални въпроса, които трябва да бъдат зададени с помощта на командния ред и отговорени чрез същия. 

**Задължителни въпроси**
- Колко тигана има в кухнята?
- Колко тенджери има в кухнята?
- Колко сантиметра е широка кухнята?
- Колко сантиметра е дълга кухнята?
- Колко сантиметра е висока кухнята?
- Как се казва главният готвач?
- Колко готвачи работят в кухнята?
- Колко сервитьори работят в ресторанта?
- Как се казва отговорника на сосовете ?
- Каква е минималната температура в кухнята?
- Каква е максималната температура в кухнята? 
- Колко парички имате в банковата си сметка?
- Колко парички е дневният оборот на ресторанта ви? 
- В колко часа отваряте?
- В колко часа затваряте?

Опционалните въпроси **се задават само ако потребителят желае да отговаря на всички тях**.

Системата трябва да ви попита, дали искате да отговорите и ако отговорът е положителен, те се задават, а ако отговорът е отрицателен, те не се задават.
- Разполагате ли с хладилник?
- Разполагате ли с газов котлон?
- Разполагате ли с конвектомат?
- Разполагате ли с електрическа скара?
- Разполагате ли с аспиратор?

Ако потребителят **НЕ желае** да отговаря на опционалните въпроси, се приема че софтуерът няма информация за отговорите и кухнята не разполага с изброените уреди.


### **ФУНКЦИОНАЛНОСТ 2**

Софтуерът ни е революционен. След като отговорите на всички въпроси, той ви дава възможност да си изберете какво ястие искате да ви приготви. Имате избор от три различни вида ястия:
- Месно ястие;
- Вегетарианско ястие;
- Десерт.

### **ФУНКЦИОНАЛНОСТ 2.1**  (Потребителят избира МЕСО)

Месото има грамаж, като роботът може да готви само в три разновидности на порциите:
- малка порция (450 грама)
- средна порция (750 грама)
- голяма порция (950 грама)

*Потребителят трябва да избере едно от посочените, като при избора можете да дадете на потребителя възможност да въведе номер на опцията или да измислите друг начин.*

Месото има 3 начина на приготвяне:
- RARE
- MEDIUM
- WELL DONE

Обаче, има уловка, всяка една от степените зависи от определени обстоятелства в кухнята:

За да можете да приготвите **RARE** месо трябва, да са **изпълнени всичките условия:**
- в кухнята **няма** газов котлон;
- в кухнята има електрическа скара;
- температурата на въздуха е в интервала от 36 до 48 градуса;
- има аспиратор;
- избрана е малка порция.

За да можете да приготвите **MEDIUM** месо трябва, **да е налице едно от следните условия:**
- в кухнята има конвектомат;
- в кухнята има персонал от точно 5 човека;
- избрана е  средна порция;
- името на главния готвач е Иван.

За да можете да приготвите **WELL DONE** месо трябва, **едно от тези условия да е изпълнено**:
  - кухнята работи до 22:00;
  - отговорникът на сосовете се казва Петър или Радо.

<span style="color: #ff0000">**И**</span>

**едно от тези условия**:
  - кухнята е с квадратура 45 квадратни метра;
  - в кухнята има точно 3 тигана или точно 2 тенджери.


### **ФУНКЦИОНАЛНОСТ 2.2** (Потребителят избира ВЕГЕТАРИАНСКО)

Има три вида ястия, които можете да приготвите:
- ВЕГЕТАРИАНСКО;
- ВЕГАНСКО;
- ПЕСКАТЕРИАНСКО.

---
**Приготвяне на ВЕГЕТАРИАНСКО**

За да приготвите това ястие трябва, да е изпълнено **ЕДНО** от посочените условия:
- **НЯМАТЕ** конвектомат;
- **НЯМАТЕ** скара;
- **НЯМАТЕ** аспиратор;


---
**Приготвяне на ВЕГАНСКО**

За да приготвите това ястие трябва, да са изпълнени **ВСИЧКИ** условия:
- да имате хладилник;
- главният готвач да се казва Манол;
- да имате 3-ма или повече готвачи, но по-малко от 11 готвачи;
- да имате брой сервитьори различно от 7.

---
**Приготвяне на ПЕСКАТЕРИАНСКО**

За да приготвите това ястие трябва, да е изпълнено **едно от следните условия**:
  - трябва да имате скара;
  - трябва да сте отговорили на **опционалните въпроси**.

<span style="color: #ff0000">**И**</span>

**едно от следните условия**:
  - трябва кубатурата на вашата кухня да е по-малка от 13 кубични метра;
  - сумата от парите в банковата ви сметка и оборота за деня трябва да са по-малко от 158 000 парички.

### **ФУНКЦИОНАЛНОСТ 2.3** (Потребителят избира ДЕСЕРТ)

Има два вида десерти, които можете да приготвите:
- ТОРТА
- СЛАДОЛЕД

При избор на десерт, задължително попитайте клиента дали е пристрастен към захарта.

**Приготвяне на ТОРТА**

За да приготвите торта трябва да са изпълнени **всички изброени**:
- трябва да имате хладилник;
- трябва да работите точно до 19 часа;
- трябва да **НЯМАТЕ** аспиратор;
- трябва да имате между 15 000 и 50 000 парички в банката.

<span style="color: #ff0000">**ИЛИ**</span>

трябва да е изпълнено:
- главният готвач да се казва Румен.

**Приготвяне на СЛАДОЛЕД**

Ако клиентът избере сладолед, първо му предложете един от следните три вкуса:
- ягода;
- банан;
- ванилия.

За да приготвите СЛАДОЛЕД трябва да е изпълнено **ПОНЕ ЕДНО** от изискванията:
- клиентът **НЕ ТРЯБВА** да е пристрастен към захарта;
- клиентът **ТРЯБВА** да е избрал вкус ЯГОДА.


### **ФУНКЦИОНАЛНОСТ 3**

Роботът трябва да прецени на базата на избора на клиента, дали може да обработи поръчката или не може. 
- Ако поръчката може да бъде обработена, извежда утвърдително съобщение, съдържащо информация за избора на клиента.
- Ако роботът не може да я изпълни, той извежда объркващо съобщение за текущото състояние на вашите кулинарни умения и се самоунищожава. 

Програмата приключва своето изпълнение със съобщение, **благодаря ви, че хапнахте при нас.**

## ПРИМЕРЕН ИЗХОД

Ще разделим примерния вход и изход на няколко части, като ще адресираме различните функционалности.

**Функционалност 1**

**Задължителни въпроси и отговори**
Колко тигана има в кухнята?                        <br>
12                                                 <br>
Колко тенджери има в кухнята?                      <br>
4                                                  <br>
Колко сантиметра е широка кухнята?                 <br>
1500                                               <br>
Колко сантиметра е дълга кухнята?                  <br>
6500                                               <br>
Колко сантиметра е висока кухнята?                 <br>
3500                                               <br>
Как се казва главният готвач?                      <br>
Иван                                               <br>
Колко готвачи работят в кухнята?                   <br>
8                                                  <br>
Колко сервитьори работят в ресторанта?             <br>
16                                                 <br>
Каква е минималната температура в кухнята?         <br>
36                                                 <br>
Каква е максималната температура в кухнята?        <br>
48                                                 <br>
Колко парички имате в банковата си сметка?         <br>
80 000                                             <br>
Колко парички е дневният оборот на ресторанта ви?  <br>
150                                                <br>
В колко часа отваряте?                             <br>
8                                                  <br>
В колко часа затваряте?                            <br>
22                                                 <br>

**Задаване на опционални въпроси - потребителят ЖЕЛАЕ да отговаря**
Желаете ли да отговаряте на опционални въпроси? (Y/N)  <br>
Y                                                      <br>
Разполагате ли с хладилник? (Y/N)                      <br>
Y                                                      <br>
Разполагате ли с газов котлон?  (Y/N)                  <br>
Y                                                      <br>
Разполагате ли с конвектомат?  (Y/N)                   <br>
Y                                                      <br>
Разполагате ли с електрическа скара?  (Y/N)            <br>
N                                                      <br>
Разполагате ли с аспиратор?  (Y/N)                     <br>
Y                                                      <br>
Всички въпроси са зададени.

**Задаване на опционални въпроси - потребителят НЕ желае да отговаря**

Желаете ли да отговаряте на опционални въпроси? (Y/N)  <br>
N                                                      <br>
Всички въпроси са зададени.

**Функционалност 2**

Какво ще хапвате?
(1) Месо 
(2) Вегетарианско
(3) Десерт
1
Колко голяма порция предпочитате?
(1) малка  - 450 грама
(2) малка  - 750 грама
(3) голяма - 950 грама
2
Каква разновидност на изпичане желаете?
(1) RERE
(2) MEDIUM
(3) WELL DONE
3
Вашата поръчка е взета, моля изчакайте!

**Функционалност 3**
**Ако поръчката може да бъде изпълнена**

> Вашата поръчка е изпълнена успешно
> Благодаря ви, че хапнахте при нас

**Ако поръчката не може да бъде изпълнена.**
> Ресторантът не може да изпълни вашата поръчка, започваме процедура по самоунищожение.
> Благодаря ви, че хапнахте при нас.

## ЗАДАЧИ ЗА ИМПЛЕМЕНТАЦИЯ

Всяка една от разработените задачи ще се оценява в точкова система с арбитрарни тежести. Максималното количество точки, които можете да получите от решението на поставените ви условия е 100 точки.

Повече информация за предаването на вашите решения можете да намерите в секция ПРЕДАВАНЕ НА РЕШЕНИЯТА.

| функционалност                                                | точки   |
|---                                                            |---      |
| **функционалност 1**                                          | -       |
| Визуализиране и отговор на основни въпроси                    | 10      |
| Визуализиране и отговор на опционални въпроси                 | 5       |
| Възможност за пропускане на опционални въпроси                | 5       |
| **функционалност 2**                                          | -       |
| Първоначален избор от ястия                                   | 6       |
| Опции при поръчка на месо                                     | 6       |
| Условие за обработка на RARE месо                             | 6       |
| Условие за обработка на MEDIUM месо                           | 6       |
| Условие за обработка на WELL DONE месо                        | 6       |
| Опции при поръчка на вегетарианско                            | 6       |
| Условие за обработка на ВЕГЕТАРИАНСКО                         | 6       |
| Условие за обработка на ВЕГАНСКО                              | 6       |
| Условие за обработка на ПЕСКАТЕРИАНСКО                        | 6       |
| Опции при поръчка на десерт                                   | 6       |
| **функционалност 3**                                          | -       |
| изчисляване на поръчката и връщане на резултат                | 20      |

## ПРЕДАВАНЕ НА РЕШЕНИЯТА

Задължително е да си направите нов проект в GitLab-а на курса, със заглавие **pu-fmi-java-intro-w6**.