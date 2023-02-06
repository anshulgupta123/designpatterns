package com.anaplan.dryprinciplesdesignpatterns.utility;

import java.sql.Timestamp;

public class Utility {

    public static Timestamp getCurrenetTimestamp(){
        return new Timestamp(System.currentTimeMillis());
    }
}
