class FitMoreFish {

    fun fitMoreFish (tankSize : Int, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean{
        var remanentSize : Int =  if (hasDecorations) (tankSize * 0.8).toInt() else tankSize

        for (fish in currentFish){
             remanentSize = remanentSize - fish
        }
        return if(remanentSize - fishSize < 0) false else true
    }
}