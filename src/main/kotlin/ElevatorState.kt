package org.example

sealed class ElevatorState {
    data object IDLE : ElevatorState()
    data object MOVING_UP: ElevatorState()
    data object MOVING_DOWN: ElevatorState()
    data object ERROR: ElevatorState()
    data class LEVELS(val level: Int) : ElevatorState()
}

class ElevatorMachine(){
    var currentState: ElevatorState = ElevatorState.IDLE

    fun mostrarEstado(){
        println("Estado actual: " + currentState)
    }


}