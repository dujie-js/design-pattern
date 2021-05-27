package com.js.kpi;

import com.js.kpi.business.BusinessReport;
import com.js.kpi.intefaces.impl.CeoVisitor;
import com.js.kpi.intefaces.impl.CtoVisitor;

public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("CEO观看");
        businessReport.showReport(new CeoVisitor());
        System.out.println("CTO 观看");
        businessReport.showReport(new CtoVisitor());
    }
}
