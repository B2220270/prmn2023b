package src.main.java.jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PreExam {

    private String gakuseiCode;
    private String familyName;
    private String firstName;
    private int point;

    public PreExam(String gakuseiCode,String familyName,String firstName,int point){
        this.gakuseiCode = gakuseiCode;
        this.familyName = familyName;
        this.firstName = firstName;
        this.point = point;
    }

    public void print(){
        System.out.println(gakuseiCode+"さんは"+point+"点");
    }
}
