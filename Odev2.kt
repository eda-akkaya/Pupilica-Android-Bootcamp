package com.example.pupilica_android_bootcamp_odev.Odev2

// Eda Akkaya
// Odev 2
class Fonksiyonlar {

    // 1-Parametre girilen dereceyi Fahrenheit'a dönüştürdükten sonra geri döndüren method:
    // 1-Method that converts the parameter to Fahrenheit and then returns it:
    fun celsiusToFahrenheit(degree:Double) : Double{
        val fahrenheit = (degree * 1.8) + 32
        return fahrenheit
    }


    // 2-Kenarları parametre olarak girilen dikdörtgenin çevresini hesaplayan method:
    // 2-Method to calculate the perimeter of a rectangle whose sides are entered as parameters:
    fun perimeterOfTriangle(edge1: Double, edge2: Double){
        println((edge1 + edge2) * 2)
    }

    // 3-Parametre olarak girilen sayının faktöriyrl değerini hesaplayıp döndüren metod:
    // 3-Method that calculates and returns the factorial value of the number entered as a parameter:
    fun factorial (number:Int) : Int {

        var result = 1

        if (number==0){
            result = 1
        }else{
            for (i in 1..number){
            result = result * i
            }
        }
        return result
    }

    // 4-Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren metod:
    // 4-Method that shows how many letters a are in the word entered as a parameter:
    fun countA ( word : String) {
        var count = 0

        for ( i in word)
            if (i == 'a' || i == 'A')
                count++
        println(count)
    }

    //1-Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren method:
    //1-Method that calculates the sum of interior angles according to the number of sides entered as a parameter and returns the result:
    fun sumOfAngles(edgeCount : Int ) : Int {
        return ((edgeCount - 2 ) * 180)
    }

    //2-Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod:
    //2-A method that calculates the salary according to the number of days entered as a parameter and returns the value obtained:
    //KURAL(RULE) : 1 günde 8 saat çalışılabilir. 160 saat üzeri mesai sayılır.
    // (Workers can work 8 hours a day. Over 160 hours is considered overtime.)
    fun calculateSalary(day: Int): Int {
        var salary = 0
        val MAX_HOUR_A_DAY = 8
        val PRICE_OF_AN_HOUR = 10
        val PRICE_OF_SHIFT_PER_HOUR = 20
        val SHIFT_LIMIT = 160

        val totalHours = MAX_HOUR_A_DAY * day

        if (totalHours <= SHIFT_LIMIT) {
            salary = totalHours * PRICE_OF_AN_HOUR
        } else {
            val normalHours = SHIFT_LIMIT
            val overtimeHours = totalHours - SHIFT_LIMIT

            salary = (normalHours * PRICE_OF_AN_HOUR) + (overtimeHours * PRICE_OF_SHIFT_PER_HOUR)
        }

        return salary
    }


    // 3-Parametre olarak girilen kota miktarına göre ücreti hesaplaayarak geri göndüren metod:
    // 3-Method that calculates the fee according to the quota amount entered as a parameter and sends it back:
    fun calculatePrice( quota: Int ) : Int {
        var price = 0

        if (quota <= 50){
            price = 50
        }else{
            price = 50 + ((quota - 50) * 4)
        }
         return price
    }

    // fun calculatePrice(quota: Int): Int =
    //    if (quota <= 50) 50 else 50 + (quota - 50) * 4


}
