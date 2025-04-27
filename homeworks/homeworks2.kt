// 1.
fun celsiusToFahrenheit(celsius: Double): Double 
{
    return celsius * 1.8 + 32
}


// 2.
fun calculatePerimeterRectangle(lenght: Double, width: Double): Double
{
    return lenght*2 + width*2
}
var text = "lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
fun main() 
{
    // 1.
    var celsius = 30.0 
    var fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius°C is equal to $fahrenheit°F.")


    // 2.
    var lenght = 5
    var width = 10
    var perimeterRectangle = calculatePerimeterRectangle(lenght, width)
    println("Perimeter of rectangle is $perimeterRectangle.")

}