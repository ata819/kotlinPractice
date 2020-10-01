fun main(args: Array<String>) {
    val name = "PlayerOne"
    var Health = 70
    val race = "gnome"
    val isImortal = false
    val isBlessed = true
    val auraVisible = isBlessed && Health > 50 || isImortal
    val auraColor = if (auraVisible) "Green" else "None"
    println(auraColor)
    val factions = when (race){
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "No race has been selected"
    }

    /*val heathStatus = if (Health in 90 .. 100){
        //println("$name is in excellent condition")
        "is in excellent condition"
    }
    else if(Health in 65 .. 89 ){
        //println("$name is in a decent condition")
        "is in a decent condition"
    }
    else if(Health in 35 .. 64){
        //println("$name is not in any good condition")
        "is not in any good condition"
    }
    else{
        //println("$name is in awful condition")
        "is in awful condition"
    }
    println("$name $heathStatus")

     */
    // Rule of thumb: Used "when" to replace "else if" loops
    val healthStatus = formatHeathStatus(Health, isBlessed)
    println("$name $healthStatus")

}

private fun formatHeathStatus(Health: Int, isBlessed: Boolean): String {
    val healthStatus = when (Health) {
        100 -> "is in excellent condition"
        in 65..89 -> if (isBlessed) {
            "is in a decent condition but can heal quickly"
        } else {
            "is in a decent condition"
        }
        in 35..64 -> "is not in any good condition"
        else -> "is in awful condition"
    }
    return healthStatus
}