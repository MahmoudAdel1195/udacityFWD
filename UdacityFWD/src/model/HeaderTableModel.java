
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class HeaderTableModel extends AbstractTableModel {   

    private List<Header>invoicesArray;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    public HeaderTableModel(List<Header>invoicesArray) {
    this.invoicesArray = invoicesArray;
     
    }

   
    @Override
    public int getRowCount() {
return invoicesArray.size();
    }
 public List<Header> getInvoicesArray() {
        return invoicesArray;
    }
   
 
    @Override
    public int getColumnCount() {
        return 4;
    }
        

    
@Override
    public String getColumnName(int columnIndex){
      switch (columnIndex) {
          case 0 :
              return "invoice Num";
          case 1 :
              return "Customer Name";
          case 2 :
              return "Invoice Date";
          case 3 :
              return "Invoice Total";
          default:
              return "";
      }
    }
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Header row =invoicesArray.get(rowIndex);
        switch(columnIndex){
            case 0: return row.getNum();
            case 1 : return row.getCustomerName();
            case 2 : return df.format(row.getDate());
            case 3 : return row.getInvTotal();
            default:
            return null;
    }
}

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
          case 0 :
              return Integer.class;
          case 1 :
              return String.class;
          case 2 :
              return String.class;
          case 3 :
              return Double.class;
          default:
              return Object.class;
    }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
    }

  

   

 }
 
