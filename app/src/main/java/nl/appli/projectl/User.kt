package nl.appli.projectl

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by DUO on 17-11-2017.
 */
class User (name: String, email: String) {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Int = 0
    var name:String = ""
    var email:String = ""


    override fun toString(): String {
        return "User(name='$name', email='$email')"
    }

}