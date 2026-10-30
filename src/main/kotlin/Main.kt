package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val ascensor = ElevatorMachine()

    ascensor.mostrarEstado()
    ascensor.nivel_1()
    ascensor.mostrarEstado()
    ascensor.llegadaDestino()
    ascensor.mostrarEstado()
    ascensor.nivel_0()
    ascensor.mostrarEstado()
    ascensor.reset()
    ascensor.mostrarEstado()
    ascensor.llegadaDestino()
    ascensor.simularError()
    ascensor.mostrarEstado()
    ascensor.nivel_1()
    ascensor.simularError()
    ascensor.reset()
    ascensor.mostrarEstado()
    ascensor.nivel_1()
    ascensor.mostrarEstado()
    ascensor.simularError()
    ascensor.reset()
    ascensor.nivel_0()
    ascensor.mostrarEstado()
    ascensor.nivel_1()
    ascensor.mostrarEstado()
    ascensor.llegadaDestino()
    ascensor.mostrarEstado()
    ascensor.nivel_0()
    ascensor.mostrarEstado()
    ascensor.llegadaDestino()


}