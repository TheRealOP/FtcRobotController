package org.firstinspires.ftc.teamcode.Meet3.Auto;

import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.arcrobotics.ftclib.hardware.*;
@Autonomous(name = "servoTest", group = "autos")
public class servoTest extends LinearOpMode {
    Servo servo;

    @Override
    public void runOpMode() throws InterruptedException {
        servo = hardwareMap.servo.get("servo");


            servo.setPosition(.5);
        sleep(5000);
        servo.setPosition(1);
        sleep(5000);



    }
}
