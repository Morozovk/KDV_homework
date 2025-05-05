# Проект по автоматизации на сайт компании "KDV Group"
> Компания <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/images/KDV-logo.png" width="75" height="40"> - российский производитель снеков, кондитерских изделий, чая, кофе, соков и другой вкусной продукции, которая любима в России и далеко за ее пределами.
---
## Содержание:
* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Автоматизированные тест кейсы</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Команда для запуска из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление в Telegram</a>

* <a href="#selenoid">Выполнение автотестов на Selenoid</a>
---

<a id="tools"></a>
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

<a id="cases"></a>
### Автоматизированные тест кейсы
- Проверка наполненности главной страницы
- Проверка работы блока рекомендации
- Проверка работы блока категории
- Проверка работы блока преимуществ КДВ
- Проверка наполненности блока информации
- Поиск продукта
- Поиск несуществующего продукта

---

<a id="jenkins"></a>
### Сборка в [Jenkins](https://jenkins.autotests.cloud/view/034/job/034-Morozovk_98-KDV_homework/)

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Jenkins-result.png" width="950"/ alt="Jenkins-result"></a>  
</p>

<a id="params"></a>
#### Параметры сборки Jenkins:

Task - Выбор списка тест кейсов \
Browser - Выбор браузера (По умолчанию Chrome) \
BrowserVersion - Выбор версии браузера (По умолчанию 128.0) \
BrowserSize - Выбор размера окна браузера (По умолчанию 1920x1080) \
RemoteUrl - Где проходят автотесты

<a id="console"></a>
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

<a id="allure"></a>
### Allure отчет

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/allure-result.png" width="950"/ alt="Allure-result"></a>  
</p>

---

<a id="telegram"></a>
### Уведомление в Telegram

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Telegram-Bot.png" width="600"/ alt="Telegram-bot"></a>  
</p>

---

<a id="selenoid"></a>
### Выполнение автотестов на Selenoid

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Selenoid-demo.gif" width="950"/ alt="Video Selenoid"></a>  
</p>









