/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {

        public static double kWheelDiameter = 6;   // inches
        public static double kTrackWidth = 30;     // inches

        public static double kPi = Math.PI;         // for the sake of consistency..?
        
        // calculations
        public static double kWheelCircumference = kWheelDiameter * kPi;

        /**
         * The constants for the drive motors in {@link RobotMap}
         */
        public static int kLeftGearboxLeftMotor = 10;
        public static int kRightGearboxLeftMotor = 20;
        public static int kLeftGearboxRightMotor = 30;
        public static int kRightGearboxRightMotor = 40;

        /**
         * The constants for the solenoids for the gearboxes
         */
        public static int kSpeedMode = 0;
        public static int kTorqueMode = 1;

    }

    public static final class OIConstants {

        public static int kLeftJoystick = 0;
        public static int kRightJoystick = 1;

        public static int kGearboxShiftButton = 1;

        public static int kToolOp = 2;

    }

    public static final class SubsystemConstants {

        public static int kControlPanelSpinner = 8;
        public static int kPowerCellGateLeft = 4;
        public static int kPowerCellGateRight = 5;

    }

}
