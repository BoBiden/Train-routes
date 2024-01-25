//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
    {
    var n=0
    println("Введите 'Пуск' или 'Стоп'")
        var command= readln()
        while(n==0){
            var routes = arrayOf("Барнаул", "Санкт-Петербург", "Москва", "Самара", "Владивосток", "Омск", "Новосибирск", "Екатеринбург", "Сочи", "Петрозаводск", "Ростов-на-Дону", "Казань", "Архангельск", "Тюмень", "Рязань")
            var start = routes[(0..14).random()]
            var finish = routes[(0..14).random()]
            while (start == finish) {
                finish = routes[(0..14).random()]
            }
            var passangers = (5..201).random()
            var sits = (5..25).random()
            var carriages = passangers / sits
            if (passangers % sits != 0) {
                carriages++
            }
            println("Отправляется из $start")
            println("Конечная в $finish")
            println("$passangers пассажиров")
            println("$sits сидений")
            println("$carriages вагонов")
            println("Введите 'Пуск' или 'Стоп'")
            command= readln()
            if (command=="Стоп"){
                n++
            }
        }
    }
