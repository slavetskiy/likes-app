fun main() {
    println("Введите количество лайков")
    val likes = readLine()!!.toInt()
    val people: String = if ((likes % 10 == 1) && (likes != 11)) "человеку" else "человекам"
    print("Понравилось $likes $people")
}