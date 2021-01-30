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



@TeleOp(name = "TeleTestTwo", group = "autos")
public class TeleTestTwo extends OpMode {
    DcMotor leftFront, rightFront, leftBack, rightBack, intakeMotor, lyftMotor,shootMotor;
    Servo servo;
    public Servo shoot = null;
    @Override

    public void init() {
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setDirection(DcMotor.Direction.REVERSE);

        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        lyftMotor = hardwareMap.dcMotor.get("lyftMotor");

        shoot = hardwareMap.servo.get("shoot");
        shoot.setPosition(0.0);


    }


    @Override
    public void loop() {
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
             rightBack.setPower(newWheelPower);

            }
        }

            double strafePower;

            strafePower = (gamepad1.right_stick_x);

            leftFront.setPower(strafePower);
            leftBack.setPower(-strafePower);
            rightFront.setPower(-strafePower);
            rightBack.setPower(strafePower);

            if(gamepad1.left_bumper)
            {
                intakeMotor.setPower(.5);
            }
            if(gamepad1.right_bumper)
            {
                intakeMotor.setPower(-.5);
            }
            if(gamepad1.cross)
            {
                shoot.setPosition(60);
            }




        }
    }

