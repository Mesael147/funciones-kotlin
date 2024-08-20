import kotlin.math.pow
import kotlin.math.sqrt
// Daniel Santiago Medrano Gomez
fun main() {
    raiz()
    cuadrado()
    var estado=true
    while (estado){
        println("1.suma")
        println("2.resta")
        println("3.raiz")
        println("4.cuadrado")
        println("5.division")
        println("6.multiplicacion")
        println("7.salir del menu")
        println("digite opcion")
        var opciones= readln().toInt()

        if (opciones==1){
            suma()
        }else if (opciones==2){
            resta()
        }else if (opciones==3){
            println("la raiz del numero es ${raiz()}")
        }else if (opciones==4){
            println("el cuadrado del numero es${cuadrado()}")
        }else if (opciones==5){
            division(12.0,2.0)
        }else if (opciones==6){
            println(multi(4.0,5.0))
        }else if (opciones==7){
            break
        }

    }

}
var n1=12.0
var n2= 6.0
fun suma(){
    var suma=n1+n2
    println("la suma es $suma")

}
fun resta(){
    var resta= n1-n2
    println("la resta es: $resta")
}
fun raiz():Double{
    return sqrt(n1)


}
fun cuadrado():Double{
    return n1.pow(2.0)
}

fun division (numero1:Double, numero2:Double){
    var div=numero1/numero2
    println("la division es $div")

}
fun multi(num1:Double,num2:Double):String{
    return "la multiplicacion es:${num1*num2}"
}