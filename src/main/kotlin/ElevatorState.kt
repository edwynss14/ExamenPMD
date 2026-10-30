package org.example

sealed class ElevatorState {
    data object Idle : ElevatorState()
    data object MovingUP: ElevatorState()
    data object MovingDOWN: ElevatorState()
    data object Error: ElevatorState()
}

enum class Nivel{
    GARCIA_BARBON,
    PLAZA_COMPOSTELA,
    MOVIMIENTO,
    ERROR
}


class ElevatorMachine() {
    var currentState: ElevatorState = ElevatorState.Idle
    var nivel_actual : Nivel = Nivel.GARCIA_BARBON


    fun nivel_0() {
        when (currentState) {
            ElevatorState.Idle -> {
                if (nivel_actual == Nivel.PLAZA_COMPOSTELA) {
                    currentState = ElevatorState.MovingDOWN
                    println("El ascensor está bajando...." )
                    nivel_actual = Nivel.MOVIMIENTO

                }
            }

            else -> {
                println("El ascensor no se puede ejecutar en este estado")
            }
        }
    }

    fun nivel_1() {
        when (currentState) {
            ElevatorState.Idle -> {
                if (nivel_actual == Nivel.GARCIA_BARBON) {
                    currentState = ElevatorState.MovingUP
                    println("El ascensor está subiendo...")
                    nivel_actual = Nivel.MOVIMIENTO
                }
            }

            else -> {
                println("El ascensor no puede ejecutar este estado...")
            }
        }
    }

    fun mostrarEstado() {
        println("Estado actual: " + currentState)
    }

    fun llegadaDestino() {
        when (currentState) {
            ElevatorState.MovingUP -> {
                nivel_actual = Nivel.PLAZA_COMPOSTELA
                currentState = ElevatorState.Idle
                println("El ascensor llegó a su destino... Plaza de Compostela")
            }
            ElevatorState.MovingDOWN -> {
                nivel_actual = Nivel.GARCIA_BARBON
                currentState = ElevatorState.Idle
                println("El ascensor llegó a su destino... Avenida G. Barbó")
            }
            else -> {
                println("El ascensor no se puede ejecutar en este estado...")
            }
        }
    }

    fun simularError(){
        when (currentState) {
            ElevatorState.MovingUP, ElevatorState.MovingDOWN -> {
                currentState = ElevatorState.Error
                nivel_actual = Nivel.ERROR
                println("El ascensor tuvo un error" )

            }
            else -> {
                println("No se puede simular un error en IDLE")
            }
        }
    }
    fun reset(){
        when (currentState) {
            ElevatorState.Error -> {
                nivel_actual = Nivel.GARCIA_BARBON
                currentState = ElevatorState.Idle
                println("El ascensor se encuentra parado...")
            }
            else -> {
                println("El ascensor no se puede eejecutar en este estado")
            }
        }
    }
}