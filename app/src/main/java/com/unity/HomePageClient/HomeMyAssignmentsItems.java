package com.unity.HomePageClient;

import java.io.Serializable;

public class HomeMyAssignmentsItems implements Serializable {
    public String assignmentType, inCharge, createdBy, company, note, status;
    public int id, inChargeID, companyID, createdByID;
    public boolean photo, pdf;
    public String date, time;
    public int urgencyNumber;
    public String urgency;
    public boolean guarantee, service_price, bill;
    public String finishNote, finishDate, finishTime, title, due_date, due_time;


    public HomeMyAssignmentsItems() {
    }

    public HomeMyAssignmentsItems(String assignmentType, String inCharge, String createdBy, String company, String note, String status, int id, int inChargeID, int companyID, int createdByID, boolean photo, boolean pdf, String date, String time, int urgencyNumber,
                                  String urgency, boolean guarantee, boolean service_price, boolean bill, String finishNote, String finishDate, String finishTime, String title,
                                  String due_date, String due_time) {
        this.assignmentType = assignmentType;
        this.inCharge = inCharge;
        this.createdBy = createdBy;
        this.company = company;
        this.note = note;
        this.status = status;
        this.id = id;
        this.inChargeID = inChargeID;
        this.companyID = companyID;
        this.createdByID = createdByID;
        this.photo = photo;
        this.pdf = pdf;
        this.date = date;
        this.time = time;
        this.urgencyNumber = urgencyNumber;
        this.urgency = urgency;
        this.guarantee = guarantee;
        this.service_price = service_price;
        this.bill = bill;
        this.finishNote = finishNote;
        this.finishDate = finishDate;
        this.finishTime = finishTime;
        this.title = title;
        this.due_date = due_date;
        this.due_time = due_time;
    }

    public String getAssignmentType() {
        return assignmentType;
    }

    public String getInCharge() {
        return inCharge;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCompany() {
        return company;
    }

    public String getNote() {
        return note;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public int getInChargeID() {
        return inChargeID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public int getCreatedByID() {
        return createdByID;
    }

    public boolean isPhoto() {
        return photo;
    }

    public boolean isPdf() {
        return pdf;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getUrgencyNumber() {
        return urgencyNumber;
    }

    public String getUrgency() {
        return urgency;
    }

    public boolean isGuarantee() {
        return guarantee;
    }

    public boolean isService_price() {
        return service_price;
    }

    public boolean isBill() {
        return bill;
    }

    public String getFinishNote() {
        return finishNote;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public String getTitle() {
        return title;
    }
}
