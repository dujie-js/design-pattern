package com.js.kpi.business;

import com.js.kpi.abstrat.Employee;
import com.js.kpi.abstrat.impl.Engineer;
import com.js.kpi.abstrat.impl.Manager;
import com.js.kpi.intefaces.IVisitor;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {

    private List<Employee> employeeList = new LinkedList<>();

    public BusinessReport() {
        employeeList.add(new Manager("经理A"));
        employeeList.add(new Engineer("工程师A"));
        employeeList.add(new Engineer("工程师B"));
        employeeList.add(new Engineer("工程师C"));
        employeeList.add(new Manager("经理B"));
        employeeList.add(new Engineer("工程师D"));
    }

    public void showReport(IVisitor visitor) {
        for (Employee employee : employeeList) {
            employee.accept(visitor);
        }
    }
}
