# Проект по автоматизации на сайт компании "KDV Group"
> Компания <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/KDV-logo.png" width="75" height="40"> - российский производитель снеков, кондитерских изделий, чая, кофе, соков и другой вкусной продукции, которая любима в России и далеко за ее пределами.
---
## Содержание:
* Технологии и инструменты
* Список автоматизированных тест кейсов
* Команды для запуска автотестов из терминала
* Сборка в Jenkins
* Отчетность
* Уведомления в виде отчетов прохождения автотестов в Telegram
* Пример прохождения автотестов на Selenoid

---

### Технологии и инструменты:
<p align="center">
    <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/idea-logo.svg" width="70" height="70">
    <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/java-logo.svg" width="70" height="70">
    <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/github-logo.svg" width="70" height="70">
    <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/junit5-logo.svg" width="40" height="70">
    <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/gradle-logo.svg" width="70" height="70">
<img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/selenide-logo.svg" width="70" height="70">
<img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/allure-report-logo.svg" width="70" height="70">
<img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/jenkins-logo.svg" width="70" height="70">
<img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/Selenoid-logo.svg" width="70" height="70">
</p>

---

### Автоматизированные тест кейсы
1. Проверка наполненности главной страницы
2. Проверка работы блока рекомендации
3. Проверка работы блока категории
4. Проверка работы блока преимуществ КДВ
5. Проверка наполненности блока информации
6. Поиск продукта
7. Поиск несуществующего продукта

---

### Сборка в [Jenkins](https://jenkins.autotests.cloud/view/034/job/034-Morozovk_98-KDV_homework/)

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Jenkins-result.png" width="950"/></a>  
</p>

#### Параметры сборки Jenkins:

Task - Выбор списка тест кейсов \
Browser - Выбор браузера (По умолчанию Chrome) \
BrowserVersion - Выбор версии браузера (По умолчанию 128.0) \
BrowserSize - Выбор размера окна браузера (По умолчанию 1920x1080) \
RemoteUrl - Где проходят автотесты

### Команда для запуска из терминала:

> Gradle clean Guest_test \
 Gradle clean Smoke_test

### Удаленный запуск через Jenkins:

> clean \
${Task} \
-Dbrowser=${browser} \
-DremoteUrl="https://user1:1234@${remoteUrl}/wd/hub" \
-DbrowserVersion=${browserVersion} \
-DbrowserSize=${browserSize}

---

### Allure отчет

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/allure-result.png" width="950"/></a>  
</p>

#### Основная страница отчета



#### Тест кейсы

-
-
-
-
-
-
-

### Уведомление в Telegram

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Telegram-Bot.png" width="600"/></a>  
</p>

### Выполнение автотестов на Selenoid

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Selenoid-demo.gif" width="950"/></a>  
</p>









