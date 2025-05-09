# Проект по автоматизации на сайт компании "KDV Group"

> Компания <img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/KDV-logo.png" width="75" height="40"> - российский производитель снеков, кондитерских изделий, чая, кофе, соков и другой вкусной продукции, которая любима в России и далеко за ее пределами.
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
    <a href="https://www.jetbrains.com/idea/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/idea-logo.svg" width="70" height="70"></a>
    <a href="https://www.java.com/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/java-logo.svg" width="70" height="70"></a>
    <a href="https://github.com/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/github-logo.svg" width="70" height="70"></a>
    <a href="https://junit.org/junit5/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/junit5-logo.svg" width="70" height="70"></a>
    <a href="https://gradle.org/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/gradle-logo.svg" width="70" height="70"></a>
    <a href="https://selenide.org/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/selenide-logo.svg" width="70" height="70"></a>
    <a href="https://docs.qameta.io/allure/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/allure-report-logo.svg" width="70" height="70"></a>
     <a href="https://www.jenkins.io/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/jenkins-logo.svg" width="70" height="70"></a>
    <a href="https://aerokube.com/selenoid/" target="_blank"><img align="center" src="https://github.com/Morozovk/KDV_homework/blob/master/media/Selenoid-logo.svg" width="70" height="70"></a>
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

- Реалиована джоба для удаленного запуска с выбором параметров
<a id="params"></a>

#### Параметры сборки Jenkins:

Task - Выбор списка тест кейсов \
Browser - Выбор браузера (По умолчанию Chrome) \
BrowserVersion - Выбор версии браузера (По умолчанию 128.0) \
BrowserSize - Выбор размера окна браузера (По умолчанию 1920x1080) \
RemoteUrl - Где проходят автотесты


<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Jenkins-result.png" width="950"/ alt="Jenkins-result"></a>  
</p>

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

- Реализован Allure отчет, со следующими вложениями: последний скриншот, логи браузера, видео запись прохождения автотестов

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/allure-result.png" width="950"/ alt="Allure-result"></a>  
</p>

---

<a id="telegram"></a>
### Уведомление в Telegram

- Реализован бот, который после каждого прохождения автотестов присылает уведомление с информацией по успешно пройденным или упавшим автотестам

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Telegram-Bot.png" width="600"/ alt="Telegram-bot"></a>  
</p>

---

<a id="selenoid"></a>
### Выполнение автотестов на Selenoid

<p align="center">  
<img src="https://github.com/Morozovk/KDV_homework/blob/master/media/Selenoid-demo.gif" width="950"/ alt="Video Selenoid"></a>  
</p>
