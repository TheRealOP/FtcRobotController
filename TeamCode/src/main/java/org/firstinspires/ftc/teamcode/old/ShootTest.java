package org.firstinspires.ftc.teamcode.old;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.*;
import com.qualcomm.robotcore.hardware.Servo;

import java.lang.*;
import java.util.*;



@TeleOp(name = "ShootTest", group = "autos")
public class ShootTest extends OpMode {
    DcMotor leftFront, rightFront, leftBack, rightBack,shootMotor;
    Servo shoot;

    double leftWheelPower;
    double rightWheelPower;
    @Override

    public void init() {
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setDirection(DcMotor.Direction.REVERSE);


        shoot = hardwareMap.servo.get("shoot");
        shoot.setPosition(0.0);


    }

    @Override
    public void loop() {
        /*
        double forwardPower = gamepad1.right_trigger;
        double backwardsPower = -gamepad1.left_trigger;
        double wheelPower = forwardPower + backwardsPower;

        leftFront.setPower(wheelPower);
        leftBack.setPower(wheelPower);
        rightFront.setPower(wheelPower);
        rightBack.setPower(wheelPower);

        double turnPower = gamepad1.left_stick_x;
        double newWheelPower;

        if(turnPower != 0)
        {
            newWheelPower = wheelPower - turnPower;

            if (turnPower < 0) {
                leftFront.setPower(-(newWheelPower));
                leftBack.setPower(-(newWheelPower));
            } else if (turnPower > 0) {
                rightFront.setPower(newWheelPower);
                rightBack.setPower(newWheelPower);
            }
            if(wheelPower == 0)
            {
                leftFront.setPower(-newWheelPower);
                leftBack.setPower(-newWheelPower);
                rightFront.setPower(newWheelPower);
            ] rightBack.setPower(newWheelPower);

            }
        }

        double strafePower;

        strafePower = (gamepad1.right_stick_x);

        leftFront.setPower(strafePower);
        leftBack.setPower(-strafePower);
        rightFront.setPower(-strafePower);
        rightBack.setPower(strafePower);

         */


        leftWheelPower = -gamepad1.left_stick_y;
        rightWheelPower = -gamepad1.right_stick_y;

        leftFront.setPower(leftWheelPower);
        leftBack.setPower(leftWheelPower);
        rightFront.setPower(rightWheelPower);
        rightBack.setPower(rightWheelPower);

        double strafePowerRight;
        double strafePowerLeft;
        double strafePower;

        strafePowerRight = (gamepad1.right_trigger);
        strafePowerLeft = (-gamepad1.left_trigger);
        strafePower = strafePowerLeft + strafePowerRight;

        leftFront.setPower(strafePower);
        leftBack.setPower(-strafePower);
        rightFront.setPower(-strafePower);
        rightBack.setPower(strafePower);

        if(gamepad1.x)
        {
            shootMotor.setPower(1);
        }
        if(gamepad1.square)
        {
            shoot.setPosition(60);
            shoot.setPosition(0);
        }




    }
}

