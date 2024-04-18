package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase
import edu.wpi.first.wpilibj.DutyCycleEncoder
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard

class KtSubsystem() : SubsystemBase() {
    private val encoder = DutyCycleEncoder(0)
    
    init {
        encoder.setDistancePerRotation(4.0)    
    }

    override fun periodic() {
        SmartDashboard.putNumber("Encoder value",encoder.get())
        SmartDashboard.putData(this)
    }
}