package com.example.kotlindersleri
// 1.

// 1.1
fun celsiusToFahrenheit(celsius: Double): Double
{
    return celsius * 1.8 + 32
}


// 1.2
fun calculatePerimeterRectangle(length: Double, width: Double): Double
{
    return length*2 + width*2
}


// 1.3
fun factorial(number: Int):Int
{
    var factorial = 1
    for (i in 1..number)
    {
        factorial *= i
    }
    return factorial
}


// 1.4
fun countChar(text: String, search: String): Int
{
    var counter = 0
    for (x in text)
    {
        if (x.toString() == search)
        {
            counter++
        }
    }

    return counter
}

// 2.

// 2.1
fun sumInteriorAngles(edges:Int ):Int
{
    if (edges < 3)
    {
        println("The number of sides cannot be less than 3!")
        return 0
    }
    else
    {
        return (edges - 2)*180
    }
}

// 2.2
fun calculateSalary(workingDay: Int):Int
{
    var salary = 0
    var workingHour = workingDay*8
    if (workingHour <= 160)
    {
        return workingHour*10

    }
    else
    {
        return 160*10 + (workingHour-160)*20
    }

}


// 2.3
fun tariffFee(quota: Int):Int
{
    if (quota <= 50)
    {
        return 100

    }
    else
    {
        return (quota-50)*4 + 100
    }
}


fun main()
{
    // 1.1
    var celsius = 30.0
    var fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius°C is equal to $fahrenheit°F.")


    // 1.2
    var length = 5.0
    var width = 10.0
    var perimeterRectangle = calculatePerimeterRectangle(length, width)
    println("Perimeter of rectangle is $perimeterRectangle.")


    // 1.3
    var number = 5
    var factorial = factorial(number)
    println("${number}! is ${factorial}.")


    // 1.4
    var text = "A lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
    var search = "a"
    var count = countChar(text.lowercase(), search)
    println("The letter ${search} appears ${count} times in the text.")


    // 2.1
    var edges = 3
    println("Sum of interior angles is ${sumInteriorAngles(edges)}.")


    // 2.2
    var workingDay = 21
    println("Your salary according to the number of days worked is ${calculateSalary(workingDay)}TL")


    //2.3
    var quota = 60
    println("Tariff fee according to your quota is ${tariffFee(quota)}TL")

}