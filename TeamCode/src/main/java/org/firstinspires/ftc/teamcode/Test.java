package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name = "autoTest2",group = "autos")

public class Test extends LinearOpMode {

    Robot robot = new Robot();
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        while (opModeIsActive()){
            robot.leftFront.setTargetPosition(28*10);
            robot.rightFront.setTargetPosition(28*10);
            robot.leftBack.setTargetPosition(28*10);
            robot.rightBack.setTargetPosition(28*10);
            while(!(robot.leftFront.atTargetPosition() && robot.rightFront.atTargetPosition() && robot.leftBack.atTargetPosition() && robot.rightBack.atTargetPosition())){
                robot.leftFront.set(0.25);
                robot.rightFront.set(0.25);
                robot.leftBack.set(0.25);
                robot.rightBack.set(0.25);
            }
            robot.leftFront.set(0);
            robot.rightFront.set(0);
            robot.leftBack.set(0);
            robot.rightBack.set(0);

        }
    }
}