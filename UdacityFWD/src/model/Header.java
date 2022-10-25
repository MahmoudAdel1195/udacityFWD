
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Header {
  private int Num;
private String customerName;
private Date Date;
private ArrayList<Line> lines;



    public Header(int invNum, String customerName, Date invDate) {
        this.Num = invNum;
        this.customerName = customerName;
        this.Date = invDate;
       // this.lines = new ArrayList<>();
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date invDate) {
        this.Date = invDate;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int invNum) {
        this.Num = invNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        String str="InvoiceFram1{" + "invNum=" + Num + ", customerName=" + customerName + ", invDate=" + Date + '}' ;
       for(Line line: getLines()){
           str += "\n\t" + line;
       } 
        return str;
    }

    public ArrayList<Line> getLines() {
        if (lines == null)
            lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (Line line : getLines()){
            total += line.getLineTotal();
        }
        return total;
    }

     public void addInvLine(Line line){
        getLines().add(line);
        
     }
 public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getNum() + "," + df.format(getDate()) + "," + getCustomerName();
}
}
