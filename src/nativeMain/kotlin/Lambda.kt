class Lambda {
//    Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
//    Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
//    If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
//    Create a new variable, rollDice2, for this same lambda using the function type notation.


    var rollDice : (Int) -> Int = { number -> if(number != 0) (0..12).random() else 0}

    var rollDice2 = fun (number : Int) : Int{
        if(number != 0) return (0..12).random() else return 0
    }

    fun gamePlay(diceRoll: Int){
        println(diceRoll)
    }

    //gameplay(rollDice(2))
}