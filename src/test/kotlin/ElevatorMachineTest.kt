import org.example.ElevatorMachine
import org.example.ElevatorState
import org.example.Nivel
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ElevatorMachineTest {
    @Test
    fun getCurrentState() {
    }

    @Test
    fun setCurrentState() {
    }

    @Test
    fun getNivel_actual() {
    }

    @Test
    fun setNivel_actual() {
    }

    @Test
    fun nivel_0() {
        val maquina = ElevatorMachine()

        maquina.nivel_1()
        maquina.llegadaDestino()
        maquina.nivel_0()

        assertEquals(ElevatorState.MovingDOWN, maquina.currentState)
        assertEquals(Nivel.MOVIMIENTO, maquina.nivel_actual)
    }

    @Test
    fun nivel_1() {
        val maquina = ElevatorMachine()

        maquina.nivel_1()

        assertEquals(ElevatorState.MovingUP, maquina.currentState)
        assertEquals(Nivel.MOVIMIENTO, maquina.nivel_actual)
    }

    @Test
    fun mostrarEstado() {
        val maquina = ElevatorMachine()

        assertDoesNotThrow {
            maquina.mostrarEstado()
    }

    @Test
    fun llegadaDestino() {
        val maquina = ElevatorMachine()

        maquina.nivel_1()
        maquina.llegadaDestino()

        assertEquals(ElevatorState.Idle, maquina.currentState)
        assertEquals(Nivel.PLAZA_COMPOSTELA, maquina.nivel_actual)

        maquina.nivel_0()
        maquina.llegadaDestino()

        assertEquals(ElevatorState.Idle, maquina.currentState)
        assertEquals(Nivel.GARCIA_BARBON, maquina.nivel_actual)
    }
    }

    @Test
    fun simularError() {
        fun simularError() {
            val maquina = ElevatorMachine()

            maquina.nivel_1()
            maquina.simularError()

            assertEquals(ElevatorState.Error, maquina.currentState)
            assertEquals(Nivel.ERROR, maquina.nivel_actual)
        }

        @Test
        fun reset() {
            val maquina = ElevatorMachine()

            maquina.nivel_1()
            maquina.simularError()
            maquina.reset()

            assertEquals(ElevatorState.Idle, maquina.currentState)
            assertEquals(Nivel.GARCIA_BARBON, maquina.nivel_actual)
        }
    }
}