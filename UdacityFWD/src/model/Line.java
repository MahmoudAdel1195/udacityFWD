
package model;


public class Line {
private String iName; 
private double iPrice;
private int itemCount;
private double lineTotal;
private Header header;

    public Line(String iName, double iPrice, int itemCount, Header header) {
        this.iName = iName;
        this.iPrice = iPrice;
        this.itemCount = itemCount;
        this.header = header;
        this.setLineTotal(this.itemCount*this.iPrice);
    }

     
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public double getiPrice() {
        return iPrice;
    }

    public void setiPrice(double itemPrice) {
        this.iPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getLineTotal(){
        return lineTotal;
    }

    private void setLineTotal(double lineTotal) {
this.lineTotal = lineTotal;
  }
     public String getDataAsCSV() {
        return "" + getHeader().getNum() + "," + getiName() + "," + getiPrice() + "," + getItemCount();
    }
}
