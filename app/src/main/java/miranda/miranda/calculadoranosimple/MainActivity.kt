package miranda.miranda.calculadoranosimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1: Float = 0.0f
    var num1Aux: String = ""
    var todo: String = ""
    var num2Aux: String = ""
    var num2: Float = 0.0f
    var signo: String = ""
    var aux: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                numero1()


    }

    fun numero1(){
        btn_uno.setOnClickListener{
            num1Aux += "1"
            todo += "1"
            tv_num.setText(todo)
        }
        btn_dos.setOnClickListener{
            num1Aux += "2"
            todo += "2"
            tv_num.setText(todo)
        }
        btn_tres.setOnClickListener{
            num1Aux += "3"
            todo += "3"
            tv_num.setText(todo)
        }
        btn_cuatro.setOnClickListener{
            num1Aux += "4"
            todo += "4"
            tv_num.setText(todo)
        }
        btn_cinco.setOnClickListener{
            num1Aux += "5"
            todo += "5"
            tv_num.setText(todo)
        }
        btn_seis.setOnClickListener{
            num1Aux += "6"
            todo += "6"
            tv_num.setText(todo)
        }
        btn_siete.setOnClickListener{
            num1Aux += "7"
            todo += "7"
            tv_num.setText(todo)
        }
        btn_ocho.setOnClickListener{
            num1Aux += "8"
            todo += "8"
            tv_num.setText(todo)
        }
        btn_nueve.setOnClickListener{
            num1Aux += "9"
            todo += "9"
            tv_num.setText(todo)
        }
        btn_cero.setOnClickListener{
            num1Aux +="0"
            todo += "+"
            tv_num.setText(todo)
        }

        btn_sumar.setOnClickListener{
            signo="+"
            todo += " + "
            tv_num.setText(todo)
            aux++
            numero2()
        }
        btn_restar.setOnClickListener{
            signo="-"
            todo += " - "
            tv_num.setText(todo)
            aux++
            numero2()
        }
        btn_multiplicar.setOnClickListener{
            signo="*"
            todo += " * "
            tv_num.setText(todo)
            aux++
            numero2()
        }
        btn_dividir.setOnClickListener{
            signo="/"
            todo += " / "
            tv_num.setText(todo)
            aux++
            numero2()
        }

        btn_borrar.setOnClickListener{
            tv_res.setText("")
            tv_num.setText("")
            todo = ""
            num1 = 0.0f
            num2 = 0.0f
            num1Aux = ""
            num2Aux = ""
        }

    }

    fun numero2(){
        btn_uno.setOnClickListener{
            num2Aux += "1"
            todo += "1"
            tv_num.setText(todo)
        }
        btn_dos.setOnClickListener{
            num2Aux += "2"
            todo += "2"
            tv_num.setText(todo)
        }
        btn_tres.setOnClickListener{
            num2Aux += "3"
            todo += "3"
            tv_num.setText(todo)
        }
        btn_cuatro.setOnClickListener{
            num2Aux += "4"
            todo += "4"
            tv_num.setText(todo)
        }
        btn_cinco.setOnClickListener{
            num2Aux += "5"
            todo += "5"
            tv_num.setText(todo)
        }
        btn_seis.setOnClickListener{
            num2Aux += "6"
            todo += "6"
            tv_num.setText(todo)
        }
        btn_siete.setOnClickListener{
            num2Aux += "7"
            todo += "7"
            tv_num.setText(todo)
        }
        btn_ocho.setOnClickListener{
            num2Aux += "8"
            todo += "8"
            tv_num.setText(todo)
        }
        btn_nueve.setOnClickListener{
            num2Aux += "9"
            todo += "9"
            tv_num.setText(todo)
        }
        btn_cero.setOnClickListener{
            num2Aux +="0"
            todo += "0"
            tv_num.setText(todo)
        }

        btn_igual.setOnClickListener{
            num1 = num1Aux.toFloat()
            num2 = num2Aux.toFloat()

                when(signo){
                "+" -> tv_res.setText((num1+num2).toString())
                "*" -> tv_res.setText((num1*num2).toString())
                "/" -> if(num2 != 0.0f){ tv_res.setText((num1/num2).toString())} else {Toast.makeText(this,"Error division entre 0", Toast.LENGTH_LONG).show()}
                "-" -> tv_res.setText((num1-num2).toString())
            }

        }

        btn_borrar.setOnClickListener{
            tv_res.setText("")
            tv_num.setText("")
            todo = ""
            num1 = 0.0f
            num2 = 0.0f
            num1Aux = ""
            num2Aux = ""
            numero1()
        }


    }

}