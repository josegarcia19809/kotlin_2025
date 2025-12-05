package p07_other_classes

enum class GameState {
    STARTED,
    PLAYING,
    GAME_OVER
}

fun changeState(currentState: GameState): GameState {
    return when (currentState) {
        GameState.STARTED -> GameState.PLAYING
        GameState.PLAYING -> GameState.GAME_OVER
        GameState.GAME_OVER -> GameState.STARTED
    }
}

fun main() {
    var currentState = GameState.STARTED
    for (i in 1..5) {
        println("${currentState.ordinal+1} ${currentState.name}")
        currentState = changeState(currentState)
    }
}