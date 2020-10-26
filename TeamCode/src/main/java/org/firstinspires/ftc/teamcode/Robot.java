package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.autos.Methods;

public class Robot {

    // Declaring DT motors
    DcMotor leftFront, rightFront, leftBack, rightBack;

    // Declare Method object?
    Methods methods;

    // Hardware map??
    HardwareMap hardMap;

    public Robot(){

        // Initialize DT Motors
        leftFront = hardMap.get(DcMotor.class , "leftFront");
        rightFront = hardMap.get(DcMotor.class , "rightFront");
        leftBack = hardMap.get(DcMotor.class , "leftBack");
        rightBack = hardMap.get(DcMotor.class , "rightBack");

        //
        leftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);



    }

}
