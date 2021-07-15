Инстуркция по запуску:  

1. Запустить docker-compose up
2. Запустить тесты gradlew test --rerun-tasks
4. Ввести команду gradlew allureReport  

Для просмотра действий тестов перейти на localhost:8080  
Для просмотра отчета перейти на localhost:5252  

Чтобы отчистить историю нужно:  
1)перейти на localhost:5252  и кликнуть на кнопку Clean Results  
2)удалить папку build/allure-results  
3)Ввести команду gradlew allureReport