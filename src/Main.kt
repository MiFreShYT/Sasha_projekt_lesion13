import java.lang.Math.pow

fun main()
{
println("Вас приветствуеть калькулятор Сoncole Cals ver.0.1.1")
print("Ведите первое число")
 var number1 = readLine()!!.toDouble()
print("Введите второе число")
    var number2 = readLine()!!.toDouble()
print("Выберите опирацию")
    var operation = readLine()
    when(operation)
    {
        "+"-> print("$number1$operation$number2=${number1+number2}")
        "-"-> print("$number1$operation$number2=${number1-number2}")
        "*"-> print("$number1$operation$number2=${number1*number2}")
        "/"-> print("$number1$operation$number2=${number1/number2}")
        "rt"-> print("$number1$operation$number2=${pow(number1,1/number2)}")
        "st"-> print("$number1$operation$number2=${pow(number1,number2)}")
        else ->print("Такой операции не предусмотрено")



    }






























}









































































































