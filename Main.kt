fun main() {
    val routes = arrayOf("Барнаул", "Санкт-Петербург", "Москва", "Самара", "Владивосток", "Омск", "Новосибирск", "Екатеринбург", "Сочи", "Петрозаводск", "Ростов-на-Дону", "Казань", "Архангельск", "Тюмень", "Рязань")
    val start = routes[(0..14).random()]
    var finish = routes[(0..14).random()]
    while (start == finish) {
        finish = routes[(0..14).random()]
    }
    val passangers = (5..201).random()
    val sits = (5..25).random()
    var carriages = passangers / sits
    if (passangers % sits != 0) {
        carriages++
    }
    println("Отправляется из $start")
    println("Конечная в $finish")
    println("$passangers пассажиров")
    println("$sits сидений")
    println("$carriages вагонов")
}